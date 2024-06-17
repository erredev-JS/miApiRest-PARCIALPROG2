package com.example.MiApiRest.controllers;

import com.example.MiApiRest.entities.Empresa;
import com.example.MiApiRest.services.EmpresaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/empresa")
public class EmpresaController extends BaseController<Empresa,Long>{
    public EmpresaController(EmpresaService empresaService){
        super(empresaService);
    }
}
