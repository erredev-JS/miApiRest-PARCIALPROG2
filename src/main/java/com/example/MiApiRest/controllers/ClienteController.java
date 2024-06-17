package com.example.MiApiRest.controllers;
import com.example.MiApiRest.entities.Cliente;
import com.example.MiApiRest.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clientes")
public class ClienteController extends BaseController<Cliente,Long> {

    @Autowired
    public ClienteController (ClienteService clienteService){
        super(clienteService);
    }
}