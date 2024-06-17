package com.example.MiApiRest.entities;

import com.example.MiApiRest.entities.enums.Rol;
import jakarta.persistence.*;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Builder;
import java.io.Serializable;
@Entity
@Table (name = "empleados")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder

public class Empleado extends Persona implements Serializable{

    @Column (name = "tipo_empleado")
    private Rol tipoEmpleado;
    @OneToOne
    @JoinColumn(name = "id_imagen_empleado")
    private Imagen_Empleado imagenEmpleado;
    @OneToOne
    @JoinColumn(name = "id_usuario_empleado")
    private UsuarioEmpleado usuarioEmpleado;



}
