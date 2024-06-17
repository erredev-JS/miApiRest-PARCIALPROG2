package com.example.MiApiRest.controllers;

import com.example.MiApiRest.entities.Base;
import com.example.MiApiRest.entities.Sucursal;
import com.example.MiApiRest.services.SucursalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sucursal")
public class SucursalController extends BaseController<Sucursal,Long> {
    @Autowired
    public SucursalController (SucursalService sucursalService){
        super(sucursalService);
    }
}
