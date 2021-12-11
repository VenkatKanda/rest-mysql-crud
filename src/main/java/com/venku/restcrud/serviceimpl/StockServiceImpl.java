package com.venku.restcrud.serviceimpl;

import com.venku.restcrud.model.Stock;
import com.venku.restcrud.repository.StockRepoInterface;
import com.venku.restcrud.service.StockService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class StockServiceImpl implements StockService {

    Logger logger = LoggerFactory.getLogger(StockServiceImpl.class.getName());

    @Autowired
    StockRepoInterface stockRepoInterface;

    @Override
    public List<Stock> getAllStocks() {
        return StreamSupport.stream(stockRepoInterface.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }

    @Override
    public List<Stock> getStockByUser(String userName) {
        return null;
    }

    @Override
    public void saveStock(Stock stock) {
        logger.info("save stocks called in impl class");
        stockRepoInterface.save(stock);
    }

    @Override
    public void updateStock(Stock stock) {

    }

    @Override
    public void deleteStock(UUID uuid) {

    }
}
