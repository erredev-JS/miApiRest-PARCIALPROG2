package com.example.MiApiRest.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "articulo")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Articulo extends Base implements Serializable {
    protected String denominacion;
    @JoinColumn(name = "precio_de_venta")
    protected double precioVenta;
    @ManyToOne
    @JoinColumn(name = "unidad_medida")
    private UnidadMedida unidadMedida;
    @OneToMany
    @JoinColumn(name = "imagen_articulo")
    private List<ImagenArticulo> imagenArticulo;


}
