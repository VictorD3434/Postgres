package com.registro.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.registro.model.Usuario;

public interface UsuarioDAO extends JpaRepository<Usuario, Integer> {
	
	List<Usuario> findById(int id);
	List<Usuario> findByEmail(String correo);
	@SuppressWarnings("unchecked")
	Usuario save(Usuario u);
	Usuario deleteById(int id);
}
