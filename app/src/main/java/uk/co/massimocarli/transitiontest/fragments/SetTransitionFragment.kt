package uk.co.massimocarli.transitiontest.fragments

import androidx.transition.Transition
import androidx.transition.TransitionInflater
import uk.co.massimocarli.transitiontest.R

class SetTransitionFragment : SimpleTransitionFragment("Set Transition Example") {

  override fun getTransition(): Transition =
    TransitionInflater.from(context)
      .inflateTransition(R.transition.transition_set).apply {
        duration = TRANSITION_DURATION
      }
}