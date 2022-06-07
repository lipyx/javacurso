package javaExecutavel;

import java.util.Iterator;
import java.util.Arrays;
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] primos = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31 };
		int[] somas = new int[11];
		for (int i = 0; i < 11; i++) {
			somas[i] = 0;
			for (int j = 0; j <= i; j++)
				somas[i] += primos[j];
		}
		System.out.print("somas:" + Arrays.toString(somas));
		for (int i = 0; i < 11; i++)
			System.out.print(" " + somas[i]);
	

	}

}
