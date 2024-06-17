package com.example.MiApiRest.services;

import com.example.MiApiRest.entities.ArticuloManufacturado;
import com.example.MiApiRest.entities.ArticuloManufacturadoDetalle;
import com.example.MiApiRest.repositories.ArticuloManufacturadoDetalleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticuloManufacturadoDetalleService extends BaseService<ArticuloManufacturadoDetalle,Long>{
    @Autowired
    ArticuloManufacturadoDetalleService(ArticuloManufacturadoDetalleRepository articuloManufacturadoDetalleRepository){
        super(articuloManufacturadoDetalleRepository);
    }
}
