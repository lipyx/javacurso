package javaExecutavel;

public class PrimeiroProgama2 {
	/*
	 * Essa variavel é do tipo Global é acessivel a todos e seu valor é
	 * compartilhado
	 */
	static int maiorIdadeGlobal = 30;

	/* testando commit, se alterar o projeto no github ja era. */
	public static void main(String[] args) {

		System.out.println("Olá Mundo! primeiro progama em Java :D oi");
		/* Essas váriaveis são locais, portanto acessiveis somente a esse metodo */

		float nota1 = 20;
		float nota2 = 15;
		float nota3 = 65;
		float nota4 = 9;
		float mediaNota = 0;

		mediaNota = (nota1 + nota2 + nota3 + nota4) / 4;
/*
		String name = "lipy";

		if (mediaNota >= 70 && name.equals("lipy")) {
			System.out.println("Parabéns você foi aprovado com média = " + mediaNota);
		} else if (name != "lipy") {
			System.out.println("Aluno não encontrado ");
		} else {
			System.out.println("Você foi reprovado: " + mediaNota);

		}*/
		
		/*Operadores ternários de micro validções*/
		
		String saidaResultado = mediaNota >= 70 ? "aluno aprovado" : (mediaNota >= 40 && mediaNota <=69) ? "aluno em recuperação" : "reprovado";
		System.out.println(saidaResultado);
	}

}
