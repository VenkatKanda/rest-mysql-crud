package com.venku.restcrud.repository;

import com.venku.restcrud.model.Stock;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface StockRepoInterface extends CrudRepository<Stock, UUID> {



}
