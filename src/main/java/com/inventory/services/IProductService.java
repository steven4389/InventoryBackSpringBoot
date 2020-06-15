package com.inventory.services;

import java.util.List;

import com.inventory.entities.Products;

public interface IProductService {

	public List<Products> findAll();

	public Products save(Products product);
	
	public void delete(String ref);

	public Products findByref(String ref);
	
}
