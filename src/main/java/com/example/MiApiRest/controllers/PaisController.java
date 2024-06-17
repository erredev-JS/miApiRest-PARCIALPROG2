package com.example.MiApiRest.controllers;

import com.example.MiApiRest.entities.Pais;
import com.example.MiApiRest.services.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pais")
public class PaisController extends BaseController<Pais, Long> {
    @Autowired
    public PaisController(PaisService paisService){
        super(paisService);
    }
}
