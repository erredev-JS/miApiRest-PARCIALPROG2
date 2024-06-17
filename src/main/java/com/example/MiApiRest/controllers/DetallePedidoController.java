package com.example.MiApiRest.controllers;

import com.example.MiApiRest.entities.DetallePedido;
import com.example.MiApiRest.services.DetallePedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/detalle_pedido")
public class DetallePedidoController extends BaseController<DetallePedido,Long>{
    @Autowired
    public DetallePedidoController(DetallePedidoService detallePedidoService){
        super(detallePedidoService);
    }
}
