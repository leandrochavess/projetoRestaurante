package br.com.restaurante.Restaurante.com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "Pedido")
@Entity
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "numeroPedido")
	private Integer numeroPedido;
	
//	private Cliente cliente;
	
	//private List<Produtos> produtos;
	
	//private Endereco endereco;
	
	//private CartaoCredito cartaoCredito;
	
	private Integer formaPagamento;
	private float troco;
	
	
	/*
	public Pedido(Cliente cliente, List<Produtos> produtos, Endereco endereco, Integer formaPagamento) {
		super();
		this.cliente = cliente;
		this.produtos = produtos;
		this.endereco = endereco;
		this.formaPagamento = formaPagamento;
	}
	
	
	@Override
	public String toString() {
		return "Pedido [numeroPedido=" + numeroPedido + ", cliente=" + cliente + ", produto=" + produtos + ", endereco="
				+ endereco + ", cartaoCredito=" + cartaoCredito + ", formaPagamento=" + formaPagamento + ", troco="
				+ troco + "]";
	}*/



	public int getNumeroPedido() {
		return numeroPedido;
	}
	public void setNumeroPedido(Integer numeroPedido) {
		this.numeroPedido = numeroPedido;
	}
	/*
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}*/
/*
	public List<Produtos> getProdutos() {
		return produtos;
	}


	public void setProdutos(List<Produtos> produtos) {
		this.produtos = produtos;
	}


	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public CartaoCredito getCartaoCredito() {
		return cartaoCredito;
	}
	public void setCartaoCredito(CartaoCredito cartaoCredito) {
		this.cartaoCredito = cartaoCredito;
	}*/
	public int getFormaPagamento() {
		return formaPagamento;
	}
	public void setFormaPagamento(Integer formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	public float getTroco() {
		return troco;
	}
	public void setTroco(float troco) {
		this.troco = troco;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}
	
	
}
