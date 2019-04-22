package com.app.cheapflights.controller;

import com.app.cheapflights.gateway.SkyscannerHttpCalls;
import com.app.cheapflights.gateway.model.GetListPlacesRequest;
import com.app.cheapflights.gateway.model.GetListPlacesResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    private SkyscannerHttpCalls skyscannerHttpCalls;

    @GetMapping("/")
    public ResponseEntity<GetListPlacesResponse> getAppDetails() {
        //sample request
        GetListPlacesRequest getListPlacesRequest = new GetListPlacesRequest("Stockholm", "UK", "GBP", "en-Gb");

        return skyscannerHttpCalls.getListPlaces(getListPlacesRequest);
    }
}
