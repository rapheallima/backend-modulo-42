package com.raphael.Modulo_42.Pedidos.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raphael.Modulo_42.Pedidos.Main.Pedido;
import com.raphael.Modulo_42.Pedidos.Service.PedidoService;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

	@Autowired
	private PedidoService pedidoService;

	@PostMapping
	public Pedido criarPedido(@RequestBody Pedido pedido) {
		return pedidoService.processarPedido(pedido);
	}

	@GetMapping("/{id}")
	public Pedido buscarPedido(@PathVariable Long id) {
		return pedidoService.buscarPedidoPorId(id);
	}

}
