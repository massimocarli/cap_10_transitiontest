package uk.co.massimocarli.transitiontest.fragments

import androidx.transition.Transition
import androidx.transition.TransitionInflater
import uk.co.massimocarli.transitiontest.R

class ResourceTransitionFragment : SimpleTransitionFragment("Resource Transition Example") {
  override fun getTransition(): Transition =
    TransitionInflater.from(context)
      .inflateTransition(R.transition.change_bounds).apply {
        duration = TRANSITION_DURATION
      }
}