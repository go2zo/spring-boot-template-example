package io.go2zo.tutorial.springboot.util;

import lombok.extern.slf4j.Slf4j;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;
import java.util.Optional;

@Slf4j
public class RequestUtil {

    public static <T> Optional<T> requestSync(Call<T> call) {
        try {
            Response<T> execute = call.execute();
            log.debug("execute = " + execute);
            if (execute.isSuccessful()) {
                return Optional.ofNullable(execute.body());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

    public static <T> void requestAsync(Call<T> call, CustomCallback<T> callback) {
        call.enqueue(callback);
    }
}
