package com.inventory.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.inventory.entities.Products;
import com.inventory.entities.Providers;
import com.inventory.services.IProvidersService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class ProvidersController {

	@Autowired
	private IProvidersService providersService;
	
	@GetMapping("/providers")
	public List<Providers> getProviders() {
		return providersService.findAll();
	}	
	
	@GetMapping(path = "/getProviderById")
	public ResponseEntity<?> getProductsById(@RequestParam(required = true) Long provider_id) {
		
		Providers provider = null;
		Map<String, Object> response = new HashMap<>();
		try {
			provider = providersService.findById(provider_id);
		}catch(DataAccessException e){
			response.put("mensaje", "Error al realizar la consulta en la base de datos");
			response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		if(provider == null) {
			response.put("mensaje", "El provider ID: ".concat(provider_id.toString().concat(" no existe en la base de datos!")));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<Providers>(provider, HttpStatus.OK);
	}
	
	
	
	@PostMapping("/createProvider")
	public ResponseEntity<?> createProvider(@Valid @RequestBody Providers provider, BindingResult result) {
		
		Providers NewProduct = null;
		Map<String, Object> response = new HashMap<>();
		
		if(result.hasErrors()) {

			List<String> errors = result.getFieldErrors()
					.stream()
					.map(err -> "El campo '" + err.getField() +"' "+ err.getDefaultMessage())
					.collect(Collectors.toList());
			
			response.put("errors", errors);
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.BAD_REQUEST);
		}
		
		try {
			NewProduct = providersService.save(provider);
		} catch(DataAccessException e) {
			response.put("mensaje", "Error al realizar el insert en la base de datos");
			response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		response.put("mensaje", "El provider ha sido creado con éxito!");
		response.put("cliente", NewProduct);
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.CREATED);
	}
	
	
}
