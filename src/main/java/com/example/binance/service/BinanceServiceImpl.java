package com.example.binance.service;

import com.example.binance.client.BinanceFeignClient;
import com.example.binance.model.BinanceTickerPrice;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BinanceServiceImpl implements BinanceService {
    private BinanceFeignClient binanceFeignClient;

    @Autowired
    public BinanceServiceImpl(BinanceFeignClient binanceFeignClient) {
        this.binanceFeignClient = binanceFeignClient;
    }
    @Override
    public List<BinanceTickerPrice> getTickerPrices() {
        return binanceFeignClient.getTickerPrices();
    }
}
