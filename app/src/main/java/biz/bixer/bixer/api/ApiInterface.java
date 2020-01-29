package biz.bixer.bixer.api;

import biz.bixer.bixer.models.News;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("everything")
    Call<News> getNews(

            @Query("q") String q,
            @Query("sortBy") String publishedDate,
            @Query("language") String language,
            @Query("apiKey") String apiKey
    );

    @GET("everything")
    Call<News> getNewsSearch(

            @Query("q") String keyword,
            @Query("language") String language,
            @Query("sortBy") String sortBy,
            @Query("apiKey") String apiKey
    );
}
