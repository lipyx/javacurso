package conversorTermometro;

import java.util.Scanner;

public class Conversor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Qual a temperatura em graus?");
		try (Scanner txt = new Scanner(System.in)) {
			Double graus = txt.nextDouble();
			// Variaveis de convers�o

			double fahre = graus * 1.8 + 32;
			double kelvin = graus + 273.15;
			double reau = graus * 0.8;
			double ranke = graus * 1.8 + 32 + 459.67;

			System.out.println(" Fahrenheit " + fahre + "\n Kelvin " + kelvin + "\n R�aumur " + reau
					+ "\n Rankine " + ranke);
		}

	}

}
