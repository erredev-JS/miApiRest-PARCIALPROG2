package com.example.MiApiRest.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name = "imagen_promocion")
@Data
@AllArgsConstructor
public class ImagenPromocion extends Imagen implements Serializable {


}
