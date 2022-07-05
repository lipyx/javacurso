package cursojava.thread;

import javax.swing.JOptionPane;

public class AulaThread {

	public static void main(String[] args) throws InterruptedException {

		new Thread() {

			// comando que executa o codigo dentro da thread
			public void run() {

				for (int pos = 0; pos < 10; pos++) {
					try {
						Thread.sleep(1000);
						System.out.println("Exemplo de espera, manipulando as thread.Envio de e-mail");
					} catch (InterruptedException e) {
						e.printStackTrace();

					}
				}
			}

		}.start();// comando "start" inicia a thread

		/*-------------- DIVISÃO DE THREAD------------*/

		new Thread() {

			// comando que executa o codigo dentro da thread
			public void run() {

				for (int pos = 0; pos < 10; pos++) {
					try {
						Thread.sleep(2000);
						System.out.println("Exemplo de espera, manipulando as thread.Emissão de nota");
					} catch (InterruptedException e) {
						e.printStackTrace();

					}
				}
			}

		}.start();// comando "start" inicia a thread

		JOptionPane.showMessageDialog(null, "O progama esta terminando o processo por trás dos sistema");
	}

}
