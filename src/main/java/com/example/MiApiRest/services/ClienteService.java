package com.example.MiApiRest.services;

import com.example.MiApiRest.entities.Cliente;
import com.example.MiApiRest.repositories.BaseRepository;
import com.example.MiApiRest.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService extends BaseService<Cliente, Long> {

    @Autowired
    public ClienteService(ClienteRepository clienteRepository) {
        super(clienteRepository);
    }
}
