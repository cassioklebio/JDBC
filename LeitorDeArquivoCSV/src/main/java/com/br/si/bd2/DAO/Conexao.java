package com.br.si.bd2.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Conexao {
	private static Connection conexao = null;
	private static Conexao self = null;
	private static String url ="jdbc:mysql://localhost:3306/DB_DOMINIO";
	private static String user = "cassio";
	private static String password = "hayabusa1300";
	
	private Conexao() {}
	
	public static Connection getConector() throws ClassNotFoundException, SQLException {
		if(conexao == null) {
			Class.forName("com.mysql.jdbc.Driver");
			conexao = DriverManager.getConnection(url, user, password);
			
		}
		return conexao;
		
	}
	
	protected static synchronized Conexao getInstacia() {
		if (self == null) {
			return new Conexao();
		}else {
			return self;
		}
					
	}

}
