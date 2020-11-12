
package com.github.flickrsample.data.source.repository

import com.github.flickrsample.data.models.local.PhotoItem
import com.github.flickrsample.data.models.remote.PhotoResult
import com.github.flickrsample.data.models.remote.ResponsePhotoItemHolder

import io.reactivex.Flowable
/**
 * Created by gk
 */

interface AppDataSource {

    fun getPhotoResult(key: String,
                       query: String,
                       page: Int, perPage: Int): Flowable<PhotoResult>

    fun updatePhotoItemList(photoItems: List<PhotoItem>)

}
