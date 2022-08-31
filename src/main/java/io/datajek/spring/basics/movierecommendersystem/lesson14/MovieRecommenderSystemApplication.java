package io.datajek.spring.basics.movierecommendersystem.lesson14;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
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
		
		String[] results = recommender.recommendMovies("Finding Dory");
		System.out.println(Arrays.toString(results));
	}

}
