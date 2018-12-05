package br.com.restaurante.Restaurante.com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "Produtos")
@Entity
public class Produtos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;
	@Column(name = "nome")
	private String nome; 
	@Column(name = "observacaoProduto")
	private String observacaoProduto;
	@Column(name = "preco")
	private Float preco;
	@Column(name = "categoria")
	private String categoria;
	@Column(name = "disponivel")
	private Boolean disponivel;
	
	public Produtos(String nome, String observacaoProduto, float preco, String categoria) {
		
		this.nome = nome;
		this.observacaoProduto = observacaoProduto;
		this.preco = preco;
		this.categoria = categoria;
		this.disponivel = true;
		
	}
	
	@Override
	public String toString() {
		return "Produtos [id=" + id + ", nome=" + nome + ", observacaoProduto=" + observacaoProduto + ", preco=" + preco
				+ ", categoria=" + categoria + ", disponivel=" + disponivel + "]";
	}



	public int getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getObservacaoProduto() {
		return observacaoProduto;
	}
	public void setObservacaoProduto(String observacaoProduto) {
		this.observacaoProduto = observacaoProduto;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public boolean isDisponivel() {
		return disponivel;
	}
	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}

	public Boolean getDisponivel() {
		return disponivel;
	}

	public void setPreco(Float preco) {
		this.preco = preco;
	}

	public void setDisponivel(Boolean disponivel) {
		this.disponivel = disponivel;
	}
	
	
	

}
