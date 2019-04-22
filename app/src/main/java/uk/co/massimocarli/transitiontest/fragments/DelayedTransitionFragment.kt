package uk.co.massimocarli.transitiontest.fragments

import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.transition.Explode
import androidx.transition.Transition
import androidx.transition.TransitionManager
import uk.co.massimocarli.transitiontest.R

class DelayedTransitionFragment : SimpleTransitionFragment("Delayed Transition Example") {

  override fun getTransition(): Transition {
    val imageDim = resources.getDimensionPixelSize(R.dimen.image_size);
    val rootView = activity!!.findViewById<ViewGroup>(R.id.rootView)
    val imageView = ImageView(context).apply {
      setImageDrawable(resources.getDrawable(R.drawable.android_1, context.theme))
      layoutParams = LinearLayout.LayoutParams(imageDim, imageDim)
    }
    val transition = Explode().apply {
      duration = TRANSITION_DURATION
    }
    TransitionManager.beginDelayedTransition(rootView, transition);
    rootView.removeView(rootView.findViewById(R.id.image_2));
    rootView.addView(imageView)
    return transition
  }
}
