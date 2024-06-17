package com.example.MiApiRest.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;

import java.io.Serializable;
@Entity
@Table(name = "detalle_pedido")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(callSuper=false)
public class DetallePedido extends Base implements Serializable {
    private Integer cantidad;
    @JoinColumn(name = "subtotal")
    private double subTotal;
    @ManyToOne
    @JoinColumn(name = "id_Pedido")
    private Pedido pedido;
    @ManyToOne
    @JoinColumn(name = "id_articulo")
    private Articulo articulo;

}
