package uk.co.massimocarli.transitiontest.fragments

import androidx.transition.Slide
import androidx.transition.Transition

class SlideTransitionFragment : SimpleTransitionFragment("Slide Transition Example") {

  override fun getTransition(): Transition = Slide().apply {
    duration = TRANSITION_DURATION
    // startDelay = 300L
  }
}