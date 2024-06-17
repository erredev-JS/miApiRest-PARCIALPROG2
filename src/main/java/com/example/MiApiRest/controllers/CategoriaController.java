package com.example.MiApiRest.controllers;

import com.example.MiApiRest.entities.Categoria;
import com.example.MiApiRest.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "/categoria")

public class CategoriaController extends BaseController<Categoria,Long> {
    @Autowired
    public CategoriaController(CategoriaService categoriaService){
        super(categoriaService);
    }
}
