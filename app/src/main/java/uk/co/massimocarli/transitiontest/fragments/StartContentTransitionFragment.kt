package uk.co.massimocarli.transitiontest.fragments

import android.transition.ChangeImageTransform
import android.transition.Explode
import android.transition.Fade
import android.transition.Slide
import uk.co.massimocarli.transitiontest.R

class StartContentTransitionFragment : BaseTransitionFragment("Content Transition Example") {

  override fun startTransition() {
    val fragment = EndContentTransitionFragment()
    exitTransition = Explode()
    enterTransition = Slide()
    reenterTransition = Fade()
    returnTransition = ChangeImageTransform()
    activity!!.supportFragmentManager.beginTransaction()
      .replace(R.id.anchor_point, fragment)
      .addToBackStack("StartContentTransitionFragment")
      .commit()
  }

  override fun getLayoutId(): Int = R.layout.activity_start_content_transition
}