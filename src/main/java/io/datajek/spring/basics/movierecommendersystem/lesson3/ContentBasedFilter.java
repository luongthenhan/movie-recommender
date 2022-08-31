package io.datajek.spring.basics.movierecommendersystem.lesson3;

import org.springframework.stereotype.Component;

@Component("CBF")
// @Primary, cannot use Primary because it is used in both two Recommendations.
public class ContentBasedFilter implements Filter {
    public String[] getRecommendations(String movie) {
        return new String[]{"Happy Feet", "Ice Age", "Shark Tale"};
    }
}
