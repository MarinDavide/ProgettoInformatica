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
	public Panel start;
	public Panel livello1;
	public JComboBox<String> comboBox;
	public JComboBox<String> comboBox2;
	public JComboBox<String> comboBox2_1;
	private JButton btnStart;
	private JButton btnAvanti1;
	private JButton btnDestra1;
	private JButton btnSinistra1;
	private JButton btnPorta1;
	private JButton btnPorta2;
	private JButton btnPorta3;
	private JButton btnPorta4;
	private JButton btng1;
	public JLabel lblDescrizione;
	private JLabel lblNewLabel_3;
	private JLabel lblHP;
	private JLabel lblHP_1;
	private JPanel livello2;
	private JButton btnAvanti2;
	private JButton btnX1;
	private JPanel livello3;
	private JPanel perdita;
	private JPanel vittoria;
	private JLabel lblPerdita;
	private JLabel lblNewLabel_2;
	private JButton btnPorta5;
	private JLabel lblNewLabel_5;
	private JLabel lblDescrizione1;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JPanel livello2_1;
	private JLabel lblHP2_1;
	private JButton btnLeva1;
	private JButton btnAvanti2_1;
	private JButton btnDestra2_1;
	private JButton btnSinistra2_1;
	private JLabel lblDescrizione2_1;
	private JButton btng2;
	private JLabel lblHP_3;
	private JComboBox<String> comboBox3;
	private JButton btnAvanti3;
	private JButton btnSinistra3;
	private JButton btnDestra3;
	private JLabel lblNewLabel_6;
	private JLabel lblDescrizione22;
	private JButton btnPortaFine;
	private JButton btnSer1;
	private JButton btnSer2;

	Image occhio = new ImageIcon(this.getClass().getResource("/occhio.png")).getImage();
	Image Destra = new ImageIcon(this.getClass().getResource("/arrowdx.png")).getImage();
	Image Sinistra = new ImageIcon(this.getClass().getResource("/arrowlf.png")).getImage();
	Image Porta = new ImageIcon(this.getClass().getResource("/PortaBtn.jpg")).getImage();
	Image oneheart = new ImageIcon(this.getClass().getResource("/1heart.png")).getImage();
	Image twoheart = new ImageIcon(this.getClass().getResource("/2heart.png")).getImage();
	Image threeheart = new ImageIcon(this.getClass().getResource("/3heart.png")).getImage();
	Image fourheart = new ImageIcon(this.getClass().getResource("/4heart.png")).getImage();
	Image portaThread = new ImageIcon(this.getClass().getResource("/PortaThread.jpg")).getImage();
	Image stato0 = new ImageIcon(this.getClass().getResource("/Stato0png.png")).getImage();
	Image stato1 = new ImageIcon(this.getClass().getResource("/Stato1.png")).getImage();
	Image stato2 = new ImageIcon(this.getClass().getResource("/Stato2.png")).getImage();
	Image portaFine = new ImageIcon(this.getClass().getResource("/portaFine.jpg")).getImage();
	Image portaFine0 = new ImageIcon(this.getClass().getResource("/portaFine0.png")).getImage();
	Image portaFine2 = new ImageIcon(this.getClass().getResource("/portaFine2.png")).getImage();
	Image sfondoser1 = new ImageIcon(this.getClass().getResource("/Ser1.png")).getImage();
	Image sfondoser2 = new ImageIcon(this.getClass().getResource("/Ser2.png")).getImage();
	Image ser1 = new ImageIcon(this.getClass().getResource("/sergemma.png")).getImage();
	Image ser2 = new ImageIcon(this.getClass().getResource("/serdiamante.png")).getImage();
	private JLabel lblPerdita_1;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;

	public Gioco() {

		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 600, 371);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));

		start = new Panel();
		start.setBackground(new Color(204, 153, 102));
		frame.getContentPane().add(start, "name_3536606897900");
		start.setLayout(null);

		btnStart = new JButton("Entra");
		btnStart.setBackground(new Color(245, 222, 179));
		btnStart.setBounds(257, 283, 89, 23);
		start.add(btnStart);

		JLabel lblNewLabel = new JLabel("DaGamy");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 40));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(149, 23, 209, 66);
		start.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Vuoi iniziare questa avventura?");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(88, 265, 414, 14);
		start.add(lblNewLabel_1);
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		Image EsternoFull = new ImageIcon(this.getClass().getResource("/EsternoFull.png")).getImage();
		lblNewLabel_4.setIcon(new ImageIcon(EsternoFull));
		lblNewLabel_4.setBounds(0, 0, 594, 342);
		start.add(lblNewLabel_4);

		livello1 = new Panel();
		frame.getContentPane().add(livello1, "name_3582719394500");
		livello1.setLayout(null);

		lblHP = new JLabel("");
		lblHP.setForeground(Color.WHITE);
		lblHP.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblHP.setIcon(new ImageIcon(fourheart));
		lblHP.setBounds(188, 275, 160, 30);
		livello1.add(lblHP);

		comboBox = new JComboBox<String>();
		comboBox.setBackground(new Color(245, 222, 179));
		comboBox.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
		comboBox.setMaximumRowCount(3);
		comboBox.setBounds(381, 246, 180, 20);
		livello1.add(comboBox);
		comboBox.addItem("-- Inventario --");

		btnAvanti1 = new JButton("Avanti");
		btnAvanti1.setBackground(new Color(245, 222, 179));
		btnAvanti1.setFont(btnAvanti1.getFont().deriveFont(btnAvanti1.getFont().getSize() - 20f));
		btnAvanti1.setBounds(27, 202, 35, 35);
		btnAvanti1.setIcon(new ImageIcon(occhio));
		livello1.add(btnAvanti1);

		btnSinistra1 = new JButton("Sinistra");
		btnSinistra1.setBackground(new Color(245, 222, 179));
		btnSinistra1.setFont(btnSinistra1.getFont().deriveFont(btnSinistra1.getFont().getSize() - 20f));
		btnSinistra1.setBounds(27, 248, 35, 35);
		btnSinistra1.setIcon(new ImageIcon(Sinistra));
		livello1.add(btnSinistra1);

		btnDestra1 = new JButton("Destra");
		btnDestra1.setBackground(new Color(245, 222, 179));
		btnDestra1.setFont(btnDestra1.getFont().deriveFont(btnDestra1.getFont().getSize() - 20f));
		btnDestra1.setBounds(66, 248, 35, 35);
		btnDestra1.setIcon(new ImageIcon(Destra));
		livello1.add(btnDestra1);

		btnPorta1 = new JButton("Porta1");
		btnPorta1.setFont(btnPorta1.getFont().deriveFont(btnPorta1.getFont().getSize() - 20f));
		btnPorta1.setToolTipText("");
		btnPorta1.setBackground(Color.BLACK);
		btnPorta1.setIcon(new ImageIcon(Porta));
		btnPorta1.setBounds(65, 26, 75, 145);
		livello1.add(btnPorta1);

		btnPorta2 = new JButton("Porta2");
		btnPorta2.setBackground(Color.BLACK);
		btnPorta2.setIcon(new ImageIcon(Porta));
		btnPorta2.setFont(btnPorta2.getFont().deriveFont(btnPorta2.getFont().getSize() - 20f));
		btnPorta2.setToolTipText("");
		btnPorta2.setBounds(210, 26, 75, 145);
		livello1.add(btnPorta2);

		btnPorta3 = new JButton("Porta3");
		btnPorta3.setBackground(Color.BLACK);
		btnPorta3.setIcon(new ImageIcon(Porta));
		btnPorta3.setFont(btnPorta3.getFont().deriveFont(btnPorta3.getFont().getSize() - 20f));
		btnPorta3.setBounds(354, 26, 75, 145);
		livello1.add(btnPorta3);

		btnPorta4 = new JButton("Porta4");
		btnPorta4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnPorta4.setBackground(Color.BLACK);
		btnPorta4.setIcon(new ImageIcon(Porta));
		btnPorta4.setFont(btnPorta4.getFont().deriveFont(btnPorta4.getFont().getSize() - 20f));
		btnPorta4.setBounds(489, 26, 75, 145);
		livello1.add(btnPorta4);

		lblDescrizione = new JLabel("");
		lblDescrizione.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDescrizione.setForeground(Color.WHITE);
		lblDescrizione.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescrizione.setBounds(94, 205, 415, 30);
		livello1.add(lblDescrizione);

		btng1 = new JButton("g1");
		btng1.setBackground(Color.BLACK);
		btng1.setFont(btng1.getFont().deriveFont(btng1.getFont().getSize() - 26f));
		Image gemmaArancio = new ImageIcon(this.getClass().getResource("/gemma-arancio.png")).getImage();
		btng1.setIcon(new ImageIcon(gemmaArancio));
		btng1.setBounds(230, 114, 45, 45);
		btng1.setVisible(false);
		livello1.add(btng1);
		Image Esc = new ImageIcon(this.getClass().getResource("/ESC.png")).getImage();

		btng2 = new JButton("g2");
		btng2.setFont(btng2.getFont().deriveFont(btng2.getFont().getSize() - 20f));
		btng2.setBounds(504, 114, 45, 45);
		btng2.setVisible(false);
		Image btndiamante = new ImageIcon(this.getClass().getResource("/btndiamante.png")).getImage();
		btng2.setIcon(new ImageIcon(btndiamante));
		livello1.add(btng2);

		JLabel label = new JLabel("New label");
		label.setBounds(538, 318, -54, 3);
		livello1.add(label);

		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		Image porte = new ImageIcon(this.getClass().getResource("/4Porte.jpg")).getImage();
		lblNewLabel_3.setIcon(new ImageIcon(porte));
		lblNewLabel_3.setBounds(0, 0, 584, 332);
		livello1.add(lblNewLabel_3);

		btnX1 = new JButton("X");
		btnX1.setEnabled(false);
		btnX1.setBackground(new Color(245, 222, 179));
		btnX1.setFont(btnX1.getFont().deriveFont(btnX1.getFont().getSize() - 20f));
		btnX1.setBounds(543, 302, 41, 30);
		btnX1.setIcon(new ImageIcon(Esc));
		livello1.add(btnX1);

		livello2 = new JPanel();
		frame.getContentPane().add(livello2, "name_639847677300");
		livello2.setLayout(null);

		lblDescrizione1 = new JLabel("");
		lblDescrizione1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDescrizione1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescrizione1.setForeground(Color.WHITE);
		lblDescrizione1.setBounds(188, 236, 180, 30);
		livello2.add(lblDescrizione1);

		btnAvanti2 = new JButton("Avanti1");
		btnAvanti2.setBackground(new Color(245, 222, 179));
		btnAvanti2.setFont(btnAvanti2.getFont().deriveFont(btnAvanti2.getFont().getSize() - 20f));
		btnAvanti2.setIcon(new ImageIcon(occhio));
		btnAvanti2.setBounds(27, 202, 35, 35);
		livello2.add(btnAvanti2);

		btnNewButton_1 = new JButton("Destra1");
		btnNewButton_1.setBackground(new Color(245, 222, 179));
		btnNewButton_1.setFont(btnNewButton_1.getFont().deriveFont(btnNewButton_1.getFont().getSize() - 20f));
		btnNewButton_1.setBounds(66, 248, 35, 35);
		btnNewButton_1.setIcon(new ImageIcon(Destra));
		livello2.add(btnNewButton_1);

		btnNewButton_2 = new JButton("Sinistra1");
		btnNewButton_2.setBackground(new Color(245, 222, 179));
		btnNewButton_2.setFont(btnNewButton_2.getFont().deriveFont(btnNewButton_2.getFont().getSize() - 20f));
		btnNewButton_2.setBounds(27, 248, 35, 35);
		btnNewButton_2.setIcon(new ImageIcon(Sinistra));
		livello2.add(btnNewButton_2);

		comboBox2 = new JComboBox<String>();
		comboBox2.setBackground(new Color(245, 222, 179));
		comboBox2.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
		comboBox2.setMaximumRowCount(3);
		comboBox2.setBounds(381, 246, 180, 20);
		livello2.add(comboBox2);

		lblHP_1 = new JLabel("");
		lblHP_1.setBounds(188, 275, 160, 30);
		livello2.add(lblHP_1);

		btnPorta5 = new JButton("Porta5");
		btnPorta5.setFont(btnPorta5.getFont().deriveFont(btnPorta5.getFont().getSize() - 20f));
		btnPorta5.setIcon(new ImageIcon(portaThread));
		btnPorta5.setBounds(262, 70, 89, 157);
		btnPorta5.setVisible(true);
		livello2.add(btnPorta5);

		lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		Image corridoio = new ImageIcon(this.getClass().getResource("/1Porta.png")).getImage();
		lblNewLabel_5.setIcon(new ImageIcon(corridoio));
		lblNewLabel_5.setBounds(0, 0, 584, 332);
		livello2.add(lblNewLabel_5);

		livello3 = new JPanel();
		frame.getContentPane().add(livello3, "name_5834244412600");
		livello3.setLayout(null);

		btnSer2 = new JButton("Ser2");
		btnSer2.setIcon(new ImageIcon(sfondoser2));
		btnSer2.setFont(btnSer2.getFont().deriveFont(btnSer2.getFont().getSize() - 20f));
		btnSer2.setBounds(381, 56, 29, 29);
		livello3.add(btnSer2);

		btnSer1 = new JButton("Ser1");
		btnSer1.setIcon(new ImageIcon(sfondoser1));
		btnSer1.setFont(btnSer1.getFont().deriveFont(btnSer1.getFont().getSize() - 20f));
		btnSer1.setBounds(188, 56, 29, 29);
		livello3.add(btnSer1);

		btnPortaFine = new JButton("Porta6");
		btnPortaFine.setFont(btnPortaFine.getFont().deriveFont(btnPortaFine.getFont().getSize() - 20f));
		btnPortaFine.setBounds(269, 101, 57, 92);
		btnPortaFine.setIcon(new ImageIcon(portaFine));
		livello3.add(btnPortaFine);

		lblDescrizione22 = new JLabel("");
		lblDescrizione22.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescrizione22.setForeground(Color.WHITE);
		lblDescrizione22.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDescrizione22.setBounds(213, 192, 180, 30);
		livello3.add(lblDescrizione22);

		btnAvanti3 = new JButton("Avanti3");
		btnAvanti3.setBackground(new Color(245, 222, 179));
		btnAvanti3.setFont(btnAvanti3.getFont().deriveFont(btnAvanti3.getFont().getSize() - 20f));
		btnAvanti3.setBounds(27, 202, 35, 35);
		btnAvanti3.setIcon(new ImageIcon(occhio));
		livello3.add(btnAvanti3);

		btnDestra3 = new JButton("Destra3");
		btnDestra3.setBackground(new Color(245, 222, 179));
		btnDestra3.setFont(btnDestra3.getFont().deriveFont(btnDestra3.getFont().getSize() - 20f));
		btnDestra3.setBounds(66, 248, 35, 35);
		btnDestra3.setIcon(new ImageIcon(Destra));
		livello3.add(btnDestra3);

		btnSinistra3 = new JButton("Sinistra3");
		btnSinistra3.setBackground(new Color(245, 222, 179));
		btnSinistra3.setFont(btnSinistra3.getFont().deriveFont(btnSinistra3.getFont().getSize() - 20f));
		btnSinistra3.setBounds(27, 248, 35, 35);
		btnSinistra3.setIcon(new ImageIcon(Sinistra));
		livello3.add(btnSinistra3);

		comboBox3 = new JComboBox<String>();
		comboBox3.setMaximumRowCount(3);
		comboBox3.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
		comboBox3.setBackground(new Color(245, 222, 179));
		comboBox3.setBounds(381, 246, 180, 20);
		livello3.add(comboBox3);
		comboBox3.addItem("-- Inventario --");

		lblHP_3 = new JLabel("");
		lblHP_3.setBounds(188, 275, 160, 30);
		livello3.add(lblHP_3);

		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		Image finaleSfondo = new ImageIcon(this.getClass().getResource("/finale.jpg")).getImage();
		lblNewLabel_7.setIcon(new ImageIcon(finaleSfondo));
		lblNewLabel_7.setBounds(0, 0, 584, 332);
		livello3.add(lblNewLabel_7);

		perdita = new JPanel();
		frame.getContentPane().add(perdita, "name_5861860129200");
		perdita.setLayout(null);

		lblPerdita = new JLabel("HAI PERSO");
		lblPerdita.setForeground(Color.WHITE);
		lblPerdita.setFont(new Font("Tahoma", Font.PLAIN, 46));
		lblPerdita.setHorizontalAlignment(SwingConstants.CENTER);
		lblPerdita.setBounds(58, 9, 443, 120);
		perdita.add(lblPerdita);
		
		lblPerdita_1 = new JLabel("HAI PERSO");
		lblPerdita_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPerdita_1.setForeground(Color.BLACK);
		lblPerdita_1.setFont(new Font("Tahoma", Font.PLAIN, 46));
		lblPerdita_1.setBounds(61, 11, 443, 120);
		perdita.add(lblPerdita_1);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		Image persoSfondo = new ImageIcon(this.getClass().getResource("/perso.jpg")).getImage();
		lblNewLabel_8.setIcon(new ImageIcon(persoSfondo));
		lblNewLabel_8.setBounds(0, 0, 584, 332);
		perdita.add(lblNewLabel_8);

		vittoria = new JPanel();
		frame.getContentPane().add(vittoria, "name_5894649645300");
		vittoria.setLayout(null);
		
		lblNewLabel_10 = new JLabel("HAI VINTO");
		lblNewLabel_10.setForeground(Color.WHITE);
		lblNewLabel_10.setBackground(Color.WHITE);
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 46));
		lblNewLabel_10.setBounds(73, -11, 428, 166);
		vittoria.add(lblNewLabel_10);

		lblNewLabel_2 = new JLabel("HAI VINTO");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 46));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(75, -9, 428, 166);
		vittoria.add(lblNewLabel_2);
		
		lblNewLabel_9 = new JLabel("");
		Image vintoSfondo = new ImageIcon(this.getClass().getResource("/vinto.jpg")).getImage();
		lblNewLabel_9.setIcon(new ImageIcon(vintoSfondo));
		lblNewLabel_9.setBounds(0, 0, 584, 332);
		vittoria.add(lblNewLabel_9);

		livello2_1 = new JPanel();
		frame.getContentPane().add(livello2_1, "name_4607128887900");
		livello2_1.setLayout(null);

		btnSinistra2_1 = new JButton("Sinistra2_1");
		btnSinistra2_1.setBackground(new Color(245, 222, 179));
		btnSinistra2_1.setFont(btnSinistra2_1.getFont().deriveFont(btnSinistra2_1.getFont().getSize() - 15f));
		btnSinistra2_1.setBounds(27, 248, 35, 35);
		btnSinistra2_1.setIcon(new ImageIcon(Sinistra));
		livello2_1.add(btnSinistra2_1);

		btnAvanti2_1 = new JButton("Avanti2_1");
		btnAvanti2_1.setBackground(new Color(245, 222, 179));
		btnAvanti2_1.setFont(btnAvanti2_1.getFont().deriveFont(btnAvanti2_1.getFont().getSize() - 20f));
		btnAvanti2_1.setIcon(new ImageIcon(occhio));
		btnAvanti2_1.setBounds(27, 202, 35, 35);
		livello2_1.add(btnAvanti2_1);

		btnDestra2_1 = new JButton("Destra2_1");
		btnDestra2_1.setBackground(new Color(245, 222, 179));
		btnDestra2_1.setFont(btnDestra2_1.getFont().deriveFont(btnDestra2_1.getFont().getSize() - 20f));
		btnDestra2_1.setIcon(new ImageIcon(Destra));
		btnDestra2_1.setBounds(66, 248, 35, 35);
		livello2_1.add(btnDestra2_1);

		lblHP2_1 = new JLabel("");
		lblHP2_1.setBounds(188, 275, 160, 30);
		livello2_1.add(lblHP2_1);

		comboBox2_1 = new JComboBox<String>();
		comboBox2_1.setMaximumRowCount(3);
		comboBox2_1.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
		comboBox2_1.setBackground(new Color(245, 222, 179));
		comboBox2_1.setBounds(381, 246, 180, 20);
		livello2_1.add(comboBox2_1);

		lblDescrizione2_1 = new JLabel("");
		lblDescrizione2_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDescrizione2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescrizione2_1.setForeground(Color.WHITE);
		lblDescrizione2_1.setBounds(123, 125, 247, 30);
		livello2_1.add(lblDescrizione2_1);

		btnLeva1 = new JButton("Leva");
		btnLeva1.setFont(btnLeva1.getFont().deriveFont(btnLeva1.getFont().getSize() - 15f));
		btnLeva1.setBounds(244, 72, 23, 58);
		Image leva = new ImageIcon(this.getClass().getResource("/btnLeva.png")).getImage();
		btnLeva1.setIcon(new ImageIcon(leva));
		livello2_1.add(btnLeva1);

		lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		// lblNewLabel_6.setIcon());
		lblNewLabel_6.setBounds(0, 0, 584, 332);
		livello2_1.add(lblNewLabel_6);
		comboBox2.addItem("-- Inventario --");
		comboBox2_1.addItem("-- Inventario --");
	}

	public void registraController(Controller controller) { // passa tutti i bottoni al controller
		btnStart.addActionListener(controller);
		btnAvanti1.addActionListener(controller);
		// btnIndietro1.addActionListener(controller);
		btnDestra1.addActionListener(controller);
		btnSinistra1.addActionListener(controller);
		btnPorta1.addActionListener(controller);
		btnPorta2.addActionListener(controller);
		btnPorta3.addActionListener(controller);
		btnPorta4.addActionListener(controller);
		btng1.addActionListener(controller);
		btnX1.addActionListener(controller);
		btnPorta5.addActionListener(controller);
		btnLeva1.addActionListener(controller);
		btnNewButton_1.addActionListener(controller);
		btnNewButton_2.addActionListener(controller);
		btnDestra2_1.addActionListener(controller);
		btnSinistra2_1.addActionListener(controller);
		btnAvanti2.addActionListener(controller);
		btnAvanti2_1.addActionListener(controller);
		btng2.addActionListener(controller);
		btnAvanti3.addActionListener(controller);
		btnDestra3.addActionListener(controller);
		btnSinistra3.addActionListener(controller);
		btnPortaFine.addActionListener(controller);
		btnSer1.addActionListener(controller);
		btnSer2.addActionListener(controller);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		frame.setVisible(b);
	}

	public void descr(String messaggio, int lvl) { // cambia la lblDescrizione
		if ((lvl == 2) || (lvl == 4)) {
			lblDescrizione.setText(messaggio);
		}
		if (lvl == 3) {
			lblDescrizione1.setText(messaggio);
			lblDescrizione2_1.setText(messaggio);
		}
		if (lvl == 5) {
			lblDescrizione22.setText(messaggio);
		}
	}

	public void addInventory(String oggetto, int lvl) { // aggiunge un elemento all'inventario
		if ((lvl == 2) || (lvl == 4))
			comboBox.addItem(oggetto);
		comboBox2.addItem(oggetto);
		comboBox2_1.addItem(oggetto);
		comboBox3.addItem(oggetto);
	}

	public void Hidebtn(int lvl) { // nasconde un determinato bottone
		if (lvl == 2) {
			btnPorta2.setVisible(false);
		}
		if (lvl == 3) {
			//btnPorta5.setVisible(false);
			btnLeva1.setVisible(false);
		}
		if (lvl == 4) {
			btnPorta4.setVisible(false);
		}

	}

	public void ShowItem(int lvl) { // mostra un determinato bottone
		if (lvl == 2)
			btng1.setVisible(true);
		if (lvl == 3)
			//btnPorta5.setVisible(true);
			btnLeva1.setVisible(true);
		if (lvl == 4) {
			btng2.setVisible(true);
		}
	}

	public void TakeItem(int lvl, String oggetto) { // raccogli bottoni-oggetti
		if (lvl == 2)
			btng1.setVisible(false);
		if (lvl == 4)
			btng2.setVisible(false);
			comboBox.addItem(oggetto);
	}

	public void start(int lvl) { // inizializzazione vari livelli
		if (lvl == 2) {
			start.setVisible(false);
			livello1.setVisible(true);
			comboBox.addItem("ciao");
			comboBox.removeItem("ciao");
		}
		if (lvl == 3) {
			livello1.setVisible(false);
			livello2.setVisible(true);
			comboBox2.addItem("ciao");
			comboBox2.removeItem("ciao");
		}

		if (lvl == 4) {
			start.setVisible(false);
			livello2.setVisible(false);
			btng1.setVisible(false);
			btng2.setVisible(false);
			livello2_1.setVisible(false);
			livello1.setVisible(true);
			btnPorta1.setVisible(false);
			btnPorta2.setVisible(false);
			btnPorta3.setVisible(false);
			btnPorta4.setVisible(false);
			lblDescrizione.setText("");
			Image paretesx = new ImageIcon(this.getClass().getResource("/Altarinosx.png")).getImage();
			lblNewLabel_3.setIcon(new ImageIcon(paretesx));
			comboBox.addItem("ciao");
			comboBox.removeItem("ciao");
		}
		if (lvl == 5) {
			livello2.setVisible(false);
			livello1.setVisible(false);
			livello2_1.setVisible(false);
			vittoria.setVisible(false);
			livello3.setVisible(true);
			comboBox3.addItem("ciao");
			comboBox3.removeItem("ciao");
		}
		if (lvl == 0) {
			livello3.setVisible(false);
			livello2.setVisible(false);
			livello1.setVisible(false);
			livello2_1.setVisible(false);
			perdita.setVisible(true);
		}
		if (lvl == 6) {
			livello3.setVisible(false);
			livello2.setVisible(false);
			livello1.setVisible(false);
			livello2_1.setVisible(false);
			vittoria.setVisible(true);
		}
	}

	public void pareti(int lvl, int direzione, boolean aperto) {
		if (lvl == 2) {
			if (direzione == -1) {
				Image paretesx = new ImageIcon(this.getClass().getResource("/Altarinosx.png")).getImage();
				lblNewLabel_3.setIcon(new ImageIcon(paretesx));
				btng1.setVisible(false);
				btnPorta1.setVisible(false);
				btnPorta2.setVisible(false);
				btnPorta3.setVisible(false);
				btnPorta4.setVisible(false);
			}
			if (direzione == 0 && !aperto) {
				Image Porte = new ImageIcon(this.getClass().getResource("/4Porte.jpg")).getImage();
				lblNewLabel_3.setIcon(new ImageIcon(Porte));
				btnPorta1.setVisible(true);
				btnPorta2.setVisible(true);
				btnPorta3.setVisible(true);
				btnPorta4.setVisible(true);
				btng1.setVisible(false);
			}
			if (direzione == 0 && aperto) {
				Image Porte = new ImageIcon(this.getClass().getResource("/4Porte.jpg")).getImage();
				lblNewLabel_3.setIcon(new ImageIcon(Porte));
				btnPorta1.setVisible(true);
				btnPorta2.setVisible(false);
				btnPorta3.setVisible(true);
				btnPorta4.setVisible(true);
				btng1.setVisible(true);
			}
			if (direzione == 1) {
				Image paretedx = new ImageIcon(this.getClass().getResource("/Altarinodx.png")).getImage();
				lblNewLabel_3.setIcon(new ImageIcon(paretedx));
				btng1.setVisible(false);
				btnPorta1.setVisible(false);
				btnPorta2.setVisible(false);
				btnPorta3.setVisible(false);
				btnPorta4.setVisible(false);
			}
		}
		if (lvl == 3) {
			if (direzione == -1) {
				Image paretedx = new ImageIcon(this.getClass().getResource("/sfondoLevasx.jpg")).getImage();
				lblNewLabel_6.setIcon(new ImageIcon(paretedx));
				livello2.setVisible(false);
				livello2_1.setVisible(true);
				btnLeva1.setVisible(false);
			}
			if (direzione == 0) {
				livello2_1.setVisible(false);
				livello2.setVisible(true);
			}
			if (direzione == 1) {
				Image paretedx = new ImageIcon(this.getClass().getResource("/sfondoLevadx.jpg")).getImage();
				lblNewLabel_6.setIcon(new ImageIcon(paretedx));
				livello2.setVisible(false);
				livello2_1.setVisible(true);
				btnLeva1.setVisible(true);
			}
		}
		if (lvl == 4) {
			if (direzione == 0) {
				Image paretesx = new ImageIcon(this.getClass().getResource("/Altarinosx.png")).getImage();
				lblNewLabel_3.setIcon(new ImageIcon(paretesx));
				btng1.setVisible(false);
				btnPorta1.setVisible(false);
				btnPorta2.setVisible(false);
				btnPorta3.setVisible(false);
				btnPorta4.setVisible(false);
				btng2.setVisible(false);
			}
			if (direzione == -1 && !aperto) {
				Image Porte = new ImageIcon(this.getClass().getResource("/4Porte.jpg")).getImage();
				lblNewLabel_3.setIcon(new ImageIcon(Porte));
				btnPorta1.setVisible(true);
				btnPorta2.setVisible(true);
				btnPorta3.setVisible(true);
				btnPorta4.setVisible(true);
				btng1.setVisible(false);
				btng2.setVisible(false);
			}
			if (direzione == -1 && aperto) {
				Image Porte = new ImageIcon(this.getClass().getResource("/4Porte.jpg")).getImage();
				lblNewLabel_3.setIcon(new ImageIcon(Porte));
				btnPorta1.setVisible(true);
				btnPorta2.setVisible(true);
				btnPorta3.setVisible(true);
				btnPorta4.setVisible(false);
				btng1.setVisible(false);
				btng2.setVisible(true);
			}
			if (direzione == 1) {
				Image paretedx = new ImageIcon(this.getClass().getResource("/Altarinodx.png")).getImage();
				lblNewLabel_3.setIcon(new ImageIcon(paretedx));
				btng1.setVisible(false);
				btnPorta1.setVisible(false);
				btnPorta2.setVisible(false);
				btnPorta3.setVisible(false);
				btnPorta4.setVisible(false);
				btng2.setVisible(false);
			}
		}
	}

	public void Quit(int lvl) { // in caso di pressione tasto ESC
		if (lvl == 2) {
			livello1.setVisible(false);
			start.setVisible(true);
		}
		if (lvl == 3) {
			livello2.setVisible(false);
			start.setVisible(true);
		}
	}

	public void changeHp(int hp) { // cambia la stat hp
		if (hp == 4) {
			lblHP.setIcon(new ImageIcon(fourheart));
			lblHP_1.setIcon(new ImageIcon(fourheart));
			lblHP2_1.setIcon(new ImageIcon(fourheart));
			lblHP_3.setIcon(new ImageIcon(fourheart));
		}
		if (hp == 3) {
			lblHP.setIcon(new ImageIcon(threeheart));
			lblHP_1.setIcon(new ImageIcon(threeheart));
			lblHP2_1.setIcon(new ImageIcon(threeheart));
			lblHP_3.setIcon(new ImageIcon(threeheart));
		}
		if (hp == 2) {
			lblHP.setIcon(new ImageIcon(twoheart));
			lblHP_1.setIcon(new ImageIcon(twoheart));
			lblHP2_1.setIcon(new ImageIcon(twoheart));
			lblHP_3.setIcon(new ImageIcon(twoheart));
		}
		if (hp == 1) {
			lblHP.setIcon(new ImageIcon(oneheart));
			lblHP_1.setIcon(new ImageIcon(oneheart));
			lblHP2_1.setIcon(new ImageIcon(twoheart));
			lblHP_3.setIcon(new ImageIcon(oneheart));
		}
	}

	public void apriChiudi(int stato) { // funzione personale per il thread lvl2
		if (stato == 0)
			btnPorta5.setIcon(new ImageIcon(stato0));
		if (stato == 1)
			btnPorta5.setIcon(new ImageIcon(stato1));
		if (stato == 2)
			btnPorta5.setIcon(new ImageIcon(stato2));
		if (stato == 3)
			btnPorta5.setIcon(new ImageIcon(portaThread));
	}

	public boolean isSelezionato(String oggetto) {
		boolean selezionato = false;
		if (comboBox3.getSelectedItem().equals(oggetto))
			selezionato = true;
		return selezionato;
	}

	public void ser1(int gemmePiazzate) {
		System.out.println("sono in ser1()");
		if (comboBox3.getItemAt(1).equalsIgnoreCase("Gemma preziosa")) {
			btnSer1.setIcon(new ImageIcon(ser1));
			comboBox3.removeItemAt(1);

			if (gemmePiazzate == 0)
				btnPortaFine.setIcon(new ImageIcon(portaFine2));
			if (gemmePiazzate == 1)
				btnPortaFine.setIcon(new ImageIcon(portaFine0));
		}
	}

	public boolean ser2(int gemmePiazzate) {
		boolean piazzato = false;
		System.out.println("sono in ser2()");
		System.out.println(comboBox3.getSelectedIndex());
		if (gemmePiazzate == 1) {
			if (comboBox3.getSelectedIndex() == 1) {
				System.out.println("Entrato");
				btnSer2.setIcon(new ImageIcon(ser2));
				comboBox3.removeItemAt(1);
				btnPortaFine.setIcon(new ImageIcon(portaFine0));
				piazzato = true;
			}
		}
		if (gemmePiazzate == 0) {
			if (comboBox3.getSelectedIndex() == 2) {
				btnSer2.setIcon(new ImageIcon(ser2));
				comboBox3.setSelectedIndex(0);
				comboBox3.removeItemAt(2);
				btnPortaFine.setIcon(new ImageIcon(portaFine2));
				piazzato = true;
			}
		}
		return piazzato;
	}
}