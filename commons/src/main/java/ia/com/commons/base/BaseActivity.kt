package ia.com.commons.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/**
 * Created by rsandoval on 13/11/2017.
 */
abstract class BaseActivity : AppCompatActivity() {
    abstract fun getLayoutResId(): Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutResId())
        initView(savedInstanceState)

    }

    open fun initView(savedInstanceState: Bundle?) {

    }

}