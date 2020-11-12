/
package com.github.flickrsample.data.models.remote

import com.github.flickrsample.data.models.local.PhotoItem

import java.util.ArrayList

/**
 * Holds the list of photo items from the sever
 *
 * Created by gk
 */
data class PhotoResult(
        val page: Int,
        val pages: Int,
        val perpage: Int,
        val total: String,
        val photo: ArrayList<PhotoItem>)

data class ResponsePhotoItemHolder(
        val stat: String,
        val photos: PhotoResult)
