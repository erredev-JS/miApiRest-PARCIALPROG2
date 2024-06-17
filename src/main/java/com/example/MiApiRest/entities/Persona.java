package com.example.MiApiRest.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import java.io.Serializable;
import java.time.LocalDate;

@MappedSuperclass
@Data
@AllArgsConstructor
@NoArgsConstructor
@Inheritance (strategy = InheritanceType.JOINED)
@SuperBuilder

public abstract class  Persona extends Base implements Serializable {
    protected String nombre;
    protected String apellido;
    protected String telefono;
    protected String email;
    protected LocalDate fechaNacimiento;




}
