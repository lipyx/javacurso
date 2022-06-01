package javaExecutavel;

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
		aluno1.setNota1(58);
		aluno1.setNota2(89);
		aluno1.setNota3(58.96);
		aluno1.setNota4(79.9);

		System.out.println("Meu nome é " + aluno1.getNome());
		System.out.println("Idade é " + aluno1.getIdade());
		System.out.println("Escola é " + aluno1.getNomeEscola());
		System.out.println("Nota media do aluno: " + aluno1.getNotaMedia());
		System.out.println("O aluno esta matriculadno no " + seri[aluno1.getSerieMatriculado()] + " ano.");
		System.out.println("Aluno esta " + (aluno1.getAprovacao() ? "aprovado" : "reprovado"));

		System.out.println("---------------------------------------------------------");

		/*
		 * =============================================================================
		 * ===
		 */
		Aluno aluno2 = new Aluno();

		aluno2.setNome("Andrew");
		aluno2.setIdade(25);
		aluno2.setDataNascimento("08/05/1999");

		System.out.println("Meu nome é " + aluno2.getNome());
		System.out.println("Idade é " + aluno2.getIdade());
		System.out.println("Nascimento é " + aluno2.getDataNascimento());

		/*---------------------------------------------------------------------------*/

		aluno1.setNome("Andrew Felipe Moreno");
		/* System.out.println("o nome do aluno é "+ aluno1.getNome()); */
	}

}
