package com.example.MiApiRest.controllers;

import com.example.MiApiRest.entities.ArticuloManufacturado;
import com.example.MiApiRest.services.ArticuloManufacturadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "/articulo_manufacturado")
public class ArticuloManufacturadoController extends BaseController<ArticuloManufacturado,Long>{
    @Autowired
    public ArticuloManufacturadoController(ArticuloManufacturadoService articuloManufacturadoService){
        super(articuloManufacturadoService);
    }
}
