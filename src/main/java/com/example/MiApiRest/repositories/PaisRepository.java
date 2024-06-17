package com.example.MiApiRest.repositories;

import com.example.MiApiRest.entities.Base;
import com.example.MiApiRest.entities.Pais;
import org.springframework.stereotype.Repository;

@Repository
public interface PaisRepository extends BaseRepository<Pais,Long> {
}
