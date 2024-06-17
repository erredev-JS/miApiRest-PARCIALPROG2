package com.example.MiApiRest.controllers;

import com.example.MiApiRest.entities.UnidadMedida;
import com.example.MiApiRest.services.UnidadMedidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/unidad_medida")
public class UnidadMedidaController extends BaseController<UnidadMedida,Long>{
    @Autowired
    public UnidadMedidaController(UnidadMedidaService unidadMedidaService){
        super(unidadMedidaService);
    }
}
