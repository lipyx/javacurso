package javaExecutavel;

public class PrimeiroProgama2 {
	/*
	 * Essa variavel � do tipo Global � acessivel a todos e seu valor �
	 * compartilhado
	 */
	static int maiorIdadeGlobal = 30;

	/* testando commit, se alterar o projeto no github ja era. */
	public static void main(String[] args) {

		System.out.println("Ol� Mundo! primeiro progama em Java :D oi");
		/* Essas v�riaveis s�o locais, portanto acessiveis somente a esse metodo */

		float nota1 = 20;
		float nota2 = 75;
		float nota3 = 65;
		float nota4 = 59;
		float mediaNota = 0;

		mediaNota = (nota1 + nota2 + nota3 + nota4) / 4;

		String name = "lipy";

		if (mediaNota >= 70 && name.equals("lipy")) {
			System.out.println("Parab�ns voc� foi aprovado com m�dia = " + mediaNota);
		} else if (name != "lipy") {
			System.out.println("Aluno n�o encontrado ");
		} else {
			System.out.println("Voc� foi reprovado: " + mediaNota);

		}

	}

}
