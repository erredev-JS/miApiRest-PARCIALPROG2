package com.example.MiApiRest.controllers;

import com.example.MiApiRest.entities.ArticuloManufacturado;
import com.example.MiApiRest.entities.ArticuloManufacturadoDetalle;
import com.example.MiApiRest.services.ArticuloManufacturadoDetalleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "articulo_manufacturado_detalle")
public class ArticuloManufacturadoDetalleController extends BaseController<ArticuloManufacturadoDetalle,Long>{
    @Autowired
    public ArticuloManufacturadoDetalleController(ArticuloManufacturadoDetalleService articuloManufacturadoDetalleService){
        super(articuloManufacturadoDetalleService);
    }
}
