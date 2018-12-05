package br.com.restaurante.Restaurante.com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.restaurante.Restaurante.com.model.Pedido;

@RepositoryRestResource(collectionResourceRel = "pedido", path = "pedido")
public interface PedidoRepository extends JpaRepository<Pedido, String>{
	
public List<Pedido> findAll();
	

}