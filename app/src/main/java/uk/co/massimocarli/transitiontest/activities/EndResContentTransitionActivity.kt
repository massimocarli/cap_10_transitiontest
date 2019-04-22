package uk.co.massimocarli.transitiontest.activities

import android.annotation.TargetApi
import android.os.Build
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import uk.co.massimocarli.transitiontest.R

class EndResContentTransitionActivity : AppCompatActivity() {

  @TargetApi(Build.VERSION_CODES.LOLLIPOP)
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_end_content_transition)
    setTitle(R.string.content_transition_title)
  }
}