package com.registro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.registro.dao.UsuarioDAO;
import com.registro.model.Usuario;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	
	@Autowired
	UsuarioDAO dao;
	
	
	@Override
	public List<Usuario> listarId(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

	@Override
	public Usuario add(Usuario u) {
		// TODO Auto-generated method stub
		return dao.save(u);
	}

	@Override
	public List<Usuario> listarCorreo(String correo) {
		// TODO Auto-generated method stub
		return dao.findByEmail(correo);
	}

	@Override
	public Usuario update(Usuario u) {
		// TODO Auto-generated method stub
		return dao.save(u);
	}

	@Override
	public Usuario deleteId(int id) {
		dao.deleteById(id);
		return null;
	}

}
