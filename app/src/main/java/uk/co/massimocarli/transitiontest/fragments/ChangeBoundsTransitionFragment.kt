package uk.co.massimocarli.transitiontest.fragments

import androidx.transition.ChangeBounds
import androidx.transition.Transition

class ChangeBoundsTransitionFragment : SimpleTransitionFragment("Change Bounds Example") {
  override fun getTransition(): Transition = ChangeBounds().apply {
    duration = TRANSITION_DURATION
  }

}