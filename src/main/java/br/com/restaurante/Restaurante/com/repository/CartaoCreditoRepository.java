package br.com.restaurante.Restaurante.com.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.restaurante.Restaurante.com.model.CartaoCredito;

@RepositoryRestResource(collectionResourceRel = "cartaoCredito", path = "cartaoCredito")
public interface CartaoCreditoRepository extends PagingAndSortingRepository<CartaoCredito, Long>{
	

}
