package icesi.edu.co.pokeapp.domain.model

data class Pokemon(
    var name:String,
    var photoURL:String,
    var attack:Int,
    var defense:Int,
    var speed:Int,
    var hp:Int
)