package cursojava.datas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class ModuloDatas{

	public static void main(String[] args) throws InterruptedException {
		 
		Date data = new Date();
		
		/*for (int i = 0; i < 100; i++) {
			 Date data = new Date();
			System.out.println(data);
			new Thread();
			Thread.sleep(1000);
		}*/
		
		Calendar calendar =  Calendar.getInstance();
		
		System.out.println("Dia do mês "+ calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println("Dia da semana "+ calendar.get(Calendar.DAY_OF_WEEK));
		System.out.println("Hora do dia "+ calendar.get(Calendar.DAY_OF_WEEK));
		System.out.println("Minuto da hora "+calendar.get(Calendar.MINUTE));
		System.out.println("Segundos da hora "+ calendar.get(Calendar.SECOND));
		System.out.println("Ano " + calendar.get(Calendar.YEAR));
		
		System.out.println("--------------Simple date Format------------");
		
		SimpleDateFormat simpledate = new SimpleDateFormat("dd/MM/yyyy HH:mm.ss");
		System.out.println("\ndata padrão em String: "+ simpledate.format(data)+"\n");
		
		System.out.println("Data atual "+ simpledate.format(calendar.getTime()));
		
		
		simpledate = new SimpleDateFormat("yyyy-MM-dd HH:mm.ss");
		System.out.println("Data padrão Banco de Dados: "+ simpledate.format(calendar.getTime()));
	}             

}
