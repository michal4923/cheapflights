package com.app.cheapflights.gateway.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "PartialDate",
        "QuoteIds",
        "Price",
        "QuoteDateTime"
})
public class OutboundDate {
    @JsonProperty("PartialDate")
    private String partialDate;
    @JsonProperty("QuoteIds")
    private List<Integer> quoteIds = null;
    @JsonProperty("Price")
    private Integer price;
    @JsonProperty("QuoteDateTime")
    private String quoteDateTime;

    @JsonProperty("PartialDate")
    public String getPartialDate() {
        return partialDate;
    }

    @JsonProperty("PartialDate")
    public void setPartialDate(String partialDate) {
        this.partialDate = partialDate;
    }

    @JsonProperty("QuoteIds")
    public List<Integer> getQuoteIds() {
        return quoteIds;
    }

    @JsonProperty("QuoteIds")
    public void setQuoteIds(List<Integer> quoteIds) {
        this.quoteIds = quoteIds;
    }

    @JsonProperty("Price")
    public Integer getPrice() {
        return price;
    }

    @JsonProperty("Price")
    public void setPrice(Integer price) {
        this.price = price;
    }

    @JsonProperty("QuoteDateTime")
    public String getQuoteDateTime() {
        return quoteDateTime;
    }

    @JsonProperty("QuoteDateTime")
    public void setQuoteDateTime(String quoteDateTime) {
        this.quoteDateTime = quoteDateTime;
    }

}
