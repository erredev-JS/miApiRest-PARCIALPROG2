package com.example.MiApiRest.services;


import com.example.MiApiRest.entities.Imagen_Empleado;
import com.example.MiApiRest.repositories.Imagen_EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Imagen_EmpleadoService extends BaseService<Imagen_Empleado,Long>{
    @Autowired
    Imagen_EmpleadoService(Imagen_EmpleadoRepository imagen_empleadoRepository){
        super(imagen_empleadoRepository);
    }
}
