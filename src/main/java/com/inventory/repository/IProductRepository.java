package com.inventory.repository;

import java.util.List;


import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.inventory.entities.Products;


public interface IProductRepository extends CrudRepository<Products, String> {
	
	public List<Products> findAll();
	
	public Products findByref(@Param("ref") String ref);
	
//  if i want to make a native query
//	@Modifying
//	@Query(value="DELETE FROM products  where ref = ref", nativeQuery = true)
	public void deleteByref(@Param("ref") String ref);

}
