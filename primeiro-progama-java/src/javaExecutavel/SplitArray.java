package javaExecutavel;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;

public class SplitArray {

	public static void main(String[] args) {

		String text = "Andrew, Java, 80, 90, 78, 85";

		String[] textoArray = text.split(",");

		System.out.println("Nome: " + textoArray[0]);
		System.out.println("Curso: " + textoArray[1]);
		System.out.println("Nota: " + textoArray[2]);
		System.out.println("Nota: " + textoArray[3]);
		System.out.println("Nota: " + textoArray[4]);
		System.out.println("Nota: " + textoArray[5]);

		// Transformando um Array em Lista
		List<String> lista = Arrays.asList(textoArray);

		for (String string : lista) {
			//System.out.println(string);
		}
		// Converter lista em Array
		String[] conversorLista = lista.toArray(new String[6]);

		for (int pos = 0; pos < conversorLista.length; pos ++) {
			System.out.println(conversorLista[pos]);
		}
		
	}

}
