package com.venku.restcrud.service;

import com.venku.restcrud.model.Stock;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

public interface StockService {

   public List<Stock> getAllStocks();

   public List<Stock> getStockByUser(String userName);

   public void saveStock(Stock stock);

   public void updateStock(Stock stock);

   public void deleteStock(UUID uuid);

}
