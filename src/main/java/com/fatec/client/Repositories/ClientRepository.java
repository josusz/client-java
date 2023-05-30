package com.fatec.client.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fatec.client.entities.Client;

public interface ClientRepository extends JpaRepository <Client,Integer> {

    static List<Client> getClients() {
        return null;
    }

}