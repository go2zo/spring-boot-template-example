package io.go2zo.tutorial.springbootmustache.api;

import io.go2zo.tutorial.springbootmustache.domain.User;
import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface UserAPI {

    @GET("/users")
    Call<List<User>> getUserList();

}
