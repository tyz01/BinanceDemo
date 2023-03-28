package com.example.binance.client;

import com.example.binance.model.BinanceTickerPrice;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "binanceFeignClient", url = "${binance.apiBaseUrl}")
public interface BinanceFeignClient {
    @GetMapping("/api/v3/ticker/price")
    List<BinanceTickerPrice> getTickerPrices();

}
