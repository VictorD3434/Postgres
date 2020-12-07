package com.registro.service;

import java.util.List;

import com.registro.model.Usuario;

public interface UsuarioService {
	
	List<Usuario> listarId(int id);
	List<Usuario> listarCorreo(String correo);
	Usuario add(Usuario u);
	Usuario update(Usuario u);
	Usuario deleteId(int id);
}
