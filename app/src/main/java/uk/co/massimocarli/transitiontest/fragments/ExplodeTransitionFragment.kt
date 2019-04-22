package uk.co.massimocarli.transitiontest.fragments

import androidx.transition.Explode
import androidx.transition.Transition

class ExplodeTransitionFragment : SimpleTransitionFragment("Explode Transition Example") {

  override fun getTransition(): Transition = Explode().apply {
    duration = TRANSITION_DURATION
    // startDelay = 300L
  }
}