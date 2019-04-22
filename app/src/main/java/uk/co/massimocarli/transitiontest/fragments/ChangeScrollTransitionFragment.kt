package uk.co.massimocarli.transitiontest.fragments

import androidx.transition.ChangeScroll
import androidx.transition.Transition

class ChangeScrollTransitionFragment : SimpleTransitionFragment("ChangeScroll Example") {

  override fun getTransition(): Transition = ChangeScroll().apply {
    duration = TRANSITION_DURATION
    // startDelay = 300L
  }
}