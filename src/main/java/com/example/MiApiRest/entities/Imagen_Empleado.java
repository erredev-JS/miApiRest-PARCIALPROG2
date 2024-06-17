package com.example.MiApiRest.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name = "imagen_empleado")
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Imagen_Empleado extends Imagen implements Serializable {
    @JoinColumn(name = "id_empleado")
    private Empleado empleado;
}
