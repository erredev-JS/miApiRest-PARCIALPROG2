package com.example.MiApiRest.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
@Entity
@Table(name = "usuario_cliente")


@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class Usuario_Cliente extends Usuario implements Serializable {
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;
}
