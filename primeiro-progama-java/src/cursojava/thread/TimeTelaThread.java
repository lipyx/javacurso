package cursojava.thread;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TimeTelaThread extends JDialog {

	private JPanel jPanel = new JPanel(new GridBagLayout());

	private JLabel descricaoHora = new JLabel("Time Thread 01");
	private JTextField horaThread = new JTextField();

	private JLabel descricaoHora2 = new JLabel("Time Thread 02");
	private JTextField horaThread2 = new JTextField();

	private JButton jButtonStart = new JButton("Start");
	private JButton jButtonStop = new JButton("Stop");
	private JButton jButtonExit = new JButton("Exit");

	private Runnable thread1 = new Runnable() {

		@Override
		public void run() {

			while (true) {
				horaThread
						.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm.ss").format(Calendar.getInstance().getTime()));
				try {

					Thread.sleep(1000);

				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}

		}
	};

	private Thread threadTime1;

	private Runnable thread2 = new Runnable() {

		@Override
		public void run() {

			while (true) {

				horaThread2.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm.ss").format(Calendar.getInstance().getTime()));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
	};
	private Thread threadTime2;

	public TimeTelaThread() {

		setTitle("Minha tela Thread");
		setSize(new Dimension(240, 260));
		setLocationRelativeTo(null);
		setResizable(true);

		GridBagConstraints gridbagconstrainsts = new GridBagConstraints();// Controlador de componentes
		gridbagconstrainsts.gridx = 0;
		gridbagconstrainsts.gridy = 0;
		gridbagconstrainsts.gridwidth = 2;
		gridbagconstrainsts.insets = new Insets(5, 10, 5, 5);
		gridbagconstrainsts.anchor = GridBagConstraints.WEST;

		descricaoHora.setPreferredSize(new Dimension(200, 23));
		jPanel.add(descricaoHora, gridbagconstrainsts);

		horaThread.setPreferredSize(new Dimension(200, 23));
		gridbagconstrainsts.gridy++;
		horaThread.setEditable(false);
		jPanel.add(horaThread, gridbagconstrainsts);

		descricaoHora2.setPreferredSize(new Dimension(200, 23));
		gridbagconstrainsts.gridy++;
		jPanel.add(descricaoHora2, gridbagconstrainsts);

		horaThread2.setPreferredSize(new Dimension(200, 23));
		gridbagconstrainsts.gridy++;
		horaThread2.setEditable(false);
		jPanel.add(horaThread2, gridbagconstrainsts);

		gridbagconstrainsts.gridwidth = 1;

		jButtonStart.setPreferredSize(new Dimension(90, 25));
		gridbagconstrainsts.gridy++;
		jPanel.add(jButtonStart, gridbagconstrainsts);
		jButtonStart.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				threadTime1 = new Thread(thread1);
				threadTime1.start();
				threadTime2 = new Thread(thread2);
				threadTime2.start();
				
				jButtonStart.setEnabled(false);
				jButtonStop.setEnabled(true);
			}
		});

		jButtonStop.setPreferredSize(new Dimension(90, 25));
		gridbagconstrainsts.gridx++;
		jPanel.add(jButtonStop, gridbagconstrainsts);
		jButtonStop.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				threadTime1.stop();
				threadTime2.stop();

				jButtonStart.setEnabled(true);
				jButtonStop.setEnabled(false);
			}
		});
		gridbagconstrainsts.gridwidth = 2;
		jButtonExit.setPreferredSize(new Dimension(90, 25));
		gridbagconstrainsts.gridy ++;
		jButtonExit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
				
			}
		});
		
		jPanel.add(jButtonExit, gridbagconstrainsts);
		
		
		jButtonStop.setEnabled(false);

		add(jPanel, BorderLayout.WEST);

		setVisible(true);// ultimo codigo da tela a ser escrito
	}

}
