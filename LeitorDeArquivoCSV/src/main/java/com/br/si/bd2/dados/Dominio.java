package com.br.si.bd2.dados;



public class Dominio {
	private int   id_dominio;
	private String  dominio;
	private String  documento;
	private String  nome;
	private String   data_cadastro;
	private String    ultima_atualizacao;
	private String   ticket;
	
	public Dominio() {}
	
	

	public Dominio(int id_dominio, String dominio, String documento, String nome, String data_cadastro, String ultima_atualizacao,
			String ticket) {
		this.id_dominio = id_dominio;
		this.dominio = dominio;
		this.documento = documento;
		this.nome = nome;
		this.data_cadastro = data_cadastro;
		this.ultima_atualizacao = ultima_atualizacao;
		this.ticket = ticket;
	}



	public long getId_dominio() {
		return id_dominio;
	}

	public void setId_dominio(int id_dominio) {
		this.id_dominio = id_dominio;
	}

	public String getDominio() {
		return dominio;
	}

	public void setDominio(String dominio) {
		this.dominio = dominio;
	}
		
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getData_cadastro() {
		return data_cadastro;
	}

	public void setData_cadastro(String data_cadastro) {
		this.data_cadastro = data_cadastro;
	}

	public String getUltima_atualizacao() {
		return ultima_atualizacao;
	}

	public void setUltima_atualizacao(String ultima_atualizacao) {
		this.ultima_atualizacao = ultima_atualizacao;
	}

	public String getTicket() {
		return ticket;
	}

	public void setTicket(String ticket) {
		this.ticket = ticket;
	}
	
	
	
	
	
	
}
