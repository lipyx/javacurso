package javaExecutavel;

import cursojava.classes.Aluno;

public class ClasseJava {

	public static void main(String[] args) {
		/* new Aluno() é uma instância (criação de um objeto) */
		/* aluno1 é uma referência para o objeto */
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
		
		System.out.println("Meu nome é "+ aluno1.getNome());
		System.out.println("Idade é "+ aluno1.getIdade());
		System.out.println("Escola é "+ aluno1.getNomeEscola());
		
		System.out.println("---------------------------------------------------------");
		/*================================================================================*/
		Aluno aluno2 = new Aluno();
		
		aluno2.setNome("Andrew");
		aluno2.setIdade(25);
		aluno2.setDataNascimento("08/05/1999");
		
		System.out.println("Meu nome é "+ aluno2.getNome());
		System.out.println("Idade é "+ aluno2.getIdade());
		System.out.println("Nascimento é "+ aluno2.getDataNascimento());
		
		/*---------------------------------------------------------------------------*/
		Aluno aluno5 = new Aluno("Roberto"); /* Construtor com 1 parametro (nome) */
		Aluno aluno6 = new Aluno("José", 53); /* Construtor com 2 parâmetros (nome, idade) */
		
		aluno1.setNome("Andrew Felipe Moreno");
		/*System.out.println("o nome do aluno é "+ aluno1.getNome());*/
	}

	
}
