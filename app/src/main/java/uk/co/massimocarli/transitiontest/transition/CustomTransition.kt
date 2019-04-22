package uk.co.massimocarli.transitiontest.transition

import android.animation.Animator
import android.animation.ArgbEvaluator
import android.animation.ValueAnimator
import android.graphics.drawable.ColorDrawable
import android.view.ViewGroup
import androidx.transition.Transition
import androidx.transition.TransitionValues
import uk.co.massimocarli.transitiontest.R

class CustomTransition : Transition() {

  companion object {
    const val KEY_BACKGROUND = "uk.co.maxcarli.transitiontest:CustomTransition:background"
  }

  override fun captureStartValues(transitionValues: TransitionValues) {
    val view = transitionValues.view
    // We save the current background color into the map
    if (view.id == R.id.custom_view) {
      val colorDrawable = view.background as ColorDrawable
      transitionValues.values[KEY_BACKGROUND] = colorDrawable.color
    }
  }

  override fun captureEndValues(transitionValues: TransitionValues) {
    // We know we have one View in the layout
    val view = transitionValues.view
    // We save the current background color into the map
    if (view.id == R.id.custom_view) {
      val colorDrawable = view.background as ColorDrawable
      transitionValues.values[KEY_BACKGROUND] = colorDrawable.color
    }
  }

  override fun createAnimator(
    sceneRoot: ViewGroup,
    startValues: TransitionValues?,
    endValues: TransitionValues?
  ): Animator? {
    if (startValues == null || endValues == null) {
      return null
    }
    // We animate the color from start to end
    val startColor = startValues.values[KEY_BACKGROUND] as Int?
    val endColor = endValues.values[KEY_BACKGROUND] as Int?
    if (startColor!!.toInt() != endColor!!.toInt()) {
      // We get the final View
      val view = endValues.view
      // We create the Animator only if the colors are different
      return ValueAnimator.ofObject(
        ArgbEvaluator(),
        startColor,
        endColor
      ).apply {
        // Add an update listener to the Animator object.
        addUpdateListener { animation ->
          val value = animation.animatedValue
          if (null != value) {
            view.setBackgroundColor(value as Int)
          }
        }
      }
    } else {
      return null
    }
  }
}