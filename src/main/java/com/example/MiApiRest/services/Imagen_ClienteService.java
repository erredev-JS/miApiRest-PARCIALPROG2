package com.example.MiApiRest.services;

import com.example.MiApiRest.entities.Imagen_Cliente;
import com.example.MiApiRest.repositories.Imagen_ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Imagen_ClienteService extends BaseService<Imagen_Cliente,Long>{
    @Autowired
    Imagen_ClienteService(Imagen_ClienteRepository imagen_clienteRepository){
        super(imagen_clienteRepository);
    }
}
