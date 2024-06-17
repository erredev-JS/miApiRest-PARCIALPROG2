package com.example.MiApiRest.services;

import com.example.MiApiRest.entities.Empresa;
import com.example.MiApiRest.repositories.EmpresaRepository;
import org.springframework.stereotype.Service;

@Service
public class EmpresaService extends BaseService<Empresa,Long>{
    EmpresaService (EmpresaRepository empresaRepository){
        super(empresaRepository);
    }
}
