package cursojava.thread;

import javax.swing.JOptionPane;

public class AulaThread {

	public static void main(String[] args) throws InterruptedException {

		// Objeto da thread, aumento do poder de manipulação da thread.
		Thread threadEmail = new Thread(thread1);
		threadEmail.start();

		/*-------------- DIVIS�O DE THREAD------------*/

		Thread threadNota = new Thread(thread2);
		threadNota.start();

		JOptionPane.showMessageDialog(null, "O progama esta terminando o processo por trás do sistema");

	}

	// -------- Transformando uma thread em Objeto atraves do metodo Runnable
	public static Runnable thread1 = new Runnable() {

		@Override
		public void run() {

			{

				for (int pos = 0; pos < 10; pos++) {
					try {
						Thread.sleep(2000);
						System.out.println("Exemplo de espera, manipulando as thread.Emissão de nota");
					} catch (InterruptedException e) {
						e.printStackTrace();

					}
				}
			}

		}
	};
	public static Runnable thread2 = new Runnable() {

		@Override
		public void run() {

			{

				for (int pos = 0; pos < 10; pos++) {
					try {
						Thread.sleep(1000);
						System.out.println("Exemplo de espera, manipulando as thread.Envio de e-mail.");
					} catch (InterruptedException e) {
						e.printStackTrace();

					}
				}
			}

		}
	};
}// classe 
