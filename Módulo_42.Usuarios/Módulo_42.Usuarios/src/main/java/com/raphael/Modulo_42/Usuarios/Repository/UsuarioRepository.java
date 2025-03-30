package com.raphael.Modulo_42.Usuarios.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.raphael.Modulo_42.Usuarios.Main.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
