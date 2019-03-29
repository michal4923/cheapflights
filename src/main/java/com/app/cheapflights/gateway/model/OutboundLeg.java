package com.app.cheapflights.gateway.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "CarrierIds",
        "OriginId",
        "DestinationId",
        "DepartureDate"
})
public class OutboundLeg {
    @JsonProperty("CarrierIds")
    private List<Integer> carrierIds = null;
    @JsonProperty("OriginId")
    private Integer originId;
    @JsonProperty("DestinationId")
    private Integer destinationId;
    @JsonProperty("DepartureDate")
    private String departureDate;

    @JsonProperty("CarrierIds")
    public List<Integer> getCarrierIds() {
        return carrierIds;
    }

    @JsonProperty("CarrierIds")
    public void setCarrierIds(List<Integer> carrierIds) {
        this.carrierIds = carrierIds;
    }

    @JsonProperty("OriginId")
    public Integer getOriginId() {
        return originId;
    }

    @JsonProperty("OriginId")
    public void setOriginId(Integer originId) {
        this.originId = originId;
    }

    @JsonProperty("DestinationId")
    public Integer getDestinationId() {
        return destinationId;
    }

    @JsonProperty("DestinationId")
    public void setDestinationId(Integer destinationId) {
        this.destinationId = destinationId;
    }

    @JsonProperty("DepartureDate")
    public String getDepartureDate() {
        return departureDate;
    }

    @JsonProperty("DepartureDate")
    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }
}
