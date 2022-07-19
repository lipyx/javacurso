package cursojava.thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilaThread extends Thread {

	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilhaFila = new ConcurrentLinkedQueue<ObjetoFilaThread>();

	public static void addObjeto(ObjetoFilaThread objetoFilaThread) {

		pilhaFila.add(objetoFilaThread);

	}

	@Override
	public void run() {
		Iterator iterator = pilhaFila.iterator();

		synchronized (iterator) { // bloqueia o acesso a lista por outros processos

			while (iterator.hasNext()) {

				ObjetoFilaThread processar = (ObjetoFilaThread) iterator.next();

				// Processar 10 mil nota fiscais
				// Disparar milhares de e-mails
				// Gerar lista grande de PDF
				
				iterator.remove();

				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {// tempo para descarga de memoria entre processos
				}
			}
		}

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
