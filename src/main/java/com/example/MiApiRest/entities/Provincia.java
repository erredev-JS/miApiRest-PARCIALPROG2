package com.example.MiApiRest.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name = "provincia")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Provincia extends Base implements Serializable {
    private String nombre;
    @ManyToOne
    @JoinColumn(name = "id_pais")
    private Pais pais;
}
