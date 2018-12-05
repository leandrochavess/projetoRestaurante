package br.com.restaurante.Restaurante.com.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.restaurante.Restaurante.com.model.DadosRestaurante;

@RepositoryRestResource(collectionResourceRel = "dadosRestaurante", path = "dadosRestaurante")
public interface DadosRestauranteRepository   extends PagingAndSortingRepository<DadosRestaurante, Long>{
	

}
