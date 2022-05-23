package javaExecutavel;

import java.sql.Date;

public class PrimeiroProgama {
	private static Date nascimento;

	/*testando commit, se alterar o projeto no github ja era.*/
	public static void main(String[] args) {
		
		System.out.println("Olá Mundo! primeiro progama em Java :D oi");
		
	}

	public static Date getNascimento() {
		return nascimento;
	}

	public static void setNascimento(Date nascimento) {
		PrimeiroProgama.nascimento = nascimento;
	}
	

}
