package com.raphael.Modulo_42.Pedidos.Service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.raphael.Modulo_42.Usuarios.Main.Usuario;

@FeignClient(name = "usuario-service", url = "http://localhost:8081")
public interface UsuarioClient {
	@GetMapping("/usuarios/{id}")
	Usuario buscarUsuario(@PathVariable Long id);
}
