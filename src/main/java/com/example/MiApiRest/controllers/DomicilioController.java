package com.example.MiApiRest.controllers;

import com.example.MiApiRest.entities.Domicilio;
import com.example.MiApiRest.services.DomicilioService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/domicilio")
public class DomicilioController extends BaseController<Domicilio,Long>{
    public DomicilioController (DomicilioService domicilioService){
        super(domicilioService);
    }
}
