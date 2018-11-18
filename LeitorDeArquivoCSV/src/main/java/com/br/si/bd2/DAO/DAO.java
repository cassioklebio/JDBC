package com.br.si.bd2.DAO;

import java.sql.SQLException;

import com.br.si.bd2.dados.Dominio;
import com.br.si.bd2.dados.Endereco;


public interface DAO {
	
	public void Cadastra(Dominio dominio, Endereco endereco) throws ClassNotFoundException, SQLException;
	

}
