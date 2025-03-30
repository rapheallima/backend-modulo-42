package com.raphael.Modulo_42.Usuarios.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raphael.Modulo_42.Usuarios.Main.Usuario;
import com.raphael.Modulo_42.Usuarios.Service.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;

	@PostMapping
	public Usuario criarUsuario(@RequestBody Usuario usuario) {
		return usuarioService.salvarUsuario(usuario);
	}

	@GetMapping("/{id}")
	public Usuario buscarUsuario(@PathVariable Long id) {
		return usuarioService.buscarUsuarioPorId(id);
	}

}
