package com.inventory.services;

import java.util.List;

import com.inventory.entities.Providers;

public interface IProvidersService {

	public List<Providers> findAll();
	
	public Providers findById(Long provider_id);
	
	public Providers save(Providers provider);
	
}
