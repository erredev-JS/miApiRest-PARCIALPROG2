package com.example.MiApiRest.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name = "pais")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Pais extends Base implements Serializable {
    @Column(name = "nombre")
    private String nombre;
}
