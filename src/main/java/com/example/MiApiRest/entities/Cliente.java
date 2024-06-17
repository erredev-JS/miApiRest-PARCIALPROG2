package com.example.MiApiRest.entities;
import com.example.MiApiRest.entities.enums.Rol;
import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;
@Entity
@Table(name = "clientes")
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Cliente extends Persona implements Serializable{
    private Rol rolCliente;
    @OneToOne
    @JoinColumn(name = "id_imagen_cliente")
    private Imagen_Cliente imagenCliente;
    @OneToOne
    @JoinColumn(name = "usuario_cliente")
    private Usuario_Cliente usuarioCliente;


}
