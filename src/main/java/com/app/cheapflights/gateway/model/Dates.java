package com.app.cheapflights.gateway.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "OutboundDates"
})
public class Dates {
    @JsonProperty("OutboundDates")
    private List<OutboundDate> outboundDates = null;

    @JsonProperty("OutboundDates")
    public List<OutboundDate> getOutboundDates() {
        return outboundDates;
    }

    @JsonProperty("OutboundDates")
    public void setOutboundDates(List<OutboundDate> outboundDates) {
        this.outboundDates = outboundDates;
    }
}
