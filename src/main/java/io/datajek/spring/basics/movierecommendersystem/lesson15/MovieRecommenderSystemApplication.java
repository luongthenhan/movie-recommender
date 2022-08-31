package io.datajek.spring.basics.movierecommendersystem.lesson15;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:app.properties")
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {
		ApplicationContext appContext = 
			SpringApplication.run(MovieRecommenderSystemApplication.class, args);
		RecommenderImplementation recommender = appContext.getBean(RecommenderImplementation.class);
		
		//Retrieving prototype bean from application context twice
		Movie m1 = appContext.getBean(Movie.class);
		System.out.println(m1);
	
		Movie m2 = appContext.getBean(Movie.class);
		System.out.println(m2);

		//display value read from external property file
		String favoriteMovie = recommender.getFavoriteMovie();
		System.out.println(favoriteMovie);
		
		String[] results = recommender.recommendMovies(favoriteMovie);
		System.out.println(Arrays.toString(results));
	}

}
