package com.inventory.services;

import com.inventory.entities.Usuario;

public interface IUsuarioService {

	public Usuario findByUsername(String username);
}
