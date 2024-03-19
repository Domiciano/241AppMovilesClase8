package icesi.edu.co.pokeapp.data.services
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitUtil {
    private val pokedexRetrofit = Retrofit.Builder()
        .baseUrl("https://pokeapi.co/api/v2/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val pokedexService:PokedexService = pokedexRetrofit.create(PokedexService::class.java)


}