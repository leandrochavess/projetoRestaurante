package br.com.restaurante.Restaurante.com.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name="cliente")
@Entity
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private Integer id;
    @Column(name = "cpf")
	private Integer cpf;
    @Column(name = "nome")
	private String nomeCliente;
    @Column(name = "telefone")
	private Integer telefone;
    @Column(name = "dataNascimento")
	private Date dataNascimento;
    @Column(name = "email")
	private String email;
    /*
    @OneToMany
	private List<Endereco> endereco;
    
    @OneToMany
    private List<CartaoCredito> cartaoCredito;
    */
	public Integer getCpf() {
		return cpf;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public Integer getTelefone() {
		return telefone;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public String getEmail() {
		return email;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	/*
	public List<Endereco> getEndereco() {
		return endereco;
	}
	public void setEndereco(List<Endereco> endereco) {
		this.endereco = endereco;
	}*/
	public Integer getId() {
		return id;
	}
	/*
	public List<CartaoCredito> getCartaoCredito() {
		return cartaoCredito;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setCartaoCredito(List<CartaoCredito> cartaoCredito) {
		this.cartaoCredito = cartaoCredito;
	}*/

}
