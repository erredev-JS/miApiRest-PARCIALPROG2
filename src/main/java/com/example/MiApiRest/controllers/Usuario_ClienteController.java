package com.example.MiApiRest.controllers;

import com.example.MiApiRest.entities.Usuario_Cliente;
import com.example.MiApiRest.services.Usuario_ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario_cliente")
public class Usuario_ClienteController extends BaseController<Usuario_Cliente,Long>{
    @Autowired
    public Usuario_ClienteController(Usuario_ClienteService usuario_clienteService){
        super(usuario_clienteService);
    }
}
