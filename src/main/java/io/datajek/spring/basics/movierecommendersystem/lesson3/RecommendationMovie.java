package io.datajek.spring.basics.movierecommendersystem.lesson3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommendationMovie {

    private Filter filter;

    //setter injection	
    @Autowired
    @Qualifier("COF")
    public void setFilter(Filter filter) {
        this.filter = filter;
        System.out.println("Setter method invoked..");
    }


    public String[] recommendMovies(String movie) {
        //print the name of interface implementation being used
        System.out.println("Name of the filter in RecommendationMovie: " + this.filter + "\n");
        String[] results = this.filter.getRecommendations("Finding Dory");
        return results;
    }
}
