package com.example.binance.config;

import com.example.binance.client.BinanceFeignClient;
import com.example.binance.service.BinanceServiceImpl;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
//@ConfigurationProperties(prefix = "binance")
@Getter
@Setter
public class BinanceConfig {

    @Value("${binance.apiKey}")
    private String apiKey;
    @Value("${binance.secretKey}")
    private String secretKey;
    @Value("${binance.apiBaseUrl}")
    private String apiBaseUrl;

//    @Bean
//    public RestTemplate configRestTemplate(){
//        return new RestTemplate();
//    }


}
