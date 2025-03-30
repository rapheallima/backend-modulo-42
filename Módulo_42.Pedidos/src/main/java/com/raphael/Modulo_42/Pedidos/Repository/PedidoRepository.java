package com.raphael.Modulo_42.Pedidos.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.raphael.Modulo_42.Pedidos.Main.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}
