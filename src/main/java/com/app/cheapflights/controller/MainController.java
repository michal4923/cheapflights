package com.app.cheapflights.controller;

import com.app.cheapflights.gateway.SkyscannerHttpCalls;
import com.app.cheapflights.gateway.model.GetBrowseQuotesRequest;
import com.app.cheapflights.gateway.model.GetBrowseQuotesResponse;
import com.app.cheapflights.gateway.model.GetListPlacesRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    private SkyscannerHttpCalls skyscannerHttpCalls;

    @GetMapping("/")
    public ResponseEntity<GetBrowseQuotesResponse> getAppDetails() {
        //sample request
        GetListPlacesRequest getListPlacesRequest = new GetListPlacesRequest("Stockholm", "UK", "GBP", "en-Gb");
        GetBrowseQuotesRequest getBrowseQuotesRequest = new GetBrowseQuotesRequest("US","USD", "en-US",
                "SFO-sky","JFK-sky", "2019-10-01", "2019-10-01");

        return skyscannerHttpCalls.getBrowseQuotes(getBrowseQuotesRequest);
    }
}
