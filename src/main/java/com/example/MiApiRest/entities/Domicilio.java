package com.example.MiApiRest.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name = "domicilio")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Domicilio extends Base implements Serializable {
    @Column(name = "calle")
    private String calle;
    @Column(name = "numero")
    private Integer numero;
    @JoinColumn(name = "codigo_postal")
    private Integer cp;
    @ManyToOne
    @JoinColumn(name = "id_localidad")
    private Localidad localidad;
}
