package com.example.binance.service;

import com.example.binance.model.BinanceTickerPrice;

import java.util.List;

public interface BinanceService {
    List<BinanceTickerPrice> getTickerPrices();
}
