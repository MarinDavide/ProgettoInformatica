package Controller;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.Gioco;

public class Controller implements ActionListener{
	private Gioco g;
	
	/**
	 * Al controller va sempre passato il modello e la vista
	 * OBBLIGATORIO!
	 */
	public Controller(Gioco g) {
		this.g = g;
		// Registro il controller nella vista
		g.registraController(this);
	}
	int stanza=1;
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getActionCommand().equalsIgnoreCase("X")){
			g.Quit(stanza);
			stanza = 1;
		}
		if(arg0.getActionCommand().equalsIgnoreCase("Entra")){
			stanza++;
			g.start(stanza);
		}
		if(stanza==2) {
			g.ShowItem(stanza);
			if(arg0.getActionCommand().equalsIgnoreCase("Destra") || arg0.getActionCommand().equalsIgnoreCase("Sinistra")){
				g.descr("Solo un muro");
			}
			if(arg0.getActionCommand().equalsIgnoreCase("Indietro")) {
				g.descr("Non avrebbe senso tornare fuori...");
			}
			if(arg0.getActionCommand().equalsIgnoreCase("Porta1") || arg0.getActionCommand().equalsIgnoreCase("Porta3") || arg0.getActionCommand().equalsIgnoreCase("Porta4")){
				g.descr("Sei un Fallito");
			}
			if(arg0.getActionCommand().equalsIgnoreCase("Avanti")){
				g.descr("Quattro porte...");
			}
			if(arg0.getActionCommand().equalsIgnoreCase("Porta2")){
				g.descr("u win");
				g.OpenDoor(stanza);
				
			}
			if(arg0.getActionCommand().equalsIgnoreCase("g1")){
				g.TakeItem(stanza, "Gemma preziosa");
				g.descr("hai raccolto 'Gemma Preziosa'");
				stanza++;
			}
		if(stanza==3) {
			g.start(stanza);
			g.addInventory("Gemma preziosa");
		}
		}
	}
}
