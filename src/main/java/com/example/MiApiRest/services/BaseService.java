package com.example.MiApiRest.services;

import com.example.MiApiRest.entities.Base;
import com.example.MiApiRest.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;


public class BaseService <E extends Base, ID extends Serializable>  {
    @Autowired
    protected BaseRepository<E,ID> baseRepository;

    public BaseService(BaseRepository<E, ID> baseRepository) {
        this.baseRepository = baseRepository;
    }

    //Crear entidad
    public E crearEntidad( E entity){
        return baseRepository.save(entity);
    }
    //Listar entidad
    public List<E>listar(){
        return baseRepository.findAll();
    }
    //Buscar entidad por id
    public Optional<E> buscarEntidadPorId(ID id){
        return Optional.ofNullable(baseRepository.findById(id).orElse(null));
    }
    //Actualizar entidad
    public E actualizarEntidad(E entity){
        return baseRepository.save(entity);
    }
    //Eliminar entidad
    public void eliminarEntidad(ID id){
        baseRepository.deleteById(id);
    }
}
