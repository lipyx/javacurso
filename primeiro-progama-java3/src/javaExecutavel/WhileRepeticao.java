package javaExecutavel;

public class WhileRepeticao {
	/*
	 * Essa variavel � do tipo Global � acessivel a todos e seu valor �
	 * compartilhado
	 */
	static int maiorIdadeGlobal = 30;

	/* testando commit, se alterar o projeto no github ja era. */
	public static void main(String[] args) {

		System.out.println("Ol� Mundo! primeiro progama em Java :D oi");
		/* Essas v�riaveis s�o locais, portanto acessiveis somente a esse metodo */

		int numero = 0;

		while (numero <= 10) { /* Verifica depois executa */

			System.out.println("Numero atual � " + numero);
			numero++;

		}
		int numero2 = 0;
		do { /* Primeiro executa depois verifica */

			System.out.println("o numero atual � " + numero2);
			numero2++;
		} while (numero2 <= 20);

	}

}
