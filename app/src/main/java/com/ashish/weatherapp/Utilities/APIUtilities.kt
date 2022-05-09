package com.ashish.weatherapp.Utilities

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object APIUtilities {

    private var retrofit:Retrofit?=null
    var BASE_URL="https://api.openweathermap.org/data/2.5/"
    fun getAPI_Interface():API_Interface?{
        if (retrofit==null)
        {
            retrofit=Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build()
        }
        return retrofit!!.create(API_Interface::class.java)
    }
}