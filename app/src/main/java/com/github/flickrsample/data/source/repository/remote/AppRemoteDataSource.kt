/
package com.github.flickrsample.data.source.repository.remote

import com.github.flickrsample.data.models.local.PhotoItem
import com.github.flickrsample.data.models.remote.PhotoResult
import com.github.flickrsample.data.models.remote.ResponsePhotoItemHolder
import com.github.flickrsample.data.source.repository.AppDataSource
import com.github.flickrsample.data.source.network.NetworkAPIs

import javax.inject.Inject
import javax.inject.Singleton

import io.reactivex.Flowable
import retrofit2.Response

/**
 * Concrete implementation of a data source from remote server, using retrofit
 *
 * Created by gk
 */

@Singleton
class AppRemoteDataSource @Inject
constructor(private val mNetworkAPIs: NetworkAPIs) : AppDataSource {

    override fun getPhotoResult(key: String,
                                query: String,
                                page: Int, perPage: Int): Flowable<PhotoResult> {
        return mNetworkAPIs.getAPIService()
                .getImageItemList(key, query, page, perPage)
                .map { t: Response<ResponsePhotoItemHolder> ->  t.body()?.photos }
    }

    override fun updatePhotoItemList(photoItems: List<PhotoItem>) {
        //do nothing
    }
}
