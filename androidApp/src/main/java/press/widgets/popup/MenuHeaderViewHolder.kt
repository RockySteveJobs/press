package press.widgets.popup

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.SubMenuBuilder
import androidx.recyclerview.widget.RecyclerView
import me.saket.press.R

/** Layout for a sub-menu header. */
class MenuHeaderViewHolder(view: View) : RecyclerView.ViewHolder(view) {
  val textView: TextView = view.findViewById(android.R.id.title)
  lateinit var menu: SubMenuBuilder

  fun render() {
    textView.text = menu.headerTitle
    textView.isEnabled = false
  }

  companion object {
    fun inflate(parent: ViewGroup): MenuHeaderViewHolder {
      val inflater = LayoutInflater.from(parent.context).cloneInContext(parent.context)
      val view = inflater.inflate(R.layout.abc_popup_menu_header_item_layout, parent, false)
      return MenuHeaderViewHolder(view)
    }
  }
}
