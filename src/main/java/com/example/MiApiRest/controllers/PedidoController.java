package com.example.MiApiRest.controllers;
import com.example.MiApiRest.entities.Pedido;
import com.example.MiApiRest.services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pedidos")
public class PedidoController extends BaseController<Pedido, Long> {
    @Autowired
    public PedidoController(PedidoService pedidoService){
        super(pedidoService);
    }
}
