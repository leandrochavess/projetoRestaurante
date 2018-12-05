package br.com.restaurante.Restaurante.com.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.restaurante.Restaurante.com.model.Endereco;

@RepositoryRestResource(collectionResourceRel = "endereco", path = "endereco")
public interface EnderecoRepository  extends PagingAndSortingRepository<Endereco, Long>{


}
