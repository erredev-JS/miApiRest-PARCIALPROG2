package com.example.MiApiRest.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.io.Serializable;
@Entity
@Table(name = "imagen_articulo")
public class ImagenArticulo extends Imagen implements Serializable {
}
