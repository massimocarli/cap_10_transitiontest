package uk.co.massimocarli.transitiontest.fragments

import android.transition.ChangeBounds
import android.transition.ChangeImageTransform
import kotlinx.android.synthetic.main.activity_start_shared_transition.*
import uk.co.massimocarli.transitiontest.R


class StartSharedTransitionFragment : BaseTransitionFragment("Content Transition Example") {

  override fun startTransition() {
    val fragment = EndSharedTransitionFragment()
    sharedElementEnterTransition = ChangeImageTransform()
    sharedElementReturnTransition = ChangeImageTransform()
    exitTransition = ChangeBounds()
    activity!!.supportFragmentManager.beginTransaction()
      .replace(R.id.anchor_point, fragment)
      .addToBackStack("StartSharedTransitionFragment")
      .addSharedElement(imageView, "shared_image")
      .commit()
  }

  override fun getLayoutId(): Int = ø.layout.activity_start_shared_transition
}
