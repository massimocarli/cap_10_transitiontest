package uk.co.massimocarli.transitiontest

import androidx.fragment.app.Fragment
import uk.co.massimocarli.transitiontest.fragments.*

typealias FragmentBuilder = () -> Fragment

data class DemoItem(val name: String, val builder: FragmentBuilder)

val DEMO_MODELS: Array<DemoItem>
  get() = arrayOf(
    DemoItem("Simple Fade Transition Example") {
      SimpleFadeTransitionFragment()
    },
    DemoItem("Change Bounds Transition Example") {
      ChangeBoundsTransitionFragment()
    },
    DemoItem("Change Clip Bounds Transition Example") {
      ChangeClipBoundsTransitionFragment()
    },
    DemoItem("Change Image Transform Transition Example") {
      ChangeImageTransformTransitionFragment()
    },
    DemoItem("Change Scroll Transition Example") {
      ChangeScrollTransitionFragment()
    },
    DemoItem("Change Transform Transition Example") {
      ChangeTransformTransitionFragment()
    },
    DemoItem("Explode Transition Example") {
      ExplodeTransitionFragment()
    },
    DemoItem("Slide Transition Example") {
      SlideTransitionFragment()
    },
    DemoItem("Auto Transition Example") {
      AutoTransitionFragment()
    },
    DemoItem("Resource Transition Example") {
      ResourceTransitionFragment()
    },
    DemoItem("Set Transition Example") {
      SetTransitionFragment()
    },
    DemoItem("Delayed Transition Example") {
      DelayedTransitionFragment()
    },
    DemoItem("Listener Transition Example") {
      ListenerTransitionFragment()
    },
    DemoItem("Custom Transition Example") {
      CustomTransitionFragment()
    },
    DemoItem("Start Content Transition Example") {
      StartContentTransitionFragment()
    },
    DemoItem("Start Shared Transition Example") {
      StartSharedTransitionFragment()
    }
  )