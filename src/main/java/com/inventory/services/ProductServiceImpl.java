package com.inventory.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.inventory.entities.Products;
import com.inventory.repository.IProductRepository;

@Service
public class ProductServiceImpl implements IProductService {
	
	private Logger logger = LoggerFactory.getLogger(ProductServiceImpl.class);

	@Autowired
	private IProductRepository iProductRepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Products> findAll() {
		return (List<Products>) iProductRepository.findAll();
	}

	

	@Override
	@Transactional
	public Products save(Products product) {
		return iProductRepository.save(product);
	}

	@Override
	@Transactional
	public void delete(String ref) {
		// TODO Auto-generated method stub
		iProductRepository.deleteByref(ref);
	}


	@Override
	public Products findByref(String ref) {
		// TODO Auto-generated method stub
		return  iProductRepository.findByref(ref);	
	}

}
