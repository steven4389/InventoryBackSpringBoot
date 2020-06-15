package com.inventory.repository;

import org.springframework.data.repository.CrudRepository;

import com.inventory.entities.Usuario;

public interface IUsuarioRepository extends CrudRepository<Usuario, Long>{

	public Usuario findByUsername(String username);
}
