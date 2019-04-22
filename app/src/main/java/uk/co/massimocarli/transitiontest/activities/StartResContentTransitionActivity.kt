package uk.co.massimocarli.transitiontest.activities

import android.annotation.TargetApi
import android.app.ActivityOptions
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import uk.co.massimocarli.transitiontest.R


class StartResContentTransitionActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_start_content_transition)
    setTitle(R.string.content_transition_title)
  }

  override fun onCreateOptionsMenu(menu: Menu): Boolean {
    val menuInflater = MenuInflater(this)
    menuInflater.inflate(R.menu.menu_actions, menu)
    return super.onCreateOptionsMenu(menu)
  }

  @TargetApi(Build.VERSION_CODES.LOLLIPOP)
  override fun onOptionsItemSelected(item: MenuItem): Boolean {
    val intent = Intent(this, EndResContentTransitionActivity::class.java)
    startActivity(
      intent,
      ActivityOptions.makeSceneTransitionAnimation(this).toBundle()
    )
    return super.onOptionsItemSelected(item)
  }
}
