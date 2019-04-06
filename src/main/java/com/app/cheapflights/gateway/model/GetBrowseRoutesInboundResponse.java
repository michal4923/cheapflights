package com.app.cheapflights.gateway.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Routes",
        "Quotes",
        "Places",
        "Carriers",
        "Currencies"
})
public class GetBrowseRoutesInboundResponse {
    @JsonProperty("Routes")
    private List<Object> routes = null;
    @JsonProperty("Quotes")
    private List<Quote> quotes = null;
    @JsonProperty("Places")
    private List<Place> places = null;
    @JsonProperty("Carriers")
    private List<Carrier> carriers = null;
    @JsonProperty("Currencies")
    private List<Currency> currencies = null;

    @JsonProperty("Routes")
    public List<Object> getRoutes() {
        return routes;
    }

    @JsonProperty("Routes")
    public void setRoutes(List<Object> routes) {
        this.routes = routes;
    }

    @JsonProperty("Quotes")
    public List<Quote> getQuotes() {
        return quotes;
    }

    @JsonProperty("Quotes")
    public void setQuotes(List<Quote> quotes) {
        this.quotes = quotes;
    }

    @JsonProperty("Places")
    public List<Place> getPlaces() {
        return places;
    }

    @JsonProperty("Places")
    public void setPlaces(List<Place> places) {
        this.places = places;
    }

    @JsonProperty("Carriers")
    public List<Carrier> getCarriers() {
        return carriers;
    }

    @JsonProperty("Carriers")
    public void setCarriers(List<Carrier> carriers) {
        this.carriers = carriers;
    }

    @JsonProperty("Currencies")
    public List<Currency> getCurrencies() {
        return currencies;
    }

    @JsonProperty("Currencies")
    public void setCurrencies(List<Currency> currencies) {
        this.currencies = currencies;
    }
}

