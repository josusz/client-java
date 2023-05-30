package com.fatec.client.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fatec.client.Repositories.ClientRepository;
import com.fatec.client.entities.Client;

import jakarta.persistence.EntityNotFoundException;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    public Client getClientById(int id){
        return clientRepository.findById(id).orElseThrow(
            () -> new EntityNotFoundException("Cliente não encontrado.")
        );
    }

    public List<Client> getClients(){
        return clientRepository.findAll();
    }
}
