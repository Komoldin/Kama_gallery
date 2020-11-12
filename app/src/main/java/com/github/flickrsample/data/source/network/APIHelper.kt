
package com.github.flickrsample.data.source.network

import javax.inject.Inject
import javax.inject.Singleton

/**
 * Helping with retrofit instance
 *
 * Created by gk
 */

@Singleton
class APIHelper @Inject
constructor(private val mAPIService: APIService) : NetworkAPIs {

    override fun getAPIService(): APIService {
        return mAPIService
    }
}
