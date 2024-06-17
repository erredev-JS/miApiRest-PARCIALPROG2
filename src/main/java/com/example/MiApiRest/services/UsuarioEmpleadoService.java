package com.example.MiApiRest.services;

import com.example.MiApiRest.entities.UsuarioEmpleado;
import com.example.MiApiRest.repositories.UsuarioEmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioEmpleadoService extends BaseService<UsuarioEmpleado,Long> {
    @Autowired
    UsuarioEmpleadoService(UsuarioEmpleadoRepository usuarioEmpleadoRepository){
        super(usuarioEmpleadoRepository);
    }
}
