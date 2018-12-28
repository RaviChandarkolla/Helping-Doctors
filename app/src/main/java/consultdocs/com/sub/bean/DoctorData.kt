package consultdocs.com.sub.bean

import com.google.firebase.database.IgnoreExtraProperties
import com.google.gson.annotations.SerializedName

@IgnoreExtraProperties
data class DoctorData(
    @SerializedName("password")
    var password: String? = "",
    @SerializedName("email")
    var email: String? = "",
    @SerializedName("fromTime")
    var fromTime: String? = "",
    @SerializedName("toTime")
    var toTime: String? = "",
    @SerializedName("username")
    var username: String? = null
) {
    constructor(): this("", "", "", "", "")
}