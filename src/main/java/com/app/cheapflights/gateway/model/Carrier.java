package com.app.cheapflights.gateway.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "CarrierId",
        "Name"
})

public class Carrier {
    @JsonProperty("CarrierId")
    private Integer carrierId;
    @JsonProperty("Name")
    private String name;

    @JsonProperty("CarrierId")
    public Integer getCarrierId() {
        return carrierId;
    }

    @JsonProperty("CarrierId")
    public void setCarrierId(Integer carrierId) {
        this.carrierId = carrierId;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }
}