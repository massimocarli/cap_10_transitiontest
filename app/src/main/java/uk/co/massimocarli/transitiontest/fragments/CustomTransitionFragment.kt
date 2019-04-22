package uk.co.massimocarli.transitiontest.fragments

import androidx.transition.Transition
import uk.co.massimocarli.transitiontest.R
import uk.co.massimocarli.transitiontest.transition.CustomTransition

class CustomTransitionFragment : SimpleTransitionFragment("Custom Transition Example") {

  override fun getTransition(): Transition = CustomTransition()

  override fun getLayoutId(): Int = R.layout.fragment_custom_transition

  override fun getDestLayout(): Int = R.layout.fragment_custom_transition_dest
}