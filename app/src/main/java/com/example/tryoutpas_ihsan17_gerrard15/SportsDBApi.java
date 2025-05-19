package com.example.tryoutpas_ihsan17_gerrard15;
import retrofit2.Call;
import retrofit2.http.GET;

public interface SportsDBApi {
    @GET("api/v1/json/3/search_all_teams.php?l=English%20Premier%20League\n")
    Call<TeamResponse> getTeams();
}