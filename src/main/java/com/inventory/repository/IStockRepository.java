package com.inventory.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.inventory.entities.Stock;

public interface IStockRepository extends CrudRepository<Stock, String>{

	public List<Stock> findAll();
}
