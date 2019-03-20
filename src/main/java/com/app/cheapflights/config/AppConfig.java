package com.app.cheapflights.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
@Configuration
@PropertySource("classpath:skyscanner.properties")
@ConfigurationProperties(prefix = "skyscanner")
public class AppConfig {
    private String headername;
    private String headervalue;

    public String getHeadervalue() {
        return headervalue;
    }

    public void setHeadervalue( String headervalue ) {
        this.headervalue = headervalue;
    }

    public String getHeadername() {
        return headername;
    }

    public void setHeadername( String headername ) {
        this.headername = headername;
    }
}
