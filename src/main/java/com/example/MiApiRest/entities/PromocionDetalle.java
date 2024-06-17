package com.example.MiApiRest.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;

import java.io.Serializable;
@Entity
@Table(name = "promocion_detalle")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(callSuper=false)
public class PromocionDetalle extends Base implements Serializable {
    private int cantidad;
    private Promocion promocion;
    @ManyToOne
    @JoinColumn(name = "id_articulo")
    private Articulo articulo;
}
