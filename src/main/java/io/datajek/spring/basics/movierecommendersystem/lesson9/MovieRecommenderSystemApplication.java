package io.datajek.spring.basics.movierecommendersystem.lesson9;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"io.datajek.spring.basics.movierecommendersystem.lesson3",
"io.datajek.spring.basics.movierecommendersystem.lesson9"})
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {
		ApplicationContext appContext = 
			SpringApplication.run(MovieRecommenderSystemApplication.class, args);
		ContentBasedFilter filter = appContext.getBean(ContentBasedFilter.class);
		System.out.println("\nContentBasedFilter bean with singleton scope");
		System.out.println(filter);

		Movie movie1 = filter.getMovie();
		Movie movie2 = filter.getMovie();
		Movie movie3 = filter.getMovie();
		
		System.out.println("\nMovie bean with prototype scope");
		System.out.println(movie1);
		System.out.println(movie2);
		System.out.println(movie3);

		//Print number of instances of each bean
		System.out.println("\nContentBasedFilter instances created: "+ ContentBasedFilter.getInstances());
		System.out.println("Movie instances created: "+ Movie.getInstances());

		System.out.println("ContentBasedFilter bean found = " + 
                                              appContext.containsBean("contentBasedFilter"));
        System.out.println("CollaborativeFilter bean found = " + 
                                              appContext.containsBean("COF"));
	}

}
