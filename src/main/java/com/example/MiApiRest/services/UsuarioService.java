package com.example.MiApiRest.services;

import com.example.MiApiRest.entities.Usuario;
import com.example.MiApiRest.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService extends BaseService<Usuario,Long> {
    @Autowired
   public UsuarioService (UsuarioRepository usuarioRepository){
        super(usuarioRepository);
    }
}
