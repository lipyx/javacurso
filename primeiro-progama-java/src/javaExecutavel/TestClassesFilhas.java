package javaExecutavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Secretario;

public class TestClassesFilhas {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		Diretor diretor = new Diretor();
		Secretario secretario = new Secretario();

		aluno.setNome("Andrew");
		aluno.setNomeEscola("Unifeob");

		diretor.setRegistroGeral("651d6as1dasw56d");
		diretor.setNome("Osvaldo");
		secretario.setNome("Jose");
		secretario.setExperiencia("Administração");

		System.out.println(secretario);
		System.out.println("Salario do diretor: "+ diretor.salario());

	}

}
