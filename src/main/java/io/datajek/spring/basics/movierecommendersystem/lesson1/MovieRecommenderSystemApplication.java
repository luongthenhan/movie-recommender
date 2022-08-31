package io.datajek.spring.basics.movierecommendersystem.lesson1;

import java.util.Arrays;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {
		RecommenderImplementation recommender = new RecommenderImplementation(new ContentBasedFilter());
		String[] results = recommender.recommendMovies("Finding Dory");
		System.out.println(Arrays.toString(results));
		//SpringApplication.run(MovieRecommenderSystemApplication.class, args);
	}

}
