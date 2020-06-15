package com.inventory.services;

import java.util.List;

import com.inventory.entities.Stock;

public interface IStockService {

	public List<Stock> findAll();
}
