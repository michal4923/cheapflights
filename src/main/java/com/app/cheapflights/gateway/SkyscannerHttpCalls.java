package com.app.cheapflights.gateway;

import com.app.cheapflights.config.AppProperties;
import com.app.cheapflights.gateway.model.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class SkyscannerHttpCalls {

    @Autowired
    private AppProperties appProperties;

    private static final Logger logger = LogManager.getLogger(SkyscannerHttpCalls.class);

    public ResponseEntity<GetListPlacesResponse> getListPlaces(GetListPlacesRequest getListPlacesRequest){
        return new RestTemplate().exchange(
                createUrl(getListPlacesRequest),
                HttpMethod.GET,
                createHttpEntity(),
                new ParameterizedTypeReference<GetListPlacesResponse>(){});
    }

    public ResponseEntity<GetBrowseQuotesResponse> getBrowseQuotes(GetBrowseQuotesRequest getBrowseQuotesRequest){
        return new RestTemplate().exchange(
                createUrl(getBrowseQuotesRequest),
                HttpMethod.GET,
                createHttpEntity(),
                new ParameterizedTypeReference<GetBrowseQuotesResponse>(){});
    }

    public ResponseEntity<GetBrowseRoutesResponse> getBrowseRoutes(GetBrowseRoutesRequest getBrowseRoutesRequest){
        return new RestTemplate().exchange(
                createUrl(getBrowseRoutesRequest),
                HttpMethod.GET,
                createHttpEntity(),
                new ParameterizedTypeReference<GetBrowseRoutesResponse>(){});
    }

    public ResponseEntity<GetBrowseDatesResponse> getBrowseDates(GetBrowseDatesRequest getBrowseDatesRequest){
        return new RestTemplate().exchange(
                createUrl(getBrowseDatesRequest),
                HttpMethod.GET,
                createHttpEntity(),
                new ParameterizedTypeReference<GetBrowseDatesResponse>() {});
    }

    public ResponseEntity<GetBrowseDatesInboundResponse> getBrowseDatesInbound(GetBrowseDatesInboundRequest getBrowseDatesInboundRequest){
        return new RestTemplate().exchange(
                createUrl(getBrowseDatesInboundRequest),
                HttpMethod.GET,
                createHttpEntity(),
                new ParameterizedTypeReference<GetBrowseDatesInboundResponse>() {});
    }

    public ResponseEntity<GetBrowseQuotesInboundResponse> getBrowseQuotesInbound(GetBrowseQuotesInboundRequest getBrowseQuotesInboundRequest){
        return new RestTemplate().exchange(
                createUrl(getBrowseQuotesInboundRequest),
                HttpMethod.GET,
                createHttpEntity(),
                new ParameterizedTypeReference<GetBrowseQuotesInboundResponse>() {});
    }

    public ResponseEntity<GetBrowseRoutesInboundResponse> getBrowseRoutesInbound(GetBrowseRoutesInboundRequest getBrowseRoutesInboundRequest){
        return new RestTemplate().exchange(
                createUrl(getBrowseRoutesInboundRequest),
                HttpMethod.GET,
                createHttpEntity(),
                new ParameterizedTypeReference<GetBrowseRoutesInboundResponse>() {});
    }

    private HttpEntity<String> createHttpEntity(){
        HttpHeaders headers = new HttpHeaders();
        headers.set(appProperties.getTokenName(), appProperties.getTokenValue());
        return new HttpEntity<>(headers);
    }

    private String createUrl(SkyscannerRequest skyscannerRequest){
        return appProperties.getApiUrl() + skyscannerRequest.paramsToQuery();
    }
}
