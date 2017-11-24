package ia.com.commons.adapter

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

/**
 * Created by rsandoval on 13/11/2017.
 */
class DataBindingRecyclerAdapter<MODEL>(val bindingVarId: Int,
                                        val viewHolderResId: Int) : RecyclerView.Adapter<DataBindingViewHolder<MODEL>>() {

    val items: MutableList<MODEL> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataBindingViewHolder<MODEL> {
        val binding: ViewDataBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.context),
                viewHolderResId, parent, false)
        return DataBindingViewHolder(bindingVarId, binding)
    }

    override fun onBindViewHolder(holder: DataBindingViewHolder<MODEL>, position: Int) {
        var item = items[position]
        holder.bindItem(item)
    }

    override fun getItemCount() = items.size
}

