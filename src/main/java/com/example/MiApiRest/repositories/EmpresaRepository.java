package com.example.MiApiRest.repositories;

import com.example.MiApiRest.entities.Base;
import com.example.MiApiRest.entities.Empresa;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaRepository extends BaseRepository<Empresa,Long>{
}
