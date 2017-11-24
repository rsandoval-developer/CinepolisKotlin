package ia.com.datasdk

import com.google.gson.annotations.SerializedName

/**
 * Created by rsandoval on 14/11/2017.
 */
data class City(@SerializedName("uris") val uris:
                String, @SerializedName("lng") val lng: String,
                @SerializedName("name") val name: String,
                @SerializedName("id") val id: Int,
                @SerializedName("lat") val lat: String
)