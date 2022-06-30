package elementosPrimarios;

import javax.swing.JOptionPane;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account myAccount = new Account();

		String conta = JOptionPane.showInputDialog("Nome da conta");
		String senha = JOptionPane.showInputDialog("Senha da conta?");

		myAccount.setNome(conta);
		myAccount.setPassword(senha);

		int maiuscula = 0, minuscula = 0, numeros = 0;
		for (int i = 0; i < senha.length(); i++) {
			char c = senha.charAt(i);
			if (Character.isUpperCase(c)) {
				maiuscula++;
			} else if (Character.isLowerCase(c)) {
				minuscula++;
			} else if (Character.isDigit(c)) {
				numeros++;
			}

		}

		int charCount = conta.length();

		if (maiuscula < 1) {
			System.out.println("A senha deve conter pelo menos uma letra Maiuscula");
		} else if (minuscula < 1) {
			System.out.println("a Senha deve conter pelo menos uma letra Minuscula");
		} else if (numeros < 1) {
			System.out.println("A senha de conter pelo menos um número");
		} else if (charCount <= 3) {
			System.out.println("O nome da conta deve conter pelo menos 4 Caracteres");
		} else {
			System.out.println("Conta criada com sucesso.");
		}

	}
}
