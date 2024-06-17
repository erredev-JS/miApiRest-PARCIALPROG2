package com.example.MiApiRest.controllers;

import com.example.MiApiRest.entities.Provincia;
import com.example.MiApiRest.services.ProvinciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provincia")
public class ProvinciaController extends BaseController<Provincia,Long>{
    @Autowired
    public ProvinciaController (ProvinciaService provinciaService){
        super(provinciaService);
    }
}
