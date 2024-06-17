package com.example.MiApiRest.services;

import com.example.MiApiRest.entities.Factura;
import com.example.MiApiRest.repositories.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FacturaService extends BaseService<Factura,Long>{
    @Autowired
    FacturaService (FacturaRepository facturaRepository){
        super(facturaRepository);
    }
}
