package cursojava.classes;

import java.util.ArrayList;
import java.util.List;

/*Essa é a classe/objeto que representa Aluno*/
public class Aluno extends Pessoa {

	/* Atributos do Aluno */

	private String dataMatricula;
	private String nomeEscola;
	private int serieMatriculado;

	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

	public Aluno() {/* Cria os dados na memória - padrão Java */

	}

	public Aluno(String nomePadrao) {
		nome = nomePadrao;

	}

	public Aluno(String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;

	}

	/* Metodos Getters e Setters */
	/* Setter ou SET, recebe ou adiciona dados para os atributos */
	/* Getters ou GET, é para resgatar ou obter valores dos atributos */
	public void setNome(String nome) {
		this.nome = nome;

	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}

	public String getNumeroCpf() {
		return numeroCpf;
	}

	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public int getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(int serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}

	/* Metodo que retorna a media do aluno e aprovação */
	public double getNotaMedia() {
		double somaNotas = 0.0;
		for (Disciplina disciplina : disciplinas) {
			somaNotas += disciplina.getNota();
		}

		return somaNotas / disciplinas.size();
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai
				+ ", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculado="
				+ serieMatriculado + "]";
	}
	
	public double salario() {
		return 1250.58;
	}

	double alunoNota = getNotaMedia();

	public String getAlunoAprovado() {
		double mediaAluno = this.getNotaMedia();
		if (mediaAluno >= 50) {
			if (mediaAluno >= 70) {
				return "Aluno esta aprovado";
			} else {
				return "Aluno esta em recuperação";
			}
		} else {
			return "Aluno reprovado";
		}
	}
	
}