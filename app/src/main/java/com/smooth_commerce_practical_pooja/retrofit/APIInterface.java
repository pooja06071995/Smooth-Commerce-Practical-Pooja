package com.smooth_commerce_practical_pooja.retrofit;

import com.smooth_commerce_practical_pooja.Model.Colors;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface APIInterface {

    @GET("/api/colors?")
    Call<ArrayList<Colors>> getColors(@Query("keywords") String keywords, @Query("format") String format,
                                     @Query("numResults") String numResults);
}
