package com.example.MiApiRest.services;

import com.example.MiApiRest.entities.Imagen;
import com.example.MiApiRest.repositories.ImagenRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImagenService extends BaseService<Imagen, Long> {

    public ImagenService(ImagenRepository imagenRepository){
        super(imagenRepository);
    }
}
