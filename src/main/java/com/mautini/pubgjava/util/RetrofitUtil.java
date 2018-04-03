package com.mautini.pubgjava.util;

import com.mautini.pubgjava.exception.PubgClientException;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;

public class RetrofitUtil {

    public static <T> T getResponse(Call<T> call) throws PubgClientException {
        try {
            Response<T> response = call.execute();
            if (!response.isSuccessful()) {
                throw new PubgClientException(response.message());
            }

            if (response.body() == null) {
                throw new PubgClientException("Empty body");
            }

            return response.body();
        } catch (IOException e) {
            throw new PubgClientException(e);
        }
    }
}
