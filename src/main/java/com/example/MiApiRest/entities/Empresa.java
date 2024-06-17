package com.example.MiApiRest.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import java.io.Serializable;

@Entity
@Table(name = "empresa")
@AllArgsConstructor
@NoArgsConstructor
@Data
@SuperBuilder
@EqualsAndHashCode(callSuper=false)
public class Empresa extends Base implements Serializable {
    private String nombre;
    private String razonSocial;
    private Integer cuil;
    @JoinColumn(name = "id_sucursal")
    private Sucursal sucursal;
}
