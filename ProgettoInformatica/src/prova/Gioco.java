package prova;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Gioco {

	private JFrame frame;
	private Panel panel; 
	private Panel panel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gioco window = new Gioco();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Gioco() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		Panel panel = new Panel();
		frame.getContentPane().add(panel, "name_3536606897900");
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Start");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel.setVisible(false);
				panel_1.setVisible(true);
			}
		});
		btnNewButton.setBounds(173, 210, 89, 23);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Avventura grafica");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(173, 23, 102, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Descrizione del programma ");
		lblNewLabel_1.setBounds(10, 179, 414, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Foto");
		lblNewLabel_2.setBounds(203, 106, 46, 14);
		panel.add(lblNewLabel_2);
		
		panel_1 = new Panel();
		frame.getContentPane().add(panel_1, "name_3582719394500");
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Start");
		lblNewLabel_3.setBounds(201, 22, 46, 14);
		panel_1.add(lblNewLabel_3);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setMaximumRowCount(2);
		comboBox.setBounds(244, 217, 180, 20);
		panel_1.add(comboBox);
		comboBox.addItem("PietraRunica (raccoglibile)");
		comboBox.addItem("Cartello (non raccoglibile)");		
		
		JLabel lblNewLabel_4 = new JLabel("Inventario");
		lblNewLabel_4.setBounds(311, 192, 67, 14);
		panel_1.add(lblNewLabel_4);
		
		JButton btnNewButton_1 = new JButton("Avanti");
		btnNewButton_1.setBounds(23, 77, 89, 23);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Sinistra");
		btnNewButton_2.setBounds(23, 111, 89, 23);
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Destra");
		btnNewButton_3.setBounds(23, 145, 89, 23);
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Indietro");
		btnNewButton_4.setBounds(23, 179, 89, 23);
		panel_1.add(btnNewButton_4);
		
		JLabel lblNewLabel_5 = new JLabel("Foto");
		lblNewLabel_5.setBounds(201, 129, 46, 14);
		panel_1.add(lblNewLabel_5);
	}
}
