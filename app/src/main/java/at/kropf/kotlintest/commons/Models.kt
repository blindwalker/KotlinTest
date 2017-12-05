package at.kropf.kotlintest.commons

import at.kropf.kotlintest.commons.adapter.AdapterConstants
import at.kropf.kotlintest.commons.adapter.ViewType

data class RedditNewsItem (
        val author: String,
        val title: String,
        val numComments: Int,
        val created: Long,
        val thumbnail: String,
        val url: String
): ViewType {
    override fun getViewType(): Int = AdapterConstants.NEWS
}