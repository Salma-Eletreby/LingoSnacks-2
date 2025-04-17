package qu.lingosnacks.entity

import com.google.firebase.firestore.DocumentId
import kotlinx.serialization.Serializable

@Serializable
data class Review(
    val packageId: String,
    var comment: String,
    val doneOn: String,
    val doneBy: String,
    var rating: Double,

    @DocumentId
    var reviewId: String = "",
) {
    //empty constructor for firebase
    constructor() : this(
        reviewId = "",
        packageId = "",
        comment = "",
        doneOn = "",
        doneBy = "",
        rating = 0.0
    )
}