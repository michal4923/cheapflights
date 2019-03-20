package com.app.cheapflights;

import com.app.cheapflights.config.AppProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties ( AppProperties.class )
@SpringBootApplication
public class CheapflightsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CheapflightsApplication.class, args);
	}

}
