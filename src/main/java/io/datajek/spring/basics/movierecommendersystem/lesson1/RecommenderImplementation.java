package io.datajek.spring.basics.movierecommendersystem.lesson1;

public class RecommenderImplementation {
    private Filter filter;

    public RecommenderImplementation(Filter filter) {
        this.filter = filter;
    }

    public String[] recommendMovies(String movie) {
        //print the name of interface implementation being used
        System.out.println("Name of the filter in use: " + this.filter + "\n");
        String[] results = this.filter.getRecommendations("Finding Dory");
        return results;
    }
}
