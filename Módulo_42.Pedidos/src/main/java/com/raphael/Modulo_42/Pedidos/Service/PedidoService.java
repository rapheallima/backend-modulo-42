package com.raphael.Modulo_42.Pedidos.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raphael.Modulo_42.Pedidos.Main.Pedido;
import com.raphael.Modulo_42.Pedidos.Repository.PedidoRepository;
import com.raphael.Modulo_42.Usuarios.Main.Usuario;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository pedidoRepository;

	@Autowired
	private UsuarioClient usuarioClient;

	public Pedido processarPedido(Pedido pedido) {
		Usuario usuario = usuarioClient.buscarUsuario(pedido.getUsuarioId());

		if (usuario == null) {
			throw new RuntimeException("Usuário não encontrado");
		}

		pedido.setDescricao(pedido.getDescricao() + " (Nome do usuário: " + usuario.getNome() + ")");

		return pedidoRepository.save(pedido);
	}

	public Pedido buscarPedidoPorId(Long id) {
		return pedidoRepository.findById(id).orElseThrow(() -> new RuntimeException("Pedido não encontrado"));
	}

}
