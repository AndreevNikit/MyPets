package com.example.mypets;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface PetService {


    @GET("api/post")
    Call<List<UPost>> getData(@Query("name") String resourceName, @Query("num") int count);

    Retrofit retrofit = new Retrofit.Builder()
            //.baseUrl("http://www.umori.li/")
            .baseUrl("https://petstore.swagger.io/v2/pet/666")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

}
