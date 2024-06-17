package com.example.MiApiRest.services;

import com.example.MiApiRest.entities.Usuario_Cliente;
import com.example.MiApiRest.repositories.Usuario_ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Usuario_ClienteService extends BaseService<Usuario_Cliente,Long>{
    @Autowired
    Usuario_ClienteService(Usuario_ClienteRepository usuario_clienteRepository){
        super(usuario_clienteRepository);
    }
}
