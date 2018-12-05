package br.com.restaurante.Restaurante.com.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.restaurante.Restaurante.com.model.Cliente;

@RepositoryRestResource(collectionResourceRel = "cliente", path = "cliente")
public interface ClienteRepository  extends PagingAndSortingRepository<Cliente, Long>{


}