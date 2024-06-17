package com.example.MiApiRest.services;

import com.example.MiApiRest.entities.Base;
import com.example.MiApiRest.entities.Promocion;
import com.example.MiApiRest.repositories.PromocionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PromocionService extends BaseService<Promocion,Long> {
    @Autowired
    PromocionService(PromocionRepository promocionRepository){
        super(promocionRepository);
    }
}
