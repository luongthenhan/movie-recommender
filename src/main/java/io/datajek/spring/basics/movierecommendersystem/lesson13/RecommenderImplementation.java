package io.datajek.spring.basics.movierecommendersystem.lesson13;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {

    private Filter filter;

    //constructor injection
    @Autowired
    public RecommenderImplementation(@Qualifier("CBF") Filter filter) {
        super();
        this.filter = filter;
        System.out.println("Constructor invoked...");
    }

    public String[] recommendMovies(String movie) {
        //print the name of interface implementation being used
        System.out.println("Name of the filter in RecommenderImplementation: " + this.filter + "\n");
        String[] results = this.filter.getRecommendations("Finding Dory");
        return results;
    }
}
