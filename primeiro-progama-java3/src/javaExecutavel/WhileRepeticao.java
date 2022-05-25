package javaExecutavel;

public class WhileRepeticao {
	/*
	 * Essa variavel é do tipo Global é acessivel a todos e seu valor é
	 * compartilhado
	 */
	static int maiorIdadeGlobal = 30;

	/* testando commit, se alterar o projeto no github ja era. */
	public static void main(String[] args) {

		System.out.println("Olá Mundo! primeiro progama em Java :D oi");
		/* Essas váriaveis são locais, portanto acessiveis somente a esse metodo */

		int numero = 0;

		while (numero <= 10) { /* Verifica depois executa */

			System.out.println("Numero atual é " + numero);
			numero++;

		}
		int numero2 = 0;
		do { /* Primeiro executa depois verifica */

			System.out.println("o numero atual é " + numero2);
			numero2++;
		} while (numero2 <= 20);

	}

}
