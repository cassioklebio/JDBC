package com.br.si.bd2.Principal;

import com.br.si.bd2.dados.LeitorDeArquivoCSV;

public class App {

	public static void main(String[] args) {
		String arquivo = "/home/cassio/Documentos/Dominios_GovBR_basico.csv";
		LeitorDeArquivoCSV leitor = new LeitorDeArquivoCSV();
		leitor.leitorcsv(arquivo);
	}

}
