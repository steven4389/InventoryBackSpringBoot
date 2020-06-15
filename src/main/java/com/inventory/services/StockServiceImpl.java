package com.inventory.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.inventory.entities.Stock;
import com.inventory.repository.IStockRepository;

@Service
public class StockServiceImpl implements IStockService {

	@Autowired
	private IStockRepository iStockRepository;
	
	@Override
	@Transactional(readOnly = true)     
	public List<Stock> findAll() {
		// TODO Auto-generated method stub
		return (List<Stock>) iStockRepository.findAll();
	}

}
