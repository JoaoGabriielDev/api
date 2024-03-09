package br.com.projeto.api.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.projeto.api.models.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long>{
    
}
