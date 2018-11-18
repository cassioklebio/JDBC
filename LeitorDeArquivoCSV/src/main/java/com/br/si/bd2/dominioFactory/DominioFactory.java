package com.br.si.bd2.dominioFactory;

import java.sql.SQLException;

import com.br.si.bd2.DAO.DAO;
import com.br.si.bd2.DAO.JDBCDominioDAO;



public class DominioFactory {
	
	public static DAO CriaInstancia() throws ClassNotFoundException, SQLException {
		return new JDBCDominioDAO();
	}
	

}
