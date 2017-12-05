package at.kropf.kotlintest.features.news.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import at.kropf.kotlintest.R
import at.kropf.kotlintest.commons.adapter.ViewType
import at.kropf.kotlintest.commons.adapter.ViewTypeDelegateAdapter
import at.kropf.kotlintest.commons.extensions.inflate

class LoadingDelegateAdapter : ViewTypeDelegateAdapter {

    override fun onCreateViewHolder(parent: ViewGroup) = TurnsViewHolder(parent)

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType) {
    }

    class TurnsViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
            parent.inflate(R.layout.news_item_loading)) {
    }
}