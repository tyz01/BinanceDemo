package com.example.binance.controller;

import com.example.binance.model.BinanceTickerPrice;
import com.example.binance.service.BinanceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class BinanceController {
    private final BinanceService binanceService;

    @GetMapping("/ticker-prices")
    public List<BinanceTickerPrice> getTickerPrices() {
        return binanceService.getTickerPrices();
    }

}
