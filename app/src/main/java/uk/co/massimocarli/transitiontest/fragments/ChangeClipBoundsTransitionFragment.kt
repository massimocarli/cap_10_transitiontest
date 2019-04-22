package uk.co.massimocarli.transitiontest.fragments

import androidx.transition.ChangeClipBounds
import androidx.transition.Transition

class ChangeClipBoundsTransitionFragment : SimpleTransitionFragment("ChangeClipBounds Example") {

  override fun getTransition(): Transition = ChangeClipBounds().apply {
    duration = TRANSITION_DURATION
  }
}