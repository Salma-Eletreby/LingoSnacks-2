package qu.lingosnacks.entity

import com.google.firebase.firestore.DocumentId
import kotlinx.serialization.Serializable
import qu.lingosnacks.utils.getRandomId

@Serializable
data class User(
    var firstName: String,
    var lastName: String,
    var email: String,
    var password: String,
    val role: String,
    var photoUrl: String = "",

    @DocumentId
    val uid: String ="",
) {
//    constructor(uid : String) : this(firstName = "",
//        lastName = "", email = "",
//        password = "", role = "") {
//        this.uid = uid
//    }

    //empty constructor for Firebase
    constructor(): this("", "", "", "",  "", "","")

//    var uid: String = getRandomId()

    val fullName: String
        get() = "$firstName $lastName"

    override fun toString()
            = "${firstName.trim()} ${lastName.trim()} - ${email.trim()}".trim()
}