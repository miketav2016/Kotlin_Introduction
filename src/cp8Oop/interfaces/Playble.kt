package cp8Oop.interfaces

interface Playable  {
    fun play()
}
class Guitar  : Playable {
    override fun play() {
        println("Играет гитара")
    }
}