package uk.co.massimocarli.transitiontest.fragments

import androidx.transition.ChangeTransform
import androidx.transition.Transition

class ChangeTransformTransitionFragment : SimpleTransitionFragment("ChangeTransform Example") {

  override fun getTransition(): Transition = ChangeTransform().apply {
    duration = TRANSITION_DURATION
    // startDelay = 300L
  }
}