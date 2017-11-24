package ia.com.datasdk

import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query


/**
 * Created by rsandoval on 14/11/2017.
 */
interface CityService {

    @GET(Routes.GET_CITIES)
    fun getCities(@Query("country_code") country: String): Observable<List<City>>

}