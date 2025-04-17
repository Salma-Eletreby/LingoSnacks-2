package qu.lingosnacks.entity

import com.google.firebase.firestore.DocumentId
import kotlinx.serialization.Serializable

@Serializable
data class Resource(
    var title: String,
    var url: String,
    var type: String,

    @DocumentId
    val resourceId: String ="",
) {
    constructor(): this("", "", "","")
    val extension: String
        get() {
            val temp = url.substringAfterLast(".")
            return if (temp == url) ".url" else ".$temp"
        }
}

