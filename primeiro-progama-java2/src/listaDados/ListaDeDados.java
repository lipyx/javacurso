package listaDados;

import java.util.*;
import java.util.Random;

public class ListaDeDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random sexo = new Random();

		int qtMulher = 0;
		int qtHomem = 0;
		for (int i = 0; i <= 9; i++) {

			double rand = sexo.nextDouble() + 1;
			if (rand == 1) {
				qtHomem++;
			} else {
				qtMulher++;
			}
		}
		// System.out.println(qtMulher);
		// System.out.println(qtHomem);

		double start = 1;
		double end = 2;
		double random = new Random().nextDouble() + 1.1;
		double result = start + (random * (end - start));
		System.out.format("%.2f", random);
	}

}
