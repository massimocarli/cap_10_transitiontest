package uk.co.massimocarli.transitiontest.fragments

import androidx.transition.ChangeImageTransform
import androidx.transition.Transition

class ChangeImageTransformTransitionFragment : SimpleTransitionFragment("ChangeImageTransform Example") {

  override fun getTransition(): Transition = ChangeImageTransform().apply {
    duration = TRANSITION_DURATION
    // startDelay = 300L
  }
}