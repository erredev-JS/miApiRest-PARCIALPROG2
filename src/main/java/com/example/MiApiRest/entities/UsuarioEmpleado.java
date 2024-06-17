package com.example.MiApiRest.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "usuario_empleado")
@Data
@AllArgsConstructor


public class UsuarioEmpleado extends Usuario{
}
