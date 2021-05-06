package Controller;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model.Livelli;
import view.Gioco;

public class Controller implements ActionListener{
	private Gioco g;
	private Livelli l;
	int hp;
	//int dovesono=0;
	/**
	 * Al controller va sempre passato il modello e la vista
	 * OBBLIGATORIO!
	 */
	public Controller(Gioco g, Livelli l) {
		this.g = g;
		this.l = l;
		// Registro il controller nella vista
		g.registraController(this);
	}
	
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getActionCommand().equalsIgnoreCase("X")){
			g.Quit(l.getStanza());
		}
		if(arg0.getActionCommand().equalsIgnoreCase("Entra")){
			g.start(l.entraPremuto());
		}
		if(l.getStanza()==2) {
			g.ShowItem(l.getStanza());
			if(arg0.getActionCommand().equalsIgnoreCase("Destra") || arg0.getActionCommand().equalsIgnoreCase("Sinistra")){
				g.descr("Solo un muro");
			}
			if(arg0.getActionCommand().equalsIgnoreCase("Indietro")) {
				g.descr("Non avrebbe senso tornare fuori...");
			}
			if(arg0.getActionCommand().equalsIgnoreCase("Porta1") || arg0.getActionCommand().equalsIgnoreCase("Porta3") || arg0.getActionCommand().equalsIgnoreCase("Porta4")){
				g.descr("Sei un Fallito");
				hp=l.togliVita();
				if(hp==0) {
					g.start(hp);
				}
				g.changeHp(hp);
			}
			if(arg0.getActionCommand().equalsIgnoreCase("Avanti")){
				g.descr("Quattro porte...");
			}
			if(arg0.getActionCommand().equalsIgnoreCase("Porta2")){
				g.descr("u win");
				g.OpenDoor(l.getStanza());
			}
			if(arg0.getActionCommand().equalsIgnoreCase("g1")){
				g.TakeItem(l.getStanza(), "Gemma preziosa");
				g.descr("hai raccolto 'Gemma Preziosa'");
				l.gemmaPresa();
			}
		if(l.getStanza()==3) {
			g.start(l.getStanza());
			g.addInventory("Gemma preziosa");
		}
		}
	}
}
