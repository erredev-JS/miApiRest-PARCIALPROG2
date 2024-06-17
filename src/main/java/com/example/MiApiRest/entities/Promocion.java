package com.example.MiApiRest.entities;

import com.example.MiApiRest.entities.enums.TipoPromocion;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.cglib.core.Local;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "promocion")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(callSuper=false)
public class Promocion extends Base implements Serializable {
    private String denominacion;
    @Column(name = "fecha_desde")
    private LocalDate fechaDesde;
    @Column(name = "fecha_hasta")
    private LocalDate fechaHasta;
    @Column(name = "hora_desde")
    private LocalTime horaDesde;
    @Column(name = "hora_hasta")
    private LocalTime horaHasta;
    @Column(name = "descripcion_descuento")
    private String descripcionDescuento;
    @Column(name = "precio_promocion")
    private Double precioPromocional;
    @Column(name = "tipo_promocion")
    private TipoPromocion tipoPromocion;
    @ManyToMany
    @JoinTable(
            name = "promocion_sucursal",
            joinColumns = @JoinColumn(name = "promocion_id"),
            inverseJoinColumns = @JoinColumn(name = "sucursal_id")
    )

    private List<Sucursal> sucursal;
    @OneToMany
    @JoinColumn(name = "id_imagen_promocion")
    private List<ImagenPromocion> imagenPromocion;
    @OneToMany
    @JoinColumn(name = "id_promocion_detalle")
    private List<PromocionDetalle> promocionDetalle;


}
