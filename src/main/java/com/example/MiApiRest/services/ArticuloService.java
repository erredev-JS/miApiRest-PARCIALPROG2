package com.example.MiApiRest.services;

import com.example.MiApiRest.entities.Articulo;
import com.example.MiApiRest.repositories.ArticuloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticuloService extends BaseService<Articulo,Long>{
    @Autowired
    ArticuloService(ArticuloRepository articuloRepository){
        super(articuloRepository);
    }
}
