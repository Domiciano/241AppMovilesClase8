package icesi.edu.co.pokeapp.data.dto

data class PokemonDTO(
    val name:String,
    val stats:ArrayList<StatContainer>,
    val sprites:Sprites
)
data class Sprites(
    val front_default:String
)
data class StatContainer(
    val base_stat:Int,
    val stat:Stat
)
data class Stat(
    val name:String
)