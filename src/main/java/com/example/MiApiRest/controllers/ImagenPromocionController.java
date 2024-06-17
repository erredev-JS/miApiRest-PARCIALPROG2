package com.example.MiApiRest.controllers;

import com.example.MiApiRest.entities.ImagenPromocion;
import com.example.MiApiRest.services.ImagenPromocionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/imagen_promocion")
public class ImagenPromocionController extends BaseController<ImagenPromocion,Long>{
    @Autowired
    public ImagenPromocionController(ImagenPromocionService imagenPromocionService){
        super(imagenPromocionService);

    }
}
