package uk.co.massimocarli.transitiontest.fragments

import androidx.transition.Transition
import androidx.transition.TransitionManager
import kotlinx.android.synthetic.main.fragment_simple_transition.*
import uk.co.massimocarli.transitiontest.R

abstract class SimpleTransitionFragment(exampleTitle: String) : BaseTransitionFragment(exampleTitle) {

  /**
   * The duration for this transition
   */
  protected val TRANSITION_DURATION = 5000L

  override fun startTransition() {
    // We create the endScene
    context?.let { ctx ->
      val endScene = androidx.transition.Scene.getSceneForLayout(
        rootView,
        getDestLayout(),
        ctx
      )
      TransitionManager.go(endScene, getTransition())
    }
  }

  abstract fun getTransition(): Transition

  open fun getDestLayout(): Int = R.layout.fragment_simple_transition_dest
}