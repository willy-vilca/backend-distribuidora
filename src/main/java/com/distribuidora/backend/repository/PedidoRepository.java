package com.distribuidora.backend.repository;

import com.distribuidora.backend.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> { }
