package leitura.e.escrita.arquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EscritaArquivotxt {

	public static void main(String[] args) throws IOException {

		Cidadao cidadao1 = new Cidadao();
		cidadao1.setNome("Felipe");
		cidadao1.setEmail("lipyx@gmail.com");
		cidadao1.setIdade(31);

		Cidadao cidadao2 = new Cidadao();
		cidadao2.setNome("Moreno");
		cidadao2.setEmail("lipyxx@gmail.com");
		cidadao2.setIdade(18);

		Cidadao cidadao3 = new Cidadao();
		cidadao3.setNome("Andrew");
		cidadao3.setEmail("lipyx23@gmail.com");
		cidadao3.setIdade(21);

		List<Cidadao> cidadaos = new ArrayList<Cidadao>();
		cidadaos.add(cidadao1);
		cidadaos.add(cidadao2);
		cidadaos.add(cidadao3);

		File arquivo = new File(
				"C:\\Users\\Felipe\\git\\javacurso\\primeiro-progama-java\\src\\leitura\\e\\escrita\\arquivos\\arquivo.txt");

		if (!arquivo.exists()) {

			arquivo.createNewFile();

		}

		FileWriter escrever = new FileWriter(arquivo);

		for (Cidadao cid : cidadaos) {

			escrever.write(cid.getNome() + ";" + cid.getEmail() + ";" + cid.getIdade() + "\n");
		}
		escrever.flush();
		escrever.close();
	}

}
