package icesi.edu.co.pokeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import com.bumptech.glide.Glide
import icesi.edu.co.pokeapp.databinding.ActivityMainBinding
import icesi.edu.co.pokeapp.viewmodel.MainViewmodel

class MainActivity : AppCompatActivity() {

    val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    val viewmodel: MainViewmodel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.searchButton.setOnClickListener {
            viewmodel.searchPokemon("150")
        }

        viewmodel.pokemon.observe(this){
            binding.pokemonName.text = it.name
            Glide.with(this).load(it.photoURL).into(binding.pokemonImage)
        }

    }
}