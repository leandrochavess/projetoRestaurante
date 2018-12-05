package br.com.restaurante.Restaurante.com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "CartaoCredito")
@Entity
public class CartaoCredito {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idCartao")
	private Integer idCartao;
	@Column(name = "numeroCartao")
	private Integer numeroCartao;
	@Column(name = "mesValidade")
	private Integer mesValidade;
	@Column(name = "anoValidade")
	private Integer anoValidade;
	@Column(name = "codigoSeg")
	private Integer codigoSeg;
	@Column(name = "nomeTitular")
	private String nomeTitular;
	@Column(name = "cpfTitular")
	private Integer cpfTitular;
	
	
	
	public CartaoCredito(Integer numeroCartao, Integer mesValidade, Integer anoValidade, Integer codigoSeg, String nomeTitular,
			int cpfTitular) {
		super();
		this.numeroCartao = numeroCartao;
		this.mesValidade = mesValidade;
		this.anoValidade = anoValidade;
		this.codigoSeg = codigoSeg;
		this.nomeTitular = nomeTitular;
		this.cpfTitular = cpfTitular;
	}
	
	@Override
	public String toString() {
		return "CartaoCredito [numeroCartao=" + numeroCartao + ", mesValidade=" + mesValidade + ", anoValidade="
				+ anoValidade + ", codigoSeg=" + codigoSeg + ", nomeTitular=" + nomeTitular + ", cpfTitular="
				+ cpfTitular + "]";
	}


	

	public Integer getIdCartao() {
		return idCartao;
	}

	public void setIdCartao(Integer idCartao) {
		this.idCartao = idCartao;
	}

	public Integer getNumeroCartao() {
		return numeroCartao;
	}
	public void setNumeroCartao(Integer numeroCartao) {
		this.numeroCartao = numeroCartao;
	}
	public Integer getMesValidade() {
		return mesValidade;
	}
	public void setMesValidade(Integer mesValidade) {
		this.mesValidade = mesValidade;
	}
	public int getAnoValidade() {
		return anoValidade;
	}
	public void setAnoValidade(Integer anoValidade) {
		this.anoValidade = anoValidade;
	}
	public Integer getCodigoSeg() {
		return codigoSeg;
	}
	public void setCodigoSeg(Integer codigoSeg) {
		this.codigoSeg = codigoSeg;
	}
	public String getNomeTitular() {
		return nomeTitular;
	}
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	public Integer getCpfTitular() {
		return cpfTitular;
	}
	public void setCpfTitular(Integer cpfTitular) {
		this.cpfTitular = cpfTitular;
	}
	
	

}
