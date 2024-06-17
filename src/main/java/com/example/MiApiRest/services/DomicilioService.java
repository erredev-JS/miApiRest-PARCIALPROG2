package com.example.MiApiRest.services;

import com.example.MiApiRest.entities.Domicilio;
import com.example.MiApiRest.repositories.DomicilioRepository;
import org.springframework.stereotype.Service;

@Service
public class DomicilioService extends BaseService<Domicilio,Long>{
    DomicilioService(DomicilioRepository domicilioRepository){
        super(domicilioRepository);
    }
}
