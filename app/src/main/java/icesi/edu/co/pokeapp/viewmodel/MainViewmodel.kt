package icesi.edu.co.pokeapp.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import icesi.edu.co.pokeapp.data.repo.PokedexRepository
import icesi.edu.co.pokeapp.domain.model.Pokemon
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.lang.Exception

class MainViewmodel : ViewModel(){

    //State
    private val _pokemon = MutableLiveData<Pokemon>()
    val pokemon: LiveData<Pokemon> get() = _pokemon


    fun searchPokemon(id:String){
        viewModelScope.launch (Dispatchers.IO){
            try {
                val pokemonObj = PokedexRepository().getPokemon(id)
                withContext(Dispatchers.Main){
                    pokemonObj?.let {
                        _pokemon.value = it
                    }
                }

            }catch (ex:Exception){
                ex.printStackTrace()
            }

        }
    }


}

