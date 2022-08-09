package cursojava.datas;

import java.util.Date;

public class ModuloDatas{

	public static void main(String[] args) throws InterruptedException {

		
		for (int i = 0; i < 100; i++) {
			 Date data = new Date();
			System.out.println(data);
			new Thread();
			Thread.sleep(1000);
		}
		
	}

}
