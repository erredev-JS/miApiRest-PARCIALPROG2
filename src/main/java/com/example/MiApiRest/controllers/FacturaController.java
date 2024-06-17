package com.example.MiApiRest.controllers;

import com.example.MiApiRest.entities.Base;
import com.example.MiApiRest.entities.Factura;
import com.example.MiApiRest.services.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/factura")
public class FacturaController extends BaseController<Factura,Long> {
    @Autowired
    public FacturaController(FacturaService facturaService){
        super(facturaService);
    }
}
