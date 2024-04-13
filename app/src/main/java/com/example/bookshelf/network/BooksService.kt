package com.example.bookshelf.network


import retrofit2.http.GET
import retrofit2.http.Query
import com.example.bookshelf.Bookshelf

interface BookService {

    @GET("volumes")
    suspend fun bookSearch(
        @Query("q") searchQuery: String,
        @Query("maxResults") maxResults: Int
    ): Bookshelf
}