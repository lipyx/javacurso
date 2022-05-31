package javaExecutavel;

import cursojava.classes.Aluno;

public class ClasseJava {

	public static void main(String[] args) {
		/* new Aluno() � uma inst�ncia (cria��o de um objeto) */
		/* aluno1 � uma refer�ncia para o objeto */
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Felipe");
		aluno1.setIdade(30);
		aluno1.setDataNascimento("19/09/1991");
		aluno1.setRegistroGeral("47.888.888-9");
		aluno1.setNumeroCpf("123.123.123-58");
		aluno1.setNomeMae("Isabel");
		aluno1.setNomePai("Roberto");
		aluno1.setDataMatricula("15/15/2022");
		aluno1.setNomeEscola("Java");
		aluno1.setSerieMatriculado("2");
		
		System.out.println("nome � "+ aluno1.getNome());
		
		
		Aluno aluno5 = new Aluno("Roberto"); /* Construtor com 1 parametro (nome) */
		Aluno aluno6 = new Aluno("Jos�", 53); /* Construtor com 2 par�metros (nome, idade) */
		
		aluno1.setNome("Andrew Felipe Moreno");
		System.out.println("o nome do aluno � "+ aluno1.getNome());
	}

	
}
