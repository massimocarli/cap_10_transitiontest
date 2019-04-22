package uk.co.massimocarli.transitiontest.fragments

import androidx.transition.AutoTransition
import androidx.transition.Transition

class AutoTransitionFragment : SimpleTransitionFragment("Auto Transition Example") {

  override fun getTransition(): Transition = AutoTransition().apply {
    duration = TRANSITION_DURATION
    // startDelay = 300L
  }
}