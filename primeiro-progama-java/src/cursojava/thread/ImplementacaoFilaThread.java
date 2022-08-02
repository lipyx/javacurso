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

		System.out.println("Fila rodando");
		while (true) {

			synchronized (pilhaFila) { // bloqueia o acesso a lista por outros processos

				Iterator<ObjetoFilaThread> iterator = pilhaFila.iterator();

				while (iterator.hasNext()) { // enquanto tiver dados na lista ele ira processar

					ObjetoFilaThread processar = (ObjetoFilaThread) iterator.next();// exemplo

					// Processar 10 mil nota fiscais
					// Disparar milhares de e-mails
					// Gerar lista grande de PDF

					
					
					System.out.println("----------------------");
					System.out.println(processar.getNome());
					System.out.println(processar.getEmail());
					
					
					iterator.remove();
					
					try {
						Thread.sleep(100);
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
}
