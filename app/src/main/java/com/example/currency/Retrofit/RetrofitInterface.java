package com.example.currency.Retrofit;

import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface RetrofitInterface {
    @GET("v6/38590673dbdca0a3ed087f9c/latest/{currency}")
    Call<JsonObject> getExchangeCurrency(@Path("currency") String currency);
}
