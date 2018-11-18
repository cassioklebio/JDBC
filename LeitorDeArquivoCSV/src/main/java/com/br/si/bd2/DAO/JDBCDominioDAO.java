package com.br.si.bd2.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.br.si.bd2.dados.Dominio;
import com.br.si.bd2.dados.Endereco;



public class JDBCDominioDAO implements DAO {

	public void Cadastra(Dominio dominio, Endereco endereco) throws ClassNotFoundException, SQLException {
		Connection conexao = Conexao.getConector();
		try {
			String insercaoDeDominio= "INSERT INTO TB_DOMINIOS (dominio,documento, nome, data_cadastro, ultima_atualizacao, ticket)\n" + 
					"VALUES(?,?,?,?,?,?)";
			String insercaoDeEndereco ="INSERT INTO TB_ENDERECOS(id_dominio,uf,cidade,cep)VALUES(?,?,?,?);";
			
			
			PreparedStatement inseriDominio = conexao.prepareStatement(insercaoDeDominio,Statement.RETURN_GENERATED_KEYS);
			inseriDominio.setString(1, dominio.getDominio());
			inseriDominio.setString(2, dominio.getDocumento());
			inseriDominio.setString(3, dominio.getNome());
			inseriDominio.setString(4, dominio.getData_cadastro());
			inseriDominio.setString(5, dominio.getUltima_atualizacao());
			inseriDominio.setString(6, dominio.getTicket());
			
			inseriDominio.executeUpdate();
			
			ResultSet rs = inseriDominio.getGeneratedKeys();
	        int id = 0;
	        if(rs.next()){
	            id = rs.getInt(1);
	        }
	        
	        System.out.println(id);
			
			 PreparedStatement inseriEndereco =conexao.prepareStatement(insercaoDeEndereco);
			inseriEndereco.setInt(1, id);
			inseriEndereco.setString(2, endereco.getUf());
			inseriEndereco.setString(3, endereco.getCidade());
			inseriEndereco.setString(4, endereco.getCep());
			inseriEndereco.executeUpdate();
	    
			
				
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
