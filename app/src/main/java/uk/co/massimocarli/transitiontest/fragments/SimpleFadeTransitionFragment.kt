package uk.co.massimocarli.transitiontest.fragments

import androidx.transition.Fade
import androidx.transition.Transition

class SimpleFadeTransitionFragment : SimpleTransitionFragment("Fade Transition Example") {

  override fun getTransition(): Transition = Fade().apply {
    duration = TRANSITION_DURATION
    // startDelay = 300L
  }
}