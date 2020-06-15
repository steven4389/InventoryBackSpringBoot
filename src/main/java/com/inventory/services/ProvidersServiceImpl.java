package com.inventory.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.inventory.entities.Products;
import com.inventory.entities.Providers;
import com.inventory.repository.IProvidersRepository;
                                                                                           
@Service                                                                                   
public class ProvidersServiceImpl implements IProvidersService {                                                        
                                                                                           
	@Autowired                                                                               
	private IProvidersRepository iProvidersRepository;                                     
	                                                                                       
	                    
	@Override
	@Transactional(readOnly = true)                                                        
	public List<Providers> findAll() {                                
		return (List<Providers>) iProvidersRepository.findAll();      
	}


	@Override
	public Providers findById(Long provider_id) {
		// TODO Auto-generated method stub
		return iProvidersRepository.findByproviderId(provider_id);
	}


	@Override
	public Providers save(Providers provider) {
		// TODO Auto-generated method stub
		return iProvidersRepository.save(provider);
	}


	


	
}
