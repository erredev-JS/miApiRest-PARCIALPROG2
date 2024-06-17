package com.example.MiApiRest.controllers;

import com.example.MiApiRest.entities.Imagen;
import com.example.MiApiRest.services.ImagenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/imagen")
public class ImagenController extends BaseController<Imagen,Long>{
    @Autowired
    public ImagenController(ImagenService imagenService){
        super(imagenService);
    }
}