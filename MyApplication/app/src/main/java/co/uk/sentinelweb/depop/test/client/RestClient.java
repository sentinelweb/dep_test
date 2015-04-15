package co.uk.sentinelweb.depop.test.client;

import android.content.Context;
import android.content.res.Resources;
import android.os.AsyncTask;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import co.uk.sentinelweb.depop.test.model.Header;
import co.uk.sentinelweb.depop.test.model.Products;
import depop.test.sentinelweb.uk.co.test.R;

/**
 * If I had more time this would be a class to invoke the API using Retrofit.
 *
 * Just uses AsyncTask for background loading.
 *
 * Created by robert on 14/04/2015.
 */
public class RestClient {

    /**
     * Callback for header asynchronous loading
     */
    public interface HeaderCallback {
        public void onComplete(Header header);
        public void onError(Exception e);
    }

    /**
     * Callback for product asynchronous loading
     */
    public interface ProductsCallback {
        public void onComplete(Products products);
        public void onError(Exception e);
    }

    /**
     * Executes load header using {@link AsyncTask}
     * @param id
     */
    public static void getHeaderAsync(final Context c, final Long id, final HeaderCallback callback) {
        new AsyncTask<Long,Void,Header>() {

            @Override
            protected Header doInBackground(Long... longs) {
                return getHeader( c, id);
            }

            @Override
            protected void onPostExecute(Header header) {
                if (callback!=null) callback.onComplete(header);
            }
        }.execute(id);
    }

    /**
     * Get the {@link Header} from a raw resource
     * @param c
     * @return
     */
    public static Header getHeader(final Context c, Long id) {
        GsonBuilder gsonb = new GsonBuilder();
        Gson gson = gsonb.create();
        try {
            String jsonString = getStringFromRaw(c, R.raw.header);
            Header h = gson.fromJson(jsonString,Header.class);
            return h;
        } catch (IOException e) {
            Log.w(RestClient.class.getSimpleName(), "Loading header failed ....",e);
        }
        return null;
    }

    /**
     * Executes load products using {@link AsyncTask}
     * @param id
     */
    public static void getProductsAsync(final Context c, final Long id, final ProductsCallback callback) {
        new AsyncTask<Long, Void, Products>() {

            @Override
            protected Products doInBackground(Long... longs) {
                return getProducts( c, id);
            }

            @Override
            protected void onPostExecute(Products products) {
                if (callback!=null) callback.onComplete(products);
            }
        }.execute(id);
    }

    /**
     * Get the {@link Header} from a raw resource
     * @param c
     * @return
     */
    public static Products getProducts(final Context c, Long id) {
        GsonBuilder gsonb = new GsonBuilder();
        Gson gson = gsonb.create();
        try {
            String jsonString = getStringFromRaw(c, R.raw.products);
            Products h = gson.fromJson(jsonString, Products.class);
            return h;
        } catch (IOException e) {
            Log.w(RestClient.class.getSimpleName(), "Loading products failed ....",e);
        }
        return null;
    }
    /**
     * Gets the JSON String from raw resource
     * @param c
     * @param resourceId
     * @return
     * @throws IOException
     */
    private static String getStringFromRaw(final Context c, final int resourceId) throws IOException {
        Resources r = c.getResources();
        InputStream is = r.openRawResource(resourceId);
        String statesText = convertStreamToString(is);
        is.close();
        return statesText;
    }

    private static String convertStreamToString(final InputStream is) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int i = is.read();
        while (i != -1) {
            baos.write(i);
            i = is.read();
        }
        return baos.toString();
    }
}
