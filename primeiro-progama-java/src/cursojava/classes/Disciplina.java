package cursojava.classes;

import java.text.ParsePosition;
import java.util.Arrays;
import java.util.Objects;

public class Disciplina {

	private double nota[];
	private String disciplina;

	public double[] getNota() {
		return nota;
	}

	public void setNota(double[] nota) {
		this.nota = nota;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(nota);
		return result;
	}

	public double getNotaMedia() {

		double notaTotal = 0;

		for (int pos = 0; pos < nota.length; pos++) {

			notaTotal = +nota[pos];

		}
		return notaTotal / 4;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplina other = (Disciplina) obj;
		return Arrays.equals(nota, other.nota);
	}

	@Override
	public String toString() {
		return "Disciplina [nota=" + Arrays.toString(nota) + ", disciplina=" + disciplina + "]";
	}

}
