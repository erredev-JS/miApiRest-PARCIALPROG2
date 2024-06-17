package com.example.MiApiRest.controllers;

import com.example.MiApiRest.entities.UsuarioEmpleado;
import com.example.MiApiRest.services.UsuarioEmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario_empleado")
public class UsuarioEmpleadoController extends BaseController<UsuarioEmpleado,Long>{
    @Autowired
    public UsuarioEmpleadoController(UsuarioEmpleadoService usuarioEmpleadoService){
        super(usuarioEmpleadoService);
    }
}
