package com.app.cheapflights;

import com.app.cheapflights.config.AppConfig;
import com.app.cheapflights.gateway.SkyscannerHttpCalls;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableConfigurationProperties ( AppConfig.class )
@SpringBootApplication
@EnableAutoConfiguration
public class CheapflightsApplication {

	@Autowired
	AppConfig appConfig;
	public static void main(String[] args) {
		SpringApplication.run(CheapflightsApplication.class, args);
		CheapflightsApplication cheapflightsApplication = new CheapflightsApplication();
		System.out.println( cheapflightsApplication.appConfig.getHeadername());
		//SkyscannerHttpCalls skyscannerHttpCalls = new SkyscannerHttpCalls();
		//System.out.println("getListPlaces() return:");
		//System.out.println(skyscannerHttpCalls.getListPlaces().getBody().getPlaces().toString());
	}

}
