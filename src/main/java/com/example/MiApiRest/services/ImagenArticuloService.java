package com.example.MiApiRest.services;

import com.example.MiApiRest.entities.ImagenArticulo;
import com.example.MiApiRest.repositories.ImagenArticuloRepository;
import com.example.MiApiRest.repositories.ImagenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImagenArticuloService extends BaseService<ImagenArticulo,Long>{
    @Autowired
    ImagenArticuloService(ImagenArticuloRepository imagenArticuloRepository){
        super(imagenArticuloRepository);
    }
}
