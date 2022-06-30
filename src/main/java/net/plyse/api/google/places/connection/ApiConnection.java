package net.plyse.api.google.places.connection;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

/**
 * @author Raphael Dichler on 28.06.2022.
 */
public abstract class ApiConnection {

    private final OkHttpClient client = new OkHttpClient().newBuilder().build();

    protected Response executeSync(Request request) throws IOException {
        return client.newCall(request).execute();
    }

}
