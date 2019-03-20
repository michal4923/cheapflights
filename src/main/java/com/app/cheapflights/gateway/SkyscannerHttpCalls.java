package com.app.cheapflights.gateway;

import com.app.cheapflights.config.AppProperties;
import com.app.cheapflights.gateway.model.GetListPlacesRequest;
import com.app.cheapflights.gateway.model.GetListPlacesResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class SkyscannerHttpCalls {

    @Autowired
    private AppProperties appProperties;

    private static final Logger logger = LogManager.getLogger(SkyscannerHttpCalls.class);

    public ResponseEntity<GetListPlacesResponse> getListPlaces(GetListPlacesRequest getListPlacesRequest){
        final String uri = appProperties.getApiUrl() + getListPlacesRequest.paramsToQuery();
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.set(appProperties.getTokenName(), appProperties.getTokenValue());
        HttpEntity<String> entity = new HttpEntity<>(headers);

        return restTemplate.exchange(uri, HttpMethod.GET, entity, new ParameterizedTypeReference<GetListPlacesResponse>(){});

    }
}
