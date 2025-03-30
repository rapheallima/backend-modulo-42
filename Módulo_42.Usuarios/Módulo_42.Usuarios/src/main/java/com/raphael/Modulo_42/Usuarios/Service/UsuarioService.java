package com.raphael.Modulo_42.Usuarios.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raphael.Modulo_42.Usuarios.Main.Usuario;
import com.raphael.Modulo_42.Usuarios.Repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	public Usuario salvarUsuario(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}

	public Usuario buscarUsuarioPorId(Long id) {
		return usuarioRepository.findById(id).orElse(null);
	}

}
