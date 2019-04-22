package uk.co.massimocarli.transitiontest.fragments

import android.os.Bundle
import android.view.*
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import uk.co.massimocarli.transitiontest.R

abstract class BaseTransitionFragment(val title: String) : Fragment() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setHasOptionsMenu(true)
  }

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? = inflater.inflate(
    getLayoutId(),
    container,
    false
  )

  override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
    inflater.inflate(R.menu.menu_actions, menu)
  }


  override fun onActivityCreated(savedInstanceState: Bundle?) {
    super.onActivityCreated(savedInstanceState)
    if (activity is AppCompatActivity) {
      (activity as AppCompatActivity).supportActionBar?.title = title
    }
  }

  override fun onOptionsItemSelected(item: MenuItem): Boolean {
    startTransition()
    return super.onOptionsItemSelected(item)
  }

  protected abstract fun startTransition()

  open fun getLayoutId() = R.layout.fragment_simple_transition
}