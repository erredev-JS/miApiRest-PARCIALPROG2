package com.example.MiApiRest.services;

import com.example.MiApiRest.entities.Base;
import com.example.MiApiRest.entities.UnidadMedida;
import com.example.MiApiRest.repositories.UnidadMedidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UnidadMedidaService extends BaseService<UnidadMedida,Long> {
    @Autowired
    UnidadMedidaService(UnidadMedidaRepository unidadMedidaRepository){
        super(unidadMedidaRepository);
    }
}
