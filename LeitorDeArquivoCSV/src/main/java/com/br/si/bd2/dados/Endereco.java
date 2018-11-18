package com.br.si.bd2.dados;

public class Endereco {
	private Long id_endereco;
	private String uf;
	private String cidade;
	private String cep;
	
	public Endereco() {}
	
	public Endereco (Long id_endereco, String uf, String cidade, String cep) {
		this.id_endereco = id_endereco;
		this.uf = uf;
		this.cidade = cep;
	}

	public Long getId_endereco() {
		return id_endereco;
	}

	public void setId_endereco(Long id_endereco) {
		this.id_endereco = id_endereco;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}
	
	

}
