package qu.lingosnacks.entity

import com.google.firebase.firestore.DocumentId
import kotlinx.serialization.Serializable

@Serializable
data class Score(
    val packageId: String,
    val uid: String,
    val gameName: String,
    val score: Int,
    val outOf: Int,
    val doneOn: String,

    @DocumentId
    val scoreId: String ="",
) {
    constructor(): this("", "", "", 0,  0, "","")
}