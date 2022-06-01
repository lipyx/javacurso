package javaExecutavel;

import java.util.function.DoublePredicate;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class ClasseJava {

	public static void main(String[] args) {
		/* new Aluno() é uma instância (criação de um objeto) */
		/* aluno1 é uma referência para o objeto */
		String nome = JOptionPane.showInputDialog("qual nome do aluno");
		String idade = JOptionPane.showInputDialog("qual a idade");
		String nascimento = JOptionPane.showInputDialog("data de nascimento");
		String rg = JOptionPane.showInputDialog("qual o RG 'SOMENTE NUMEROS'");
		String cpf = JOptionPane.showInputDialog("qual o CPF");
		String nomeMae = JOptionPane.showInputDialog("nome da Mãe");
		String nomePai = JOptionPane.showInputDialog("nome do Pai");
		String dataHoje = JOptionPane.showInputDialog("Data de hoje");
		String nomeEscola = JOptionPane.showInputDialog("Nome da Escola");
		String serie = JOptionPane.showInputDialog("Qual ano da serie");
		String nota1 = JOptionPane.showInputDialog("Nota 1");
		String nota2 = JOptionPane.showInputDialog("Nota 2");
		String nota3 = JOptionPane.showInputDialog("Nota 3");
		String nota4 = JOptionPane.showInputDialog("Nota 4");


		String seri[] = { "Primeiro", "Segundo", "Terceiro", "Quarto", "Quinto", "Sexto" };

		Aluno aluno1 = new Aluno();
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(nascimento);
		aluno1.setRegistroGeral(Integer.valueOf(rg));
		aluno1.setNumeroCpf(Integer.valueOf(cpf));
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setDataMatricula(dataHoje);
		aluno1.setNomeEscola(nomeEscola);
		aluno1.setSerieMatriculado(Integer.valueOf(serie));
		aluno1.setNota1(Double.parseDouble(nota1));
		aluno1.setNota2(Double.parseDouble(nota2));
		aluno1.setNota3(Double.parseDouble(nota3));
		aluno1.setNota4(Double.parseDouble(nota4));

		System.out.println(aluno1.toString());
		System.out.println("O aluno esta matriculadno no " + seri[aluno1.getSerieMatriculado()] + " ano.");
		System.out.println("Aluno esta " + (aluno1.getAprovacao() ? "aprovado" : "reprovado com média: " + aluno1.getNotaMedia()));

		System.out.println("---------------------------------------------------------");

		
		/*=============================================================================*/

	}

}
