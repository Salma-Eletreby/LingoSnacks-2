package qu.lingosnacks.entity

import com.google.firebase.firestore.DocumentId
import kotlinx.serialization.Serializable

@Serializable
data class Sentence(
    var text: String,
    var resources: MutableList<Resource> = mutableListOf(),

    @DocumentId
    val wordId: String ="",
) {

    constructor(): this("",mutableListOf(),"" )

    fun addResource(resource: Resource): Boolean {
        return resources.add(resource)
    }

    fun removeResource(resource: Resource): Boolean {
        return resources.remove(resource)
    }

    fun removeResourceByTitle(title: String): Boolean {
        return resources.removeIf { it.title == title }
    }

    fun removeResourceByURL(url: String): Boolean {
        return resources.removeIf { it.url == url }
    }
}
