package ia.com.datasdk

import com.google.gson.Gson
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by rsandoval on 14/11/2017.
 */
class CinepolisApiService(serviceConfig: ApiServiceConfig = CinepolisApiServiceConfig()) {

    val apiClient: CityService

    init {

        val apiClientBuilder = Retrofit.Builder()
                .baseUrl(Routes.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(Gson()))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())

        serviceConfig.setupApiClient(apiClientBuilder)

        apiClient = apiClientBuilder.build()
                .create(CityService::class.java)
    }

}