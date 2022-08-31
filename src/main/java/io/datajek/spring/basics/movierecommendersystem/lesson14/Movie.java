package io.datajek.spring.basics.movierecommendersystem.lesson14;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;

@Repository
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Movie {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public Movie() {
		super();
		logger.info("In Movie constructor method");     
	}
	
	@PostConstruct
	private void postConstruct() {
		//initialization code
		logger.info("In Movie postConstruct method");
	}

	@PreDestroy
	private void preDestroy() {
		//cleanup code
		logger.info("In Movie preDestroy method");
	} 
}