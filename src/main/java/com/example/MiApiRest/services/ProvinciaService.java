package com.example.MiApiRest.services;

import com.example.MiApiRest.entities.Provincia;
import com.example.MiApiRest.repositories.PaisRepository;
import com.example.MiApiRest.repositories.ProvinciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProvinciaService extends BaseService<Provincia,Long>{
    @Autowired
    ProvinciaService (ProvinciaRepository provinciaRepository){
        super(provinciaRepository);
    }
}
