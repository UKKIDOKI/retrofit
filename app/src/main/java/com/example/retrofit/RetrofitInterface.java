package com.example.retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface RetrofitInterface {

    @GET("https://senior.bucheon.go.kr/")
    Call<List<Result>> getData();


}
