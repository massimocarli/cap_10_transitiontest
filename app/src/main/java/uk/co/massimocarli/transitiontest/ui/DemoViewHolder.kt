package uk.co.massimocarli.transitiontest.ui

import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import uk.co.massimocarli.transitiontest.DemoItem

typealias OnDemoItemSelected = (DemoItem) -> Unit

class DemoViewHolder(
  val view: TextView,
  val onDemoItemSelected: OnDemoItemSelected? = null
) : RecyclerView.ViewHolder(view) {

  lateinit var currentModel: DemoItem

  init {
    view.setOnClickListener {
      onDemoItemSelected?.invoke(currentModel)
    }
  }

  fun bindModel(model: DemoItem) {
    currentModel = model
    view.text = model.name
  }
}
