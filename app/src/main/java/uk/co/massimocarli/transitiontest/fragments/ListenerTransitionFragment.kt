package uk.co.massimocarli.transitiontest.fragments

import android.widget.Toast
import androidx.transition.Slide
import androidx.transition.Transition

class ListenerTransitionFragment : SimpleTransitionFragment("Listener Transition Example") {

  override fun getTransition(): Transition = Slide().apply {
    duration = TRANSITION_DURATION
    // startDelay = 300L
  }.addListener(object : Transition.TransitionListener {
    override fun onTransitionEnd(transition: Transition) {
      showToast("onTransitionEnd")
    }

    override fun onTransitionResume(transition: Transition) {
      showToast("onTransitionResume")
    }

    override fun onTransitionPause(transition: Transition) {
      showToast("onTransitionPause")
    }

    override fun onTransitionCancel(transition: Transition) {
      showToast("onTransitionCancel")
    }

    override fun onTransitionStart(transition: Transition) {
      showToast("onTransitionStart")
    }
  })

  private fun showToast(msg: String) =
    Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
}