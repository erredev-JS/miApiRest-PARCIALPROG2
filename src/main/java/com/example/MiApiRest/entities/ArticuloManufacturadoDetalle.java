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
@Table(name = "detalle_articulo_manufacturado")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class ArticuloManufacturadoDetalle extends Base implements Serializable {
    private Integer cantidad;
    @ManyToOne
    @JoinColumn(name = "articulo_manufacturado")
    private ArticuloManufacturado articuloManufacturado;
    @ManyToOne
    @JoinColumn(name = "articulo_insumo")
    private ArticuloInsumo articuloInsumo;

}
