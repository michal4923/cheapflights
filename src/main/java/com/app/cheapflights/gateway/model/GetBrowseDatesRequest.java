package com.app.cheapflights.gateway.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class GetBrowseDatesRequest implements SkyscannerRequest{
    private static final String serviceName = "browsedates/v1.0/";

    @NonNull private String country;
    @NonNull private String currency;
    @NonNull private String locale;
    @NonNull private String originPlace;
    @NonNull private String destinationPlace;
    @NonNull private String outboundPartialDate;
    private String inboundPartialDate;
    @Override
    public String paramsToQuery() {
        String tmpInboundPartialDate = (inboundPartialDate == null || inboundPartialDate.equals("")) ? ""
                : "?inboundpartialdate=" + inboundPartialDate;
        return  serviceName +
                this.getCountry() + "/" +
                this.getCurrency() + "/" +
                this.getLocale() + "/" +
                this.getOriginPlace() + "/" +
                this.getDestinationPlace() + "/" +
                this.getOutboundPartialDate() +
                tmpInboundPartialDate;
    }
}
