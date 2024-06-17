package com.example.MiApiRest.services;

import com.example.MiApiRest.entities.Sucursal;
import com.example.MiApiRest.repositories.SucursalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SucursalService extends BaseService<Sucursal,Long>{
    @Autowired
    SucursalService (SucursalRepository sucursalRepository){
        super(sucursalRepository);
    }
}
