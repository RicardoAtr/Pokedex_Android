package pokedex.api.pokeapi;

import pokedex.api.models.PokemonRequest;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface PokeApiService {

    @GET("pokemon")
    Call<PokemonRequest> getPokemonList(@Query("limit") int limit, @Query("offset") int offset);
    //Call<PokemonRequest> getPokemonList();
}
