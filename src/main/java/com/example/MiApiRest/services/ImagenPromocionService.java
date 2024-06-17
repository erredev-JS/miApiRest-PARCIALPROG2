package com.example.MiApiRest.services;

import com.example.MiApiRest.entities.Base;
import com.example.MiApiRest.entities.Imagen;
import com.example.MiApiRest.entities.ImagenPromocion;
import com.example.MiApiRest.repositories.ImagenPromocionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImagenPromocionService extends BaseService<ImagenPromocion,Long> {
    @Autowired
    ImagenPromocionService(ImagenPromocionRepository imagenPromocionRepository){
        super(imagenPromocionRepository);
    }
}
