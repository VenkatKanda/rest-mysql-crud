package com.venku.restcrud.controller;

import com.venku.restcrud.model.Stock;
import com.venku.restcrud.service.StockService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/api/v1/stock")
public class StockController {

    Logger logger = LoggerFactory.getLogger(StockController.class.getName());

    @Value("${company.name}")
    private String companyData;

    @Autowired
    StockService stockService;

    @PostMapping(value="/create")
    public void saveStock(@RequestBody Stock stock){

        try {
            logger.info("save stocks called for company"+ companyData);
             stockService.saveStock(stock);
        } catch (Exception e) {
            logger.error("Exception caught on save  stocks" + e.getMessage());
        }
    }

    @GetMapping(value="/getAllStocks")
    public List<Stock> getAllStocks() {

        try {
            logger.info("Get all stocks called");
            return stockService.getAllStocks();
        } catch (Exception e) {
            logger.error("Exception caught on get all stocks" + e.getMessage());
        }
        return  null;
    }


}




