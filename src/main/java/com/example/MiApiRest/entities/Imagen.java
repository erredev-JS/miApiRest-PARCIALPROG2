package com.example.MiApiRest.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
@Entity
@Table(name = "imagenes")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Imagen extends Base implements Serializable {
    @Column(name = "denominacion")
    private String denominacion;

}
