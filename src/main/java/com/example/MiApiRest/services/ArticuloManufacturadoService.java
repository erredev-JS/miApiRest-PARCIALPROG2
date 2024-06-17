package com.example.MiApiRest.services;

import com.example.MiApiRest.entities.ArticuloManufacturado;
import com.example.MiApiRest.repositories.ArticuloManufacturadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticuloManufacturadoService extends BaseService<ArticuloManufacturado,Long>{
    @Autowired
    ArticuloManufacturadoService(ArticuloManufacturadoRepository articuloManufacturadoRepository){
        super(articuloManufacturadoRepository);
    }
}
