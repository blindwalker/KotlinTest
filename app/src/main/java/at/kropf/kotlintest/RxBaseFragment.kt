package at.kropf.kotlintest

import android.app.Fragment
import rx.subscriptions.CompositeSubscription

open class RxBaseFragment : Fragment() {

    var subscriptions = CompositeSubscription()

    override fun onResume() {
        super.onResume()
        subscriptions = CompositeSubscription()
    }

    override fun onPause() {
        super.onPause()
        subscriptions.clear()
    }
}