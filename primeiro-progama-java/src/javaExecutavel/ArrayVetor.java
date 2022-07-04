package javaExecutavel;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArrayVetor {

	public static void main(String[] args) {

		double[] notas = { 8.6, 9.8, 5.9, 8.8 };
		double[] notas2 = { 7.6, 8.5, 8.1, 9.9 };

		Aluno aluno = new Aluno();
		// Criação do aluno
		aluno.setNome("Andrew Felipe Moreno");
		aluno.setNomeEscola("Java");

		// Criação da Disciplina
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Java-linguagem");
		disciplina.setNota(notas);

		aluno.getDisciplinas().add(disciplina);

		// Criação da Disciplina
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Lógica");
		disciplina2.setNota(notas2);
		aluno.getDisciplinas().add(disciplina2);

		System.out.println("Nome aluno: " + aluno.getNome() + "\n escola: " + aluno.getNomeEscola());
		System.out.println("---------Disciplinas do aluno--------");
		for (Disciplina d : aluno.getDisciplinas()) {
			System.out.println("\n" + d.getDisciplina());

			System.out.println("As notas da disciplina são: ");

			//Maior nota do aluno
			double notaMax = 0.0;

			for (int pos = 0; pos < d.getNota().length; pos++) {
				System.out.print(d.getNota()[pos] + ", ");

				if (pos == 0) {
					notaMax = d.getNota()[pos];
				} else {
					if(d.getNota()[pos] > notaMax ) {
						notaMax = d.getNota()[pos];
					}
				}

			}
			System.out.println("\nA maior nota do aluno é: "+notaMax);
		}
		
	}
}
