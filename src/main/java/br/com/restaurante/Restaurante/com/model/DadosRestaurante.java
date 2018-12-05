package br.com.restaurante.Restaurante.com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name = "DadosRestaurante")
@Entity
public class DadosRestaurante {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;
	@Column(name = "cnpj")
	private Integer cnpj;
	@Column(name = "telefone")
	private Integer telefone;
	@Column(name = "razaoSocial")
	private String razaoSocial;
	@Column(name = "nomeFantasia")
	private String nomeFantasia;
	@Column(name = "segmento")
	private String segmento; 
	@Column(name = "login")
	private String login;  
	@Column(name = "senha")
	private String senha;
	@Column(name = "email")
	private String email; 
	@Column(name = "nomeProprietario")
	private String nomeProprietario; 
	@Column(name = "nomeSocio")
	private String nomeSocio;
	/*
	@OneToOne
	private Endereco endereco;
	*/
	@Column(name = "bancoConta")
	private String bancoConta;
	@Column(name = "agenciaConta")
	private int agenciaConta;
	@Column(name = "numConta")
	private int numConta;

	/*
	public DadosRestaurante(String razaoSocial, String nomeFantasia, String segmento, String login, String senha,
			String email, String nomeProprietario, String nomeSocio, int cnpj, int telefone, Endereco endereco,
			String bancoConta, int agenciaConta, int numConta) {
		super();
		this.razaoSocial = razaoSocial;
		this.nomeFantasia = nomeFantasia;
		this.segmento = segmento;
		this.login = login;
		this.senha = senha;
		this.email = email;
		this.nomeProprietario = nomeProprietario;
		this.nomeSocio = nomeSocio;
		this.cnpj = cnpj;
		this.telefone = telefone;
		this.endereco = endereco;
		this.bancoConta = bancoConta;
		this.agenciaConta = agenciaConta;
		this.numConta = numConta;
	}

	@Override
	public String toString() {
		return "DadosRestaurante [razaoSocial=" + razaoSocial + ", nomeFantasia=" + nomeFantasia + ", segmento="
				+ segmento + ", login=" + login + ", senha=" + senha + ", email=" + email + ", nomeProprietario="
				+ nomeProprietario + ", nomeSocio=" + nomeSocio + ", cnpj=" + cnpj + ", telefone=" + telefone
				+ ", endereco=" + endereco + ", bancoConta=" + bancoConta + ", agenciaConta=" + agenciaConta
				+ ", numConta=" + numConta + "]";
	}

*/
	public String getBancoConta() {
		return bancoConta;
	}


	public void setBancoConta(String bancoConta) {
		this.bancoConta = bancoConta;
	}


	public int getAgenciaConta() {
		return agenciaConta;
	}


	public void setAgenciaConta(int agenciaConta) {
		this.agenciaConta = agenciaConta;
	}


	public int getNumConta() {
		return numConta;
	}


	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getNomeProprietario() {
		return nomeProprietario;
	}


	public void setNomeProprietario(String nomeProprietario) {
		this.nomeProprietario = nomeProprietario;
	}


	public String getNomeSocio() {
		return nomeSocio;
	}


	public void setNomeSocio(String nomeSocio) {
		this.nomeSocio = nomeSocio;
	}


	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	public String getSegmento() {
		return segmento;
	}
	public void setSegmento(String segmento) {
		this.segmento = segmento;
	}
	public int getCnpj() {
		return cnpj;
	}
	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	/*
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}*/

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setCnpj(Integer cnpj) {
		this.cnpj = cnpj;
	}

	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}

	
}
