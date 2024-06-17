package com.example.MiApiRest.services;

import com.example.MiApiRest.entities.DetallePedido;
import com.example.MiApiRest.repositories.DetallePedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetallePedidoService extends BaseService<DetallePedido,Long>{
    @Autowired
    DetallePedidoService(DetallePedidoRepository detallePedidoRepository){
        super(detallePedidoRepository);
    }
}
