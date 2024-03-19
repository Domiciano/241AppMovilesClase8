package icesi.edu.co.pokeapp.data.repo

import icesi.edu.co.pokeapp.data.services.RetrofitUtil
import icesi.edu.co.pokeapp.domain.model.Pokemon

class PokedexRepository {

    fun getPokemon(id: String): Pokemon? {
        var response = RetrofitUtil.pokedexService.getPokemon(id).execute()
        val pokemonDTO = response.body()
        pokemonDTO?.let {
            return Pokemon(
                it.name, it.sprites.front_default,
                it.stats[1].base_stat,
                it.stats[2].base_stat,
                it.stats[5].base_stat,
                it.stats[0].base_stat
            )
        } ?: run {
            return null
        }
    }

}