package com.mautini.pubgjava.util;

import com.mautini.pubgjava.api.ResponseCallback;
import com.mautini.pubgjava.exception.PubgClientException;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.io.IOException;

public class RetrofitUtil {

    public static <T> T getResponse(Call<T> call) throws PubgClientException {
        try {
            Response<T> response = call.execute();
            return getBody(response);
        } catch (IOException e) {
            throw new PubgClientException(e);
        }
    }

    public static <T> void getResponseAsync(Call<T> call, ResponseCallback<T> responseCallback) {

        call.enqueue(new Callback<T>() {
            @Override
            public void onResponse(Call<T> call, Response<T> response) {
                try {
                    responseCallback.onResponse(getBody(response));
                } catch (PubgClientException exception) {
                    responseCallback.onError(exception);
                }
            }

            @Override
            public void onFailure(Call<T> call, Throwable t) {
                responseCallback.onError(new PubgClientException(t));
            }
        });
    }

    private static <T> T getBody(Response<T> response) throws PubgClientException {
        if (!response.isSuccessful()) {
            throw new PubgClientException(response.message());
        }

        if (response.body() == null) {
            throw new PubgClientException("Empty body");
        }

        return response.body();
    }
}
