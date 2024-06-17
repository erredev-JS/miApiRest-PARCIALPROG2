package com.example.MiApiRest.controllers;

import com.example.MiApiRest.entities.ImagenArticulo;
import com.example.MiApiRest.services.ImagenArticuloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/imagen_articulo")
public class ImagenArticuloController extends BaseController<ImagenArticulo,Long>{
    @Autowired
    public ImagenArticuloController(ImagenArticuloService imagenArticuloService){
        super(imagenArticuloService);
    }
}
