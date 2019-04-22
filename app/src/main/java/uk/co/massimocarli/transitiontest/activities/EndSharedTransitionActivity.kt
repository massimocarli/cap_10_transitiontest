package uk.co.massimocarli.transitiontest.activities

import android.os.Bundle
import android.view.Window
import androidx.appcompat.app.AppCompatActivity
import uk.co.massimocarli.transitiontest.R

class EndSharedTransitionActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    window.requestFeature(Window.FEATURE_CONTENT_TRANSITIONS)
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_end_shared_transition)
    setTitle(R.string.content_transition_title)
  }

}