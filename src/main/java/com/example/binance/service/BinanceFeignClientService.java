//package com.example.binance.service;
//
//import com.example.binance.client.BinanceFeignClient;
//import com.example.binance.model.BinanceTickerPrice;
//import com.example.binance.response.ResponceTeckerPrice;
//import lombok.AllArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Service;
//import org.springframework.web.client.RestTemplate;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.Objects;
//
//@Service
//@AllArgsConstructor
//public class BinanceFeignClientService implements BinanceFeignClient {
//    private  RestTemplate restTemplate;
//    @Override
//    public List<BinanceTickerPrice> getTickerPrices() {
//        return Arrays.asList(Objects.requireNonNull(restTemplate.getForObject("https://api.binance.com/api/v3/ticker/price", BinanceTickerPrice[].class)));
//    }
//}
