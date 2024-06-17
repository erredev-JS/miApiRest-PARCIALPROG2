package com.example.MiApiRest.controllers;

import com.example.MiApiRest.entities.Articulo;
import com.example.MiApiRest.services.ArticuloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "/articulo")
public class ArticuloController extends BaseController<Articulo,Long>{
    @Autowired
    public ArticuloController(ArticuloService articuloService){
        super(articuloService);
    }
}
