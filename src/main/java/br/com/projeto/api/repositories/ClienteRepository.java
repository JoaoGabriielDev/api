package br.com.projeto.api.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.projeto.api.models.Cliente;


public interface ClienteRepository extends CrudRepository<Cliente, Long>{
    
}
