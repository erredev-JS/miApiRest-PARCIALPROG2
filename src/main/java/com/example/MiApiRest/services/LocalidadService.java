package com.example.MiApiRest.services;

import com.example.MiApiRest.entities.Localidad;
import com.example.MiApiRest.repositories.LocalidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalidadService extends BaseService<Localidad,Long>{
    @Autowired
    LocalidadService (LocalidadRepository localidadRepository){
        super(localidadRepository);
    }
}
