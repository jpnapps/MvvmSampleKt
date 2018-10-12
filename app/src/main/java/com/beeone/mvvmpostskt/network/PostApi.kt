package com.beeone.mvvmpostskt.network

import android.database.Observable
import com.beeone.mvvmpostskt.base.Post
import retrofit2.http.GET

/**
 * The interface which provides methods to get result of webservices
 */
interface PostApi {
    /**
     * Get the list of the pots from the API
     */
    @GET("/posts")
    fun getPosts(): Observable<List<Post>>
}