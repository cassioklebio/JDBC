package com.br.si.bd2.dados;

import java.io.BufferedReader;
import java.io.FileReader;

import com.br.si.bd2.DAO.DAO;
import com.br.si.bd2.dominioFactory.DominioFactory;





public class LeitorDeArquivoCSV {
	private String linha="";
	private String csvSeparador=";";
	private BufferedReader conteudocsv = null;
	

public void leitorcsv (String arquivocsv)  {
	try {
		conteudocsv = new BufferedReader(new FileReader(arquivocsv));
		while((linha = conteudocsv.readLine()) != null) {
			String[] arquivo = linha.split(csvSeparador);
			Dominio dominio = new Dominio();
			dominio.setDominio(arquivo[0]);
			dominio.setDocumento(arquivo[1]);
			dominio.setNome(arquivo[2]);
			dominio.setData_cadastro(arquivo[6]);
			dominio.setUltima_atualizacao(arquivo[7]);
			dominio.setTicket(arquivo[8]);
			
			Endereco endereco = new Endereco();
			endereco.setUf(arquivo[3]);
			endereco.setCidade(arquivo[4]);
			endereco.setCep(arquivo[5]);
			
			
			
			
			DAO dao = DominioFactory.CriaInstancia();
			dao.Cadastra(dominio, endereco);
			
			
			
			
			
			

		}
		
	} catch (Exception e) {
		e.printStackTrace();
		
	}
}
}
