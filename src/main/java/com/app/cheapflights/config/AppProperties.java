package com.app.cheapflights.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:skyscanner-api.properties")
@ConfigurationProperties( prefix = "app" )
public class AppProperties {

    @Value("${app.skyscanner-api.url}") private String apiUrl;
    @Value("${app.skyscanner-api.token-name}") private String tokenName;
    @Value("${app.skyscanner-api.token-value}") private String tokenValue;

    public String getTokenName() {
        return tokenName;
    }

    public void setTokenName(String tokenName) {
        this.tokenName = tokenName;
    }

    public String getTokenValue() {
        return tokenValue;
    }

    public void setTokenValue(String tokenValue) {
        this.tokenValue = tokenValue;
    }

    public String getApiUrl() {
        return apiUrl;
    }

    public void setApiUrl(String apiUrl) {
        this.apiUrl = apiUrl;
    }
}
