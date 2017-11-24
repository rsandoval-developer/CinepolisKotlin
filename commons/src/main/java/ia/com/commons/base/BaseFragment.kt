package ia.com.commons.base

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ia.com.commons.extensions.inflate

/**
 * Created by rsandoval on 13/11/2017.
 */
abstract class BaseFragment : Fragment() {
    abstract fun getLayoutResId(): Int

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        initView()
        return container?.inflate(getLayoutResId());
    }

    open fun initView() {
    }
}