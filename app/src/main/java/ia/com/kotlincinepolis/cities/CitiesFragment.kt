package ia.com.kotlincinepolis.cities


import android.support.v4.app.Fragment
import android.support.v7.widget.RecyclerView
import ia.com.commons.adapter.DataBindingRecyclerAdapter
import ia.com.commons.base.BaseListFragment
import ia.com.commons.view.SpaceItemDecoration
import ia.com.kotlincinepolis.BR
import ia.com.kotlincinepolis.City
import ia.com.kotlincinepolis.R


/**
 * A simple [Fragment] subclass.
 */
class CitiesFragment : BaseListFragment() {

    override fun setupList(list: RecyclerView) {
        super.setupList(list)
        val space: Int = resources.getDimension(R.dimen.normal_space).toInt()
        list.addItemDecoration(SpaceItemDecoration(space, true))
    }

    override fun getAdapter(): RecyclerView.Adapter<*> {
        val citiesAdapter = DataBindingRecyclerAdapter<City>(BR.city, R.layout.item_city)
        return citiesAdapter
    }

    private fun showDeals(deals: List<City>) {
        with(listAdapter as DataBindingRecyclerAdapter<City>) {
            items.clear()
            items.addAll(deals)
            notifyDataSetChanged()
        }
    }

    override fun onResume() {
        super.onResume()
        showDeals(getDummyCities())

    }

    private fun getDummyCities(): ArrayList<City> {
        return arrayListOf(
                City(name = "Morelia"),
                City(name = "Morelia"),
                City(name = "Morelia"),
                City(name = "Morelia"),
                City(name = "Morelia"),
                City(name = "Morelia"),
                City(name = "Morelia"),
                City(name = "Morelia"),
                City(name = "Morelia"),
                City(name = "Morelia")
        )
    }

}