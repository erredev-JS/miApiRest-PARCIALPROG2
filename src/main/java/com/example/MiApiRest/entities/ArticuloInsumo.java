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
@Table(name = "articulo_insumo")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class ArticuloInsumo extends Articulo implements Serializable {
    @JoinColumn(name = "precio_compra")
    private Double precioCompra;
    @JoinColumn(name = "stock_actual")
    private Integer stockActual;
    @JoinColumn(name = "stock_maximo")
    private Integer stockMaximo;
    @JoinColumn(name = "para_elaborar")
    private boolean paraElaborar;
}
