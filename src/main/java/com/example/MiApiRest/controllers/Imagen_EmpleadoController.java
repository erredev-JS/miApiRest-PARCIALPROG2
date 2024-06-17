package com.example.MiApiRest.controllers;

import com.example.MiApiRest.entities.Imagen_Empleado;
import com.example.MiApiRest.services.Imagen_EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/imagen_empleado")
public class Imagen_EmpleadoController extends BaseController<Imagen_Empleado,Long>{
    @Autowired
    public Imagen_EmpleadoController(Imagen_EmpleadoService imagen_empleadoService){
        super(imagen_empleadoService);
    }
}
