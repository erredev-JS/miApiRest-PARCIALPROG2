package com.example.MiApiRest.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Set;
import java.io.Serializable;
@Entity
@Table(name = "articulo_manufacturado")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class ArticuloManufacturado extends Articulo implements Serializable {
    private String descripcion;
    private Integer tiempoEstimadoMinutos;
    private String preparacion;
    private Set<ArticuloManufacturadoDetalle> detalle;


}
