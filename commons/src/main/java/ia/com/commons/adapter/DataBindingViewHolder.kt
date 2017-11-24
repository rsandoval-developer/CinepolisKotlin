package ia.com.commons.adapter

import android.databinding.ViewDataBinding
import android.support.v7.widget.RecyclerView

/**
 * Created by rsandoval on 13/11/2017.
 */
class DataBindingViewHolder<MODEL>(val bindingVarId: Int,
                                   val binding: ViewDataBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bindItem(item: MODEL) {
        binding.setVariable(bindingVarId, item)
        binding.executePendingBindings()
    }
}