package com.example.MiApiRest.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class UnidadMedida extends Base implements Serializable {
    @Column(name = "denominacion")
    private String denominacion;

}
