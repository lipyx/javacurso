package javaExecutavel;

import java.util.*;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.classes.Secretario;
import cusojava.interfaces.PermitirAcesso;
import permitir.acesso.login.PermitirLogin;
import status.aprovacao.StatusAluno;

public class ClasseJava {

	public static void main(String[] args) {
		/* new Aluno() é uma instância (criação de um objeto) */
		/* aluno1 é uma referência para o objeto */
		List<Aluno> alunos = new ArrayList<Aluno>();
		List<Aluno> listAprovados = new ArrayList<Aluno>();
		List<Aluno> listRecuperacao = new ArrayList<Aluno>();
		List<Aluno> listReprovado = new ArrayList<Aluno>();

		String login = JOptionPane.showInputDialog("Informe o login");
		String senha = JOptionPane.showInputDialog("Informe a senha");
			
		
		PermitirAcesso permissao = new Secretario(login, senha);
		
		if (new PermitirLogin(permissao).autenticar()) {

			for (int qtd = 1; qtd <= 4; qtd++) {

				String nome = JOptionPane.showInputDialog("qual nome do aluno " + qtd);
				/*
				 * String idade = JOptionPane.showInputDialog("qual a idade"); String nascimento
				 * = JOptionPane.showInputDialog("data de nascimento"); String rg =
				 * JOptionPane.showInputDialog("qual o RG 'SOMENTE NUMEROS'"); String cpf =
				 * JOptionPane.showInputDialog("qual o CPF"); String nomeMae =
				 * JOptionPane.showInputDialog("nome da Mãe"); String nomePai =
				 * JOptionPane.showInputDialog("nome do Pai"); String dataHoje =
				 * JOptionPane.showInputDialog("Data de hoje"); String nomeEscola =
				 * JOptionPane.showInputDialog("Nome da Escola"); String serie =
				 * JOptionPane.showInputDialog("Qual ano da serie");
				 */

				Aluno aluno1 = new Aluno();
				aluno1.setNome(nome);
				/*
				 * aluno1.setIdade(Integer.valueOf(idade));
				 * aluno1.setDataNascimento(nascimento); aluno1.setRegistroGeral(rg);
				 * aluno1.setNumeroCpf(cpf); aluno1.setNomeMae(nomeMae);
				 * aluno1.setNomePai(nomePai); aluno1.setDataMatricula(dataHoje);
				 * aluno1.setNomeEscola(nomeEscola);
				 * aluno1.setSerieMatriculado(Integer.valueOf(serie));
				 */

				for (int pos = 1; pos <= 1; pos++) {

					String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos + "");
					String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " + pos + "");

					Disciplina disciplina = new Disciplina();
					disciplina.setDisciplina(nomeDisciplina);
					disciplina.setNota(Double.valueOf(notaDisciplina));
					aluno1.getDisciplinas().add(disciplina);

				}
				int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
				if (escolha == 0) {
					int continuaRemover = 0;
					while (continuaRemover == 0) {

						String removeDisciplina = JOptionPane.showInputDialog("Qual disciplina 1, 2, 3 ou 4");
						aluno1.getDisciplinas().remove(Integer.valueOf(removeDisciplina).intValue() - 1);
						continuaRemover = JOptionPane.showConfirmDialog(null, "Deseja remover mais desciplinas?");
					}
				}
				alunos.add(aluno1);

			}

			for (Aluno aluno : alunos) {
				if (aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.APROVADO)) {
					listAprovados.add(aluno);
				} else if (aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
					listRecuperacao.add(aluno);
				} else {
					aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.REPROVADO);
					listReprovado.add(aluno);
				}
			}
			System.out.println("--------------Lista de Aprovados ----------------");
			for (Aluno aluno : listAprovados) {
				System.out.println("Nome: " + aluno.getNome() + " " + aluno.getAlunoAprovado() + " com média: "
						+ aluno.getNotaMedia());
				for (Disciplina disci : aluno.getDisciplinas()) {
					System.out.println("Matéria: " + disci.getDisciplina() + " -> " + "Nota: " + disci.getNota());
				}
			}

			System.out.println("--------------Lista de Recuperação ----------------");
			for (Aluno aluno : listRecuperacao) {
				System.out.println("Nome: " + aluno.getNome() + " " + aluno.getAlunoAprovado() + " com média: "
						+ aluno.getNotaMedia());
				for (Disciplina disci : aluno.getDisciplinas()) {
					System.out.println("Matéria: " + disci.getDisciplina() + " -> " + "Nota: " + disci.getNota());
				}

			}

			System.out.println("-------------- Lista de Reprovados ----------------");
			for (Aluno aluno : listReprovado) {
				System.out.println("Nome: " + aluno.getNome() + " " + aluno.getAlunoAprovado() + " com média: "
						+ aluno.getNotaMedia());
				for (Disciplina disci : aluno.getDisciplinas()) {
					System.out.println("Matéria: " + disci.getDisciplina() + " -> " + "Nota: " + disci.getNota());
				}
			}
		}else {
			JOptionPane.showInternalMessageDialog(null, "Acesso não permitido");
		}
		
	}// Final da classe main
}// final da classe ClasseJava

/*
 * /* Algoritmo que troca um objeto de uma posição dentro da lista for (int pos
 * = 0; pos < alunos.size(); pos++) {
 * 
 * Aluno aluno = alunos.get(pos);
 * 
 * if (aluno.getNome().equalsIgnoreCase("516516")) {
 * 
 * Aluno trocar = new Aluno(); trocar.setNome("aluno foi trocado"); Disciplina
 * disciplina = new Disciplina(); disciplina.setDisciplina("Matematica");
 * disciplina.setNota(96);
 * 
 * trocar.getDisciplinas().add(disciplina);
 * 
 * alunos.set(pos, trocar); aluno = alunos.get(pos); }
 * 
 * System.out.println(aluno.getNome()); System.out.println("nota = " +
 * aluno.getNotaMedia()); System.out.println(aluno.getAlunoAprovado());
 * 
 * for (Disciplina disc : aluno.getDisciplinas()) {
 * 
 * System.out.println("Matéria : " + disc.getDisciplina() + "," + " nota = " +
 * disc.getNota());
 * 
 * } System.out.println(
 * "---------------------------------------------------------"); }
 */

/*
 * for (Aluno aluno : alunos) {
 * 
 * String seri[] = { "Primeiro", "Segundo", "Terceiro", "Quarto", "Quinto",
 * "Sexto" }; System.out.println(aluno.toString());
 * System.out.println("O aluno esta matriculadno no " +
 * seri[aluno.getSerieMatriculado()] + " ano.");
 * System.out.println("Média do aluno " + aluno.getNotaMedia());
 * System.out.println("Aluno esta " + aluno.getAlunoAprovado());
 * System.out.println(
 * "---------------------------------------------------------"); }
 */
