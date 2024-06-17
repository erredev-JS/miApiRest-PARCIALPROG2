package com.example.MiApiRest.repositories;


import com.example.MiApiRest.entities.Usuario;
import org.springframework.stereotype.Repository;

@Repository

public interface UsuarioRepository extends BaseRepository<Usuario, Long > {
}
