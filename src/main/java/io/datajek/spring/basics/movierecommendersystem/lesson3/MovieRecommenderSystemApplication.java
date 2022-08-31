package io.datajek.spring.basics.movierecommendersystem.lesson3;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {
		//RecommenderImplementation recommender = new RecommenderImplementation(new CollaborativeFilter());
		ApplicationContext appContext = 
			SpringApplication.run(MovieRecommenderSystemApplication.class, args);
		RecommenderImplementation recommender = appContext.getBean(RecommenderImplementation.class);
		String[] results = recommender.recommendMovies("Finding Dory");
		System.out.println(Arrays.toString(results));

		RecommendationMovie recommendation = appContext.getBean(RecommendationMovie.class);
		String[] results2 = recommendation.recommendMovies("Finding Dory");
		System.out.println(Arrays.toString(results2));
	}

}
