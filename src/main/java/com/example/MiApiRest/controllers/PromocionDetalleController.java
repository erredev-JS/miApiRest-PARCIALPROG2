package com.example.MiApiRest.controllers;

import com.example.MiApiRest.entities.PromocionDetalle;
import com.example.MiApiRest.services.PromocionDetalleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/promocion_detalle")
public class PromocionDetalleController extends BaseController<PromocionDetalle,Long> {
    @Autowired
    public PromocionDetalleController(PromocionDetalleService promocionDetalleService){
        super(promocionDetalleService);
    }
}
