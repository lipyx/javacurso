package elementosPrimarios;
import java.util.Scanner;
public class FerramentaEstudo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int numero1;
		int numero2;
		int soma;
		
		System.out.println("adicione o primeiro numero: ");
		numero1 = input.nextInt();
		System.out.println("adicione o segundo numero: ");
		numero2 = input.nextInt();
		soma = numero1 + numero2;
		
		System.out.println("A soma dos dois numero " + soma);
	}// fim do metodo main

}// Fim da class
