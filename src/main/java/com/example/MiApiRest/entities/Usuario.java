package com.example.MiApiRest.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
@Entity
@Table(name = "usuarios")

@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class Usuario extends Base implements Serializable {
    private Long id;

    @Column(name = "auth_Id")
    private String auth0Id;
    @Column(name = "nombre_usuario")
    private String username;

}
