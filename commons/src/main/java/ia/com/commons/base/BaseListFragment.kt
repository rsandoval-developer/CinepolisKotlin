package ia.com.commons.base

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import ia.com.commons.R
import kotlinx.android.synthetic.main.fragment_list.view.*

abstract class BaseListFragment : BaseFragment() {

    lateinit var listAdapter: RecyclerView.Adapter<*>

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view?.list?.let {
            setupList(view.list)
        }
    }

    override fun getLayoutResId(): Int {
        return R.layout.fragment_list
    }

    open fun setupList(list: RecyclerView) {
        listAdapter = getAdapter()
        with(list) {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(context)
            adapter = listAdapter
        }
    }

    abstract fun getAdapter(): RecyclerView.Adapter<*>
}