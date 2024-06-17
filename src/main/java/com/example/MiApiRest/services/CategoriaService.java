package com.example.MiApiRest.services;

import com.example.MiApiRest.entities.Categoria;
import com.example.MiApiRest.repositories.CategoriaRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService extends BaseService<Categoria,Long>{
    @Autowired
    CategoriaService(CategoriaRespository categoriaRespository){
        super(categoriaRespository);
    }
}
