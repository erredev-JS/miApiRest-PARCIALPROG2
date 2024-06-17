package com.example.MiApiRest.services;

import com.example.MiApiRest.entities.PromocionDetalle;
import com.example.MiApiRest.repositories.BaseRepository;
import com.example.MiApiRest.repositories.PromocionDetalleRepository;
import com.example.MiApiRest.repositories.PromocionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PromocionDetalleService extends BaseService<PromocionDetalle,Long> {
    @Autowired
    PromocionDetalleService(PromocionDetalleRepository promocionDetalleRepository){
        super(promocionDetalleRepository);
    }

}
