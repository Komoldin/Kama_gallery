
package com.github.flickrsample.data.source.prefs

/**
 * Created by gk.
 */

interface PreferencesHelper {

    //GENERIC
    fun getBoolean(key: String): Boolean

    fun getLong(key: String): Long

    fun getInt(key: String): Int

    fun getString(key: String): String

    fun setBoolean(key: String, value: Boolean)

    fun setLong(key: String, value: Long)

    fun setInt(key: String, value: Int)

    fun getString(key: String, value: String)

}
