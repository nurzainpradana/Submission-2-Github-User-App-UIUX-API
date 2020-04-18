package com.nurzainpradana.androidfundamental.submission2aplikasigithubuseruiuxdanapi.api;

import com.nurzainpradana.androidfundamental.submission2aplikasigithubuseruiuxdanapi.BuildConfig;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Api {
    private static Retrofit retrofit = null;
    private static final String BASE_URL = BuildConfig.BASE_URL;

    public static Retrofit getApi() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
