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
import org.springframework.security.access.annotation.Secured;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.inventory.entities.Products;
import com.inventory.services.IProductService;



@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class ProductController {

	@Autowired
	private IProductService productService;

	@GetMapping("/products")
	public List<Products> getProducts() {
		return productService.findAll();
	}	

	@Secured({"ROLE_ADMIN", "ROLE_USER"})
	@GetMapping(path = "/getProductsById")
	public ResponseEntity<?> getProductsById(@RequestParam(required = true) String ref) {
		
		Products product = null;
		Map<String, Object> response = new HashMap<>();
		try {
			product = productService.findByref(ref);
		}catch(DataAccessException e){
			response.put("mensaje", "Error al realizar la consulta en la base de datos");
			response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		if(product == null) {
			response.put("mensaje", "El producto ID: ".concat(ref.toString().concat(" no existe en la base de datos!")));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<Products>(product, HttpStatus.OK);
	}
	
	@Secured({"ROLE_ADMIN", "ROLE_USER"})
	@PostMapping("/createProduct")
	public ResponseEntity<?> createProduct(@Valid @RequestBody Products product, BindingResult result) {
		
		Products NewProduct = null;
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
			NewProduct = productService.save(product);
		} catch(DataAccessException e) {
			response.put("mensaje", "Error al realizar el insert en la base de datos");
			response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		response.put("mensaje", "El producto ha sido creado con éxito!");
		response.put("cliente", NewProduct);
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.CREATED);
	}
	
	
	@Secured({"ROLE_ADMIN", "ROLE_USER"})
	@DeleteMapping("/deleteByRef")
	public ResponseEntity<?> delete(@RequestParam(required = true) String ref) {
			
			Map<String, Object> response = new HashMap<>();
			
			try {
				
				productService.delete(ref);
				
			} catch (DataAccessException e) {
				response.put("mensaje", "Error al eliminar el Producto de la base de datos");
				response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
				return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
			}
			
			response.put("mensaje", "El producto fue eliminado con éxito!");
			
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
		}
	
	
}
