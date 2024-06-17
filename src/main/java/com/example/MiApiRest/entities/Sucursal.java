package com.example.MiApiRest.entities;

import jakarta.persistence.*;
import lombok.*;


import java.io.Serializable;
import java.time.LocalTime;
import java.util.List;
import java.util.Set;
@Entity
@Table(name = "sucursal")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@EqualsAndHashCode(callSuper=false)
public class Sucursal extends Base implements Serializable {
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "horario_apertura")
    private LocalTime horarioApertura;
    @Column(name = "horario_cierre")
    private LocalTime  horarioCierre;
    @Column(name = "casa_matriz")
    private boolean casaMatriz;
    @OneToOne
    @JoinColumn(name = "id_domicilio")
    private Domicilio domicilio;
    @OneToMany
    @JoinColumn(name = "id_empleado")
    private Set<Empleado> empleados;
    @OneToMany
    @JoinColumn(name = "id_pedidos")
    private List<Pedido> pedidos;
    @ManyToOne
    @JoinColumn(name = "id_empresa")
    private Empresa empresa;
    @ManyToMany(mappedBy = "sucursal")

    private List<Promocion> promocion;
    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private Categoria categoria;



}
