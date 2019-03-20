package com.app.cheapflights.gateway.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class GetListPlacesRequest {

    private static final String serviceName = "/autosuggest/v1.0/";

    private String query;
    private String country;
    private String currency;
    private String locale;

    public String paramsToQuery() {
        return  serviceName +
                this.getCountry() + "/" +
                this.getCurrency() + "/" +
                this.getLocale() + "/" +
                "?query=" + this.getQuery();
    }
}
