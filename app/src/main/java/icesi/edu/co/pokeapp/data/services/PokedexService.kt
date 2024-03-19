package icesi.edu.co.pokeapp.data.services

import icesi.edu.co.pokeapp.data.dto.PokemonDTO
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface PokedexService {

    @GET("pokemon/{id}")
    fun getPokemon(@Path("id") id:String) : Call<PokemonDTO>

}