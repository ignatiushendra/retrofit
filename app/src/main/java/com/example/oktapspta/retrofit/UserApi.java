package com.example.oktapspta.retrofit;


import retrofit.Call;
import retrofit.http.Body;
import retrofit.http.DELETE;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.PUT;
import retrofit.http.Path;

import static android.R.attr.id;


public interface UserApi {

    @GET("/api/v1/auth")
    Call<Users> getUsers();


    @GET("/api/v1/auth{id}")
    Call<User> getUser(@Path("id") String user_id);


    @PUT("/api/v1/auth/{id}")
    Call<User> updateUser(@Path("id") int user_id, @Body User user);


    @POST("/api/v1/auth")
    Call<User> saveUser(@Body User user);


    @DELETE("/api/v1/auth/{id}")
    Call<User> deleteUser(@Path("id") String user_id);

}
