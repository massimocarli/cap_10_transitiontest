package uk.co.massimocarli.transitiontest.activities

import android.annotation.TargetApi
import android.app.ActivityOptions
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.transition.ChangeBounds
import android.view.*
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_start_shared_transition.*
import uk.co.massimocarli.transitiontest.R

class StartSharedTransitionActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    window.requestFeature(Window.FEATURE_CONTENT_TRANSITIONS)
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_start_shared_transition)
    window.run {
      exitTransition = ChangeBounds()
      enterTransition = ChangeBounds()
    }
  }

  override fun onCreateOptionsMenu(menu: Menu): Boolean {
    val menuInflater = MenuInflater(this)
    menuInflater.inflate(R.menu.menu_actions, menu)
    return super.onCreateOptionsMenu(menu)
  }

  @TargetApi(Build.VERSION_CODES.LOLLIPOP)
  override fun onOptionsItemSelected(item: MenuItem): Boolean {
    val intent = Intent(this, EndSharedTransitionActivity::class.java)
    /*
    val options = ActivityOptions.makeSceneTransitionAnimation(
      this,
      imageView,
      "shared_image"
    )
    */

    val pair = android.util.Pair<View, String>(imageView, "shared_image")
    val options = ActivityOptions.makeSceneTransitionAnimation(
      this,
      pair
    )

    startActivity(intent, options.toBundle())
    return super.onOptionsItemSelected(item)
  }

}
