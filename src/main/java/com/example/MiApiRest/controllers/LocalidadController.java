package com.example.MiApiRest.controllers;

import com.example.MiApiRest.entities.Localidad;
import com.example.MiApiRest.services.LocalidadService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/localidad")
public class LocalidadController extends BaseController<Localidad,Long>{
    public LocalidadController (LocalidadService localidadService){
        super(localidadService);
    }
}
