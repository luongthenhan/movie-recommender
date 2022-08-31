package io.datajek.spring.basics.movierecommendersystem.lesson13;

import java.util.Arrays;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext appContext = 
			new AnnotationConfigApplicationContext(MovieRecommenderSystemApplication.class);
		RecommenderImplementation recommender = appContext.getBean(RecommenderImplementation.class);
		String[] results = recommender.recommendMovies("Finding Dory");
		System.out.println(Arrays.toString(results));
		appContext.close();
	}

}
