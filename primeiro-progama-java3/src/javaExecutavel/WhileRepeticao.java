package javaExecutavel;
import javax.swing.JOptionPane;
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
		
		String carros = JOptionPane.showInputDialog("informe quantos carros no estoque.");
		String pessoas = JOptionPane.showInputDialog("Informe quantos pessoas querem comprar.");
		
		double carrosNumero = Double.parseDouble(carros);
		double pessoasNumero = Double.parseDouble(pessoas);
		
		int divisao = (int)  (carrosNumero / pessoasNumero);
		
		double resto = (carrosNumero % pessoasNumero);
		
	
		
		if (resto == 0) {
			System.out.println("N�o sobraram nenhum carro para venda");
		}else {
			System.out.println("Sobraram um total de " + resto + " carros");
		}
		
	}

}
