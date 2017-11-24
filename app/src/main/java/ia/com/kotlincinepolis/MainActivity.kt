package ia.com.kotlincinepolis

import android.os.Bundle
import android.support.v4.app.Fragment
import ia.com.commons.base.BaseActivity
import ia.com.kotlincinepolis.cities.CitiesFragment
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : BaseActivity() {
    val ID_DEFAULT_FRAGMENT = R.id.cities

    val fragments: HashMap<Int, Fragment> = hashMapOf(
            Pair(R.id.cities, CitiesFragment())
    )

    override fun getLayoutResId() = R.layout.activity_main


    override fun initView(savedInstanceState: Bundle?) {
        super.initView(savedInstanceState)
        initViewFragment()
        navigationView.selectedItemId = R.id.cities
        navigationView.setOnNavigationItemSelectedListener { item ->
            val fragment: Fragment? = fragments[item.itemId]

            if (fragment != null)
                replaceFragment(R.id.fragmentContainer, fragment)

            true
        }

    }

    private fun initViewFragment() {
        val currentFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainer)
        if (currentFragment == null) {
            supportFragmentManager
                    .beginTransaction()
                    .add(R.id.fragmentContainer, defaultFragment())
                    .commit()
        }
    }

    private fun replaceFragment(container: Int, fragment: Fragment) {
        supportFragmentManager
                .beginTransaction()
                .replace(container, fragment)
                .commit()
    }

    private fun defaultFragment() = fragments[ID_DEFAULT_FRAGMENT]

}
