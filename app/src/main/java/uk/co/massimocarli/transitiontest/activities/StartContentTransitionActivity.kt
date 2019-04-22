package uk.co.massimocarli.transitiontest.activities

import android.annotation.TargetApi
import android.app.ActivityOptions
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.transition.ChangeImageTransform
import android.transition.Explode
import android.transition.Fade
import android.transition.Slide
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.Window
import androidx.appcompat.app.AppCompatActivity
import uk.co.massimocarli.transitiontest.R


class StartContentTransitionActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    window.requestFeature(Window.FEATURE_CONTENT_TRANSITIONS)
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_start_content_transition)
    setTitle(R.string.content_transition_title)
    window.run {
      exitTransition = Explode()
      enterTransition = Slide()
      reenterTransition = Fade()
      returnTransition = ChangeImageTransform()
    }
  }

  override fun onCreateOptionsMenu(menu: Menu): Boolean {
    val menuInflater = MenuInflater(this)
    menuInflater.inflate(R.menu.menu_actions, menu)
    return super.onCreateOptionsMenu(menu)
  }

  @TargetApi(Build.VERSION_CODES.LOLLIPOP)
  override fun onOptionsItemSelected(item: MenuItem): Boolean {
    val intent = Intent(this, EndContentTransitionActivity::class.java)
    startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle())
    return super.onOptionsItemSelected(item)
  }
}
