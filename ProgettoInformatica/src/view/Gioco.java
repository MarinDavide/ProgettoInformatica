package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Panel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

import Controller.Controller;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

public class Gioco {

	private JFrame frame;
	public Panel panel; 
	public Panel panel_1;
	public JComboBox<String> comboBox;
	public JComboBox<String> comboBox2;
	private JButton btnStart;
	private JButton btnAvanti1;
	private JButton btnIndietro1;
	private JButton btnDestra1;
	private JButton btnSinistra1;
	private JButton btnPorta1;
	private JButton btnPorta2;
	private JButton btnPorta3;
	private JButton btnPorta4;
	private JButton btng1;
	public JLabel lblDescrizione;
	private JLabel lblNewLabel_3;
	private JPanel panel_2;
	private JButton btnAvanti2;
	private JButton btnX1;

	public Gioco() {

		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 600, 371);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		panel = new Panel();
		panel.setBackground(new Color(204, 153, 102));
		frame.getContentPane().add(panel, "name_3536606897900");
		panel.setLayout(null);
		
		btnStart = new JButton("Entra");
		btnStart.setBackground(new Color(245, 222, 179));
		btnStart.setBounds(257, 283, 89, 23);
		panel.add(btnStart);
		
		JLabel lblNewLabel = new JLabel("DaGamy");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 40));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(149, 23, 209, 66);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Vuoi iniziare questa avventura?");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(88, 265, 414, 14);
		panel.add(lblNewLabel_1);
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		Image EsternoFull = new ImageIcon(this.getClass().getResource("/EsternoFull.png")).getImage();
		lblNewLabel_4.setIcon(new ImageIcon(EsternoFull));
		lblNewLabel_4.setBounds(0, 0, 594, 342);
		panel.add(lblNewLabel_4);
		
		panel_1 = new Panel();
		frame.getContentPane().add(panel_1, "name_3582719394500");
		panel_1.setLayout(null);
		
		comboBox = new JComboBox<String>();
		comboBox.setBackground(new Color(245, 222, 179));
		comboBox.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
		comboBox.setMaximumRowCount(3);
		comboBox.setBounds(381, 246, 180, 20);
		panel_1.add(comboBox);
		comboBox.addItem("-- Inventario --");	

		
		btnAvanti1 = new JButton("Avanti");
		btnAvanti1.setBackground(new Color(245, 222, 179));
		btnAvanti1.setFont(btnAvanti1.getFont().deriveFont(btnAvanti1.getFont().getSize() - 20f));
		btnAvanti1.setBounds(46, 206, 35, 35);
		Image Avanti = new ImageIcon(this.getClass().getResource("/arrowup.png")).getImage();
		btnAvanti1.setIcon(new ImageIcon(Avanti));
		panel_1.add(btnAvanti1);
		
		btnSinistra1 = new JButton("Sinistra");
		btnSinistra1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnSinistra1.setBackground(new Color(245, 222, 179));
		btnSinistra1.setFont(btnSinistra1.getFont().deriveFont(btnSinistra1.getFont().getSize() - 20f));
		btnSinistra1.setBounds(10, 246, 35, 35);
		Image Sinistra = new ImageIcon(this.getClass().getResource("/arrowlf.png")).getImage();
		btnSinistra1.setIcon(new ImageIcon(Sinistra));
		panel_1.add(btnSinistra1);
		
		btnDestra1 = new JButton("Destra");
		btnDestra1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDestra1.setBackground(new Color(245, 222, 179));
		btnDestra1.setFont(btnDestra1.getFont().deriveFont(btnDestra1.getFont().getSize() - 20f));
		btnDestra1.setBounds(85, 246, 35, 35);
		Image Destra = new ImageIcon(this.getClass().getResource("/arrowdx.png")).getImage();
		btnDestra1.setIcon(new ImageIcon(Destra));
		panel_1.add(btnDestra1);
		
		btnIndietro1 = new JButton("Indietro");
		btnIndietro1.setBackground(new Color(245, 222, 179));
		btnIndietro1.setFont(btnIndietro1.getFont().deriveFont(btnIndietro1.getFont().getSize() - 20f));
		btnIndietro1.setBounds(46, 286, 35, 35);
		Image Indietro = new ImageIcon(this.getClass().getResource("/arrowbk.png")).getImage();
		btnIndietro1.setIcon(new ImageIcon(Indietro));
		panel_1.add(btnIndietro1);
		
		btnPorta1= new JButton("Porta1");
		btnPorta1.setFont(btnPorta1.getFont().deriveFont(btnPorta1.getFont().getSize() - 20f));
		btnPorta1.setToolTipText("");
		btnPorta1.setBackground(Color.BLACK);
		btnPorta1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		Image Porta = new ImageIcon(this.getClass().getResource("/PortaBtn.jpg")).getImage();
		btnPorta1.setIcon(new ImageIcon(Porta));
		btnPorta1.setBounds(65, 26, 75, 145);
		panel_1.add(btnPorta1);
		
		btnPorta2 = new JButton("Porta2");
		btnPorta2.setBackground(Color.BLACK);
		btnPorta2.setIcon(new ImageIcon(Porta));
		btnPorta2.setFont(btnPorta2.getFont().deriveFont(btnPorta2.getFont().getSize() - 20f));
		btnPorta2.setToolTipText("");
		btnPorta2.setBounds(210, 26, 75, 145);
		panel_1.add(btnPorta2);
		
		btnPorta3 = new JButton("Porta3");
		btnPorta3.setBackground(Color.BLACK);
		btnPorta3.setIcon(new ImageIcon(Porta));
		btnPorta3.setFont(btnPorta3.getFont().deriveFont(btnPorta3.getFont().getSize() - 20f));
		btnPorta3.setBounds(354, 26, 75, 145);
		panel_1.add(btnPorta3);
		
		btnPorta4 = new JButton("Porta4");
		btnPorta4.setBackground(Color.BLACK);
		btnPorta4.setIcon(new ImageIcon(Porta));
		btnPorta4.setFont(btnPorta4.getFont().deriveFont(btnPorta4.getFont().getSize() - 20f));
		btnPorta4.setBounds(489, 26, 75, 145);
		panel_1.add(btnPorta4);
		
		lblDescrizione = new JLabel("");
		lblDescrizione.setForeground(Color.WHITE);
		lblDescrizione.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescrizione.setBounds(131, 193, 415, 30);
		panel_1.add(lblDescrizione);
		
		btng1 = new JButton("g1");
		btng1.setBackground(Color.BLACK);
		btng1.setFont(btng1.getFont().deriveFont(btng1.getFont().getSize() - 26f));
		Image gemmaArancio = new ImageIcon(this.getClass().getResource("/gemma-arancio.png")).getImage();
		btng1.setIcon(new ImageIcon(gemmaArancio));
		btng1.setBounds(230, 114, 45, 45);
		btng1.setVisible(false);
		panel_1.add(btng1);
		
		btnX1 = new JButton("X");
		btnX1.setBackground(new Color(245, 222, 179));
		btnX1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnX1.setFont(btnX1.getFont().deriveFont(btnX1.getFont().getSize() - 20f));
		btnX1.setBounds(543, 302, 41, 30);
		Image Esc = new ImageIcon(this.getClass().getResource("/ESC.png")).getImage();
		btnX1.setIcon(new ImageIcon(Esc));
		panel_1.add(btnX1);
		
		JLabel label = new JLabel("New label");
		label.setBounds(538, 318, -54, 3);
		panel_1.add(label);
		
		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		Image porte = new ImageIcon(this.getClass().getResource("/4Porte.jpg")).getImage();
		lblNewLabel_3.setIcon(new ImageIcon(porte));
		lblNewLabel_3.setBounds(0, 0, 584, 332);
		panel_1.add(lblNewLabel_3);
		
		panel_2 = new JPanel();
		frame.getContentPane().add(panel_2, "name_639847677300");
		panel_2.setLayout(null);
		
		btnAvanti2 = new JButton("Avanti1");
		btnAvanti2.setBounds(21, 237, 89, 23);
		panel_2.add(btnAvanti2);
		
		JButton btnNewButton = new JButton("Indietro1");
		btnNewButton.setBounds(21, 260, 89, 23);
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Destra1");
		btnNewButton_1.setBounds(21, 285, 89, 23);
		panel_2.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Sinistra1");
		btnNewButton_2.setBounds(21, 308, 89, 23);
		panel_2.add(btnNewButton_2);
		
		comboBox2 = new JComboBox<String>();
		comboBox2.setBackground(new Color(245, 222, 179));
		comboBox2.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
		comboBox2.setMaximumRowCount(3);
		comboBox2.setBounds(381, 246, 180, 20);
		panel_2.add(comboBox2);
		comboBox2.addItem("-- Inventario --");	
	}

	public void registraController(Controller controller) {
		btnStart.addActionListener(controller);
		btnAvanti1.addActionListener(controller);
		btnIndietro1.addActionListener(controller);
		btnDestra1.addActionListener(controller);
		btnSinistra1.addActionListener(controller);
		btnPorta1.addActionListener(controller);
		btnPorta2.addActionListener(controller);
		btnPorta3.addActionListener(controller);
		btnPorta4.addActionListener(controller);
		btng1.addActionListener(controller);
		btnX1.addActionListener(controller);
	}
	
	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		frame.setVisible(b);
	}
	
	public void descr(String messaggio) {
		lblDescrizione.setText(messaggio);
	}
	
	public void addInventory(String oggetto) {
		comboBox.addItem(oggetto);
		comboBox2.addItem(oggetto);
	}
	public void OpenDoor(int lvl) {
		if(lvl==2) {
			btnPorta2.setVisible(false);
		}
		
	}
	public void ShowItem(int lvl) {
		if(lvl==2) btng1.setVisible(true); 
	}
	public void TakeItem(int lvl, String oggetto) {
		if(lvl==2) btng1.setVisible(false);
		comboBox.addItem(oggetto);
	}
	public void start(int lvl) {
		if(lvl==2) {
			panel.setVisible(false);
			panel_1.setVisible(true);
			comboBox.addItem("ciao");
			comboBox.removeItem("ciao");
		}
		if(lvl==3) {
			panel_1.setVisible(false);
			panel_2.setVisible(true);
			comboBox2.addItem("ciao");
			comboBox2.removeItem("ciao");
		}
	}
	public void Quit(int lvl) {
		if(lvl==2) {
			panel_1.setVisible(false);
			panel.setVisible(true);
		}
		if(lvl==3) {
			panel_2.setVisible(false);
			panel.setVisible(true);
		}
	}
}
