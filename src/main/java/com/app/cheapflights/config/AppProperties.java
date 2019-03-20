package com.app.cheapflights.config;


import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Setter
@Getter
@ConfigurationProperties( prefix = "app" )
public class AppProperties {

    @Value("${app.skyscanner-api.url}") private String apiUrl;
    @Value("${app.skyscanner-api.token-name}") private String tokenName;
    @Value("${app.skyscanner-api.token-value}") private String tokenValue;

}
