package io.datajek.spring.basics.movierecommendersystem.lesson13;

import org.springframework.stereotype.Component;

@Component("COF")
public class CollaborativeFilter implements Filter {
    public String[] getRecommendations(String movie) {
        return new String[]{"Finding Nemo", "Ice Age", "Toy Story"};
    }
}
