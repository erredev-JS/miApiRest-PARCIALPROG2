package com.example.MiApiRest.controllers;

import com.example.MiApiRest.entities.Imagen_Cliente;
import com.example.MiApiRest.services.Imagen_ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/imagen_cliente")
public class Imagen_ClienteController extends BaseController<Imagen_Cliente,Long>{
    @Autowired
    public Imagen_ClienteController(Imagen_ClienteService imagen_clienteService){
        super(imagen_clienteService);
    }
}
