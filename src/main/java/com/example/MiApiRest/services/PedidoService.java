package com.example.MiApiRest.services;

import com.example.MiApiRest.entities.Pedido;
import com.example.MiApiRest.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class PedidoService extends BaseService<Pedido, Long> {
    @Autowired
    public PedidoService (PedidoRepository pedidoRepository){
        super(pedidoRepository);
    }
}
