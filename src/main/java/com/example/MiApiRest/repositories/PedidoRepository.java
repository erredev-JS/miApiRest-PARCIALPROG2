package com.example.MiApiRest.repositories;

import com.example.MiApiRest.entities.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends BaseRepository<Pedido,Long> {
}
