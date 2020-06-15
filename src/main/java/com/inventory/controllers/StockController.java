package com.inventory.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.inventory.entities.Stock;
import com.inventory.services.IStockService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/stock")
public class StockController {

	@Autowired
	private IStockService iStockService;
	
	@GetMapping("/getAllStock")
	public List<Stock> getProviders() {
		return iStockService.findAll();
	}	
}
