package com.example.data.apiservice

import com.example.data.models.FirstModelData
import retrofit2.http.GET

interface ApiService {
    @GET("/share/")
    fun getList(): List<FirstModelData>
}