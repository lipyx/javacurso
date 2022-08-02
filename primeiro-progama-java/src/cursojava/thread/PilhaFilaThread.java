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
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PilhaFilaThread extends JDialog {

	private JPanel jPanel = new JPanel(new GridBagLayout());

	private JLabel descricaoHora = new JLabel("Nome");
	private JTextField nomeTrhead = new JTextField();

	private JLabel descricaoHora2 = new JLabel("E-mail");
	private JTextField emailTrhead = new JTextField();

	private JButton jButtonStart = new JButton("Gerador de lista");
	private JButton jButtonStop = new JButton("Pausa");
	private JButton jButtonExit = new JButton("Exit");

	static ImplementacaoFilaThread fila = new ImplementacaoFilaThread();

	public PilhaFilaThread() {

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

		nomeTrhead.setPreferredSize(new Dimension(200, 23));
		gridbagconstrainsts.gridy++;
		nomeTrhead.setEditable(true);
		jPanel.add(nomeTrhead, gridbagconstrainsts);

		descricaoHora2.setPreferredSize(new Dimension(200, 23));
		gridbagconstrainsts.gridy++;
		jPanel.add(descricaoHora2, gridbagconstrainsts);

		emailTrhead.setPreferredSize(new Dimension(200, 23));
		gridbagconstrainsts.gridy++;
		emailTrhead.setEditable(true);
		jPanel.add(emailTrhead, gridbagconstrainsts);

		gridbagconstrainsts.gridwidth = 1;

		jButtonStart.setPreferredSize(new Dimension(90, 25));
		gridbagconstrainsts.gridy++;
		jPanel.add(jButtonStart, gridbagconstrainsts);
		jButtonStart.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if (fila == null) {
					fila = new ImplementacaoFilaThread();
					fila.start();
				}
				
				 for(int qtd = 0; qtd < 100; qtd++) {
				jButtonStop.setEnabled(true);
				
				ObjetoFilaThread filaThread = new ObjetoFilaThread();
				
				filaThread.setNome(nomeTrhead.getText());
				filaThread.setEmail(emailTrhead.getText()+ "-" +qtd);
				
				ImplementacaoFilaThread.addObjeto(filaThread);
				 }
			}
		});

		jButtonStop.setPreferredSize(new Dimension(90, 25));
		gridbagconstrainsts.gridx++;
		jPanel.add(jButtonStop, gridbagconstrainsts);
		jButtonStop.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("Fila em pausa.");
				fila.stop();
				fila = null;
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
		
		fila.start();

		add(jPanel, BorderLayout.WEST);

		setVisible(true);// ultimo codigo da tela a ser escrito
	}

}
