package br.com.restaurante.Restaurante.com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "Endereco")
@Entity
public class Endereco {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;
	@Column(name = "cep")
	private Integer cep;
	@Column(name = "rua")
	private String rua;
	@Column(name = "numero")
	private String numero;
	@Column(name = "complemento")
	private String complemento;
	@Column(name = "bairro")
	private String bairro;
	@Column(name = "cidade")
	private String cidade;
	@Column(name = "estado")
	private String estado;
	@Column(name = "pontoReferencia")
	private String pontoReferencia;
	
	
	
	public Endereco(int cep, String rua, String numero, String complemento, String bairro, String cidade, String estado,
			String pontoReferencia) {
		super();
		this.cep = cep;
		this.rua = rua;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.pontoReferencia = pontoReferencia;
	}
	
	
	
	@Override
	public String toString() {
		return "Endereco [cep=" + cep + ", rua=" + rua + ", numero=" + numero + ", complemento=" + complemento
				+ ", bairro=" + bairro + ", cidade=" + cidade + ", estado=" + estado + ", pontoReferencia="
				+ pontoReferencia + "]";
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public Integer getCep() {
		return cep;
	}
	public void setCep(Integer cep) {
		this.cep = cep;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getPontoReferencia() {
		return pontoReferencia;
	}
	public void setPontoReferencia(String pontoReferencia) {
		this.pontoReferencia = pontoReferencia;
	}
	
	


}
