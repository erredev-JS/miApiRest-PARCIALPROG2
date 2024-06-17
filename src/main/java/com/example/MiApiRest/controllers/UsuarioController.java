package com.example.MiApiRest.controllers;

import com.example.MiApiRest.entities.Usuario;
import com.example.MiApiRest.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/usuarios")
public class UsuarioController extends BaseController<Usuario,Long> {
    @Autowired
    UsuarioController(UsuarioService usuarioService){
        super(usuarioService);
    }
}
