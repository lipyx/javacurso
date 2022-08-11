package cursojava.datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AfterBeforeDate {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		Date dataVencimentoBoleto = dateFormat.parse("11/08/2022");
		
		Date diaAtual = dateFormat.parse("10/08/2022");
		
		if (diaAtual.before(dataVencimentoBoleto)) {
			System.out.println("Nao venceu");
		}else {
			System.out.println("Boleto vencido");
		}
	}
}
