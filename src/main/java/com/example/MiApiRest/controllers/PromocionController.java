package com.example.MiApiRest.controllers;

import com.example.MiApiRest.entities.Base;
import com.example.MiApiRest.entities.Promocion;
import com.example.MiApiRest.services.PromocionService;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/promocion")
public class PromocionController extends BaseController<Promocion,Long> {
    @Autowired
    public PromocionController(PromocionService promocionService){
        super(promocionService);
    }
}
