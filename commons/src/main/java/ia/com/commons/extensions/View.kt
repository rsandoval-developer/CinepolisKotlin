package ia.com.commons.extensions

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by rsandoval on 13/11/2017.
 */

fun ViewGroup.inflate(viewId: Int, attachToRoot: Boolean = false): View? {
    return LayoutInflater.from(context).inflate(viewId, this, attachToRoot)
}