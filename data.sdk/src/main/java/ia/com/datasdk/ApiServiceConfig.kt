package ia.com.datasdk

import retrofit2.Retrofit

/**
 * Created by rsandoval on 14/11/2017.
 */
interface ApiServiceConfig {
    fun setupApiClient(retrofit: Retrofit.Builder)

}