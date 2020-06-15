package com.inventory.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventory.entities.ActionsHistoric;
import com.inventory.repository.IActionHistoricRepository;

@Service
public class ActionHistoricImpl implements IActionHistoricService{

	
	@Autowired
	IActionHistoricRepository iActionHistoricRepository;
	
	@Override
	public List<ActionsHistoric> findAll() {

		return iActionHistoricRepository.findAll();
	}

}
