
package com.github.flickrsample.data.source.repository

import com.github.flickrsample.data.models.local.PhotoItem

import io.reactivex.Flowable

/**
 * Created by gk
 */

interface AppRepository : AppDataSource {

    fun getPhotoItemList(key: String,
                         query: String,
                         page: Int, perPage: Int): Flowable<List<PhotoItem>>


    fun getCachedPhotoItems(): Flowable<List<PhotoItem>>

    fun getPaginationStatus(): Boolean

    fun getPageNumber(): Int

    fun getMaxPageNumber(): Int

    fun refreshItems()
}
