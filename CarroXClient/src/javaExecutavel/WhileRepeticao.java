package javaExecutavel;

import javax.swing.JOptionPane;

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

		String carros = JOptionPane.showInputDialog("informe quantos carros no estoque.");
		String pessoas = JOptionPane.showInputDialog("Informe quantos pessoas querem comprar.");

		double carrosNumero = Double.parseDouble(carros);
		double pessoasNumero = Double.parseDouble(pessoas);

		int divisao = (int) (carrosNumero / pessoasNumero);
		int faltaCarro = (int) (pessoasNumero - carrosNumero);

		double resto = (carrosNumero % pessoasNumero);

		if (resto == 0) {
			System.out.println("Os carros foram divididos entre " + pessoasNumero + " pessoas e cada uma levou "
					+ divisao + (" carros para casa."));
		} else if (pessoasNumero > carrosNumero) {
			System.out.println(resto + " conseguiram ter seus carro, porem " + faltaCarro + " ficaram sem carros.");
		}

		else {
			System.out.println("Os carros foram divididos ente " + pessoasNumero + " pessoas e sobraram um toral de : "
					+ resto + "carros no estoque.");
		}

	}

}
