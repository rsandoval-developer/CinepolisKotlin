package ia.com.datasdk

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit

/**
 * Created by rsandoval on 14/11/2017.
 */
class CinepolisApiServiceConfig :ApiServiceConfig {

    override fun setupApiClient(retrofit: Retrofit.Builder) {
        if (BuildConfig.DEBUG) {
            val okHttpClient = OkHttpClient().newBuilder()
                    .addInterceptor(HttpLoggingInterceptor()
                            .setLevel(HttpLoggingInterceptor.Level.BODY))
                    .build()

            retrofit.client(okHttpClient)
        }
    }
}