package com.inventory.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventory.entities.Actions;
import com.inventory.repository.IActionsRepository;

@Service
public class ActionsServiceImpl implements IActionsService {
	
	
	@Autowired
	IActionsRepository actionsRepository;

	@Override
	public List<Actions> findAll() {
		
		return actionsRepository.findAll();
	}

}
