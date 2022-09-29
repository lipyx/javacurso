package leitura.e.escrita.arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import cursojava.classes.Pessoa;

public class LerArquivoTxt {

	public static void main(String[] args) throws FileNotFoundException {

		FileInputStream entradaArquivo = new FileInputStream(new File(
				"C:\\Users\\Felipe\\git\\javacurso\\primeiro-progama-java\\src\\leitura\\e\\escrita\\arquivos\\arquivo.txt"));

		Scanner lerAquivo = new Scanner(entradaArquivo, "UTF-8");
		List<Cidadao> cidadoes = new ArrayList<Cidadao>();
		
		
		while (lerAquivo.hasNext()) {
			
			String ler = lerAquivo.nextLine();
			
			String[] dados = ler.split("\\;");
			
			Cidadao cidadao = new Cidadao();
			
			cidadao.setNome(dados[0]);
			cidadao.setEmail(dados[1]);
			cidadao.setIdade(Integer.parseInt(dados[2]));
			
			cidadoes.add(cidadao);
		}
		
		for (Cidadao cidadao : cidadoes) {
			
			System.out.println(cidadao);
			
		}
		
	}

	
}
