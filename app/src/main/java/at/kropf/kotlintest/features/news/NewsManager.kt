package at.kropf.kotlintest.features.news

import at.kropf.kotlintest.commons.RedditNewsItem
import rx.Observable

class NewsManager {

    fun getNews(): Observable<List<RedditNewsItem>> {
        return Observable.create { subscriber ->

            val news = mutableListOf<RedditNewsItem>()
            for (i in 1..10) {
                news.add(RedditNewsItem(
                        "author$i",
                        "title$i",
                        i,
                        1457207701L - i * 200, // time
                        "http://lorempixel.com/200/200/technics/$i", // image url
                        "url"
                ))
            }
            subscriber.onNext(news)
        }
    }
}