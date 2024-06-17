package com.example.MiApiRest.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;
@Entity
@Table(name = "Categoria")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(callSuper=false)
public class Categoria extends Base implements Serializable {
    private String denominacion;
    @ManyToMany
    @JoinTable(
            name = "categoria_sucursal",
            joinColumns = @JoinColumn(name = "categoria_id"),
            inverseJoinColumns = @JoinColumn(name = "sucursal_id")
    )
    private List<Sucursal> sucursal;
    @OneToMany()
    @JoinColumn(name = "id_articulo")
    private List<Articulo> articulo;
    @ManyToOne
    @JoinColumn(name = "id_categoria_padre")
    private Categoria categoriaPadre;
    private List<Categoria> subcategorias ;
}
