package com.example.MiApiRest.services;

import com.example.MiApiRest.entities.ArticuloInsumo;
import com.example.MiApiRest.repositories.ArticuloInsumoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticuloInsumoService extends BaseService<ArticuloInsumo,Long>{
    @Autowired
    ArticuloInsumoService(ArticuloInsumoRepository articuloInsumoRepository){
        super(articuloInsumoRepository);
    }
}
