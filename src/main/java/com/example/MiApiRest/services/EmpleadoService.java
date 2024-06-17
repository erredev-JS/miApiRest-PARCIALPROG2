package com.example.MiApiRest.services;
import com.example.MiApiRest.entities.Empleado;
import com.example.MiApiRest.repositories.EmpleadoRepository;
import org.springframework.stereotype.Service;
@Service
public class EmpleadoService extends BaseService<Empleado, Long> {

    public EmpleadoService(EmpleadoRepository empleadoRepository) {
        super(empleadoRepository);
    }
}
