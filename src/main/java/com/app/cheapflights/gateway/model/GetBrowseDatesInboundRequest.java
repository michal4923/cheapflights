package com.app.cheapflights.gateway.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class GetBrowseDatesInboundRequest implements SkyscannerRequest{
    private static final String serviceName = "browsedates/v1.0/";

    private String country;
    private String currency;
    private String locale;
    private String originPlace;
    private String destinationPlace;
    private String outboundPartialDate;
    private String inboundPartialDate;

    @Override
    public String paramsToQuery() {
        return  serviceName +
                this.getCountry() + "/" +
                this.getCurrency() + "/" +
                this.getLocale() + "/" +
                this.getOriginPlace() + "/" +
                this.getDestinationPlace() + "/" +
                this.getOutboundPartialDate() + "/" +
                this.getInboundPartialDate();
    }
}
