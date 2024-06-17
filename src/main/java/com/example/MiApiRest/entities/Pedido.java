package com.example.MiApiRest.entities;

import com.example.MiApiRest.entities.enums.Estado;
import com.example.MiApiRest.entities.enums.FormaPago;
import com.example.MiApiRest.entities.enums.TipoEnvio;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;

import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

@Entity
@Table(name = "pedidos")

@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Pedido extends Base implements Serializable {
    @Column(name = "hora_estimada_finalizacion")
    private LocalTime horaEstimadaFinalizacion;
    @Column(name = "total")
    private Double total;
    @Column(name = "total_costo")
    private Double totalCosto;
    @Column(name = "estado")
    private Estado estado;
    @Column(name = "tipo_envio")
    private TipoEnvio tipoEnvio;
    @Column(name = "forma_pago")
    private FormaPago formaPago;
    @Column(name = "fecha_pedido")
    private LocalDate fechaPedido;
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;
    @ManyToOne
    @JoinColumn(name = "domicilio_id")
    private Domicilio domicilio;
    @ManyToOne
    @JoinColumn(name = "empleado_id")
    private Empleado empleado;
    @ManyToOne
    @JoinColumn(name = "id_sucursal")
    private Sucursal sucursal;
    @JoinColumn(name = "id_detalles")
    private Set<DetallePedido>detalles;




}
