package com.example.MiApiRest.controllers;
import com.example.MiApiRest.entities.Empleado;
import com.example.MiApiRest.services.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/empleados")
public class EmpleadoController extends BaseController<Empleado,Long> {
    @Autowired
    public EmpleadoController(EmpleadoService empleadoService){
        super(empleadoService);
    }
}
