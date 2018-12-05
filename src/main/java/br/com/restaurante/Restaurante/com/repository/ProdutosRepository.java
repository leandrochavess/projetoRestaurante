package br.com.restaurante.Restaurante.com.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.restaurante.Restaurante.com.model.Produtos;

@RepositoryRestResource(collectionResourceRel = "produto", path = "produto")
public interface ProdutosRepository extends PagingAndSortingRepository<Produtos, Long>{


}
