package com.app.cheapflights;

import com.app.cheapflights.gateway.SkyscannerHttpCalls;
import com.app.cheapflights.gateway.model.Place;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class CheapflightsApplication {
	public static void main(String[] args) {
		SpringApplication.run(CheapflightsApplication.class, args);

		SkyscannerHttpCalls skyscannerHttpCalls = new SkyscannerHttpCalls();
		System.out.println("getListPlaces() return:");
		System.out.println(skyscannerHttpCalls.getListPlaces().getBody().getPlaces().toString());
	}

}
