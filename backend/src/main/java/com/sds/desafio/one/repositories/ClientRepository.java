package com.sds.desafio.one.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sds.desafio.one.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
