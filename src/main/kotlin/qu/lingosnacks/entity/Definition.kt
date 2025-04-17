package qu.lingosnacks.entity

import com.google.firebase.firestore.DocumentId
import kotlinx.serialization.Serializable

@Serializable
data class Definition(
    var text: String,
    var source: String,

    @DocumentId
    val defId: String ="",
){
    constructor(): this("", "", "")
}