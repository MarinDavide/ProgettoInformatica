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

	public Controller(Gioco g, Livelli l) {
		this.g = g;		//passo la vista
		this.l = l;		//passo il model
		g.registraController(this);
	}
	
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getActionCommand().equalsIgnoreCase("X")){	//pressione tasto ESC
			g.Quit(l.getStanza());
		}
		if(arg0.getActionCommand().equalsIgnoreCase("Entra")){ //pressione tasto start
			g.start(l.entraPremuto());
		}
		if(l.getStanza()==2) {
			g.ShowItem(l.getStanza()); //fa comparire la gemma dopo il resto per evitare bug visivi
			if(arg0.getActionCommand().equalsIgnoreCase("Destra") || arg0.getActionCommand().equalsIgnoreCase("Sinistra")){
				g.descr("Solo un muro");
			}
			if(arg0.getActionCommand().equalsIgnoreCase("Indietro")) {
				g.descr("Non avrebbe senso tornare fuori...");
			}
			if(arg0.getActionCommand().equalsIgnoreCase("Porta1") || arg0.getActionCommand().equalsIgnoreCase("Porta3") || arg0.getActionCommand().equalsIgnoreCase("Porta4")){
				//g.descr("Sei un Fallito");
				hp=l.togliVita();	//chiama la funzione del model
				if(hp==0) {
					g.start(hp);	//chiama il pannello della morte
				}
				g.changeHp(hp);		//cambia lo stat hp nella view
			}
			if(arg0.getActionCommand().equalsIgnoreCase("Avanti")){
				g.descr("Quattro porte...");
			}
			if(arg0.getActionCommand().equalsIgnoreCase("Porta2")){
				//g.descr("u win");
				g.Hidebtn(l.getStanza());
			}
			if(arg0.getActionCommand().equalsIgnoreCase("g1")){	//azioni dopo aver raccolto la gemma
				g.TakeItem(l.getStanza(), "Gemma preziosa");
				g.descr("hai raccolto 'Gemma Preziosa'");
				l.gemmaPresa();
			}
			if(l.getStanza()==3) {	//entra nel livello 3
				g.start(l.getStanza());
				g.addInventory("Gemma preziosa");	//riaggiunge gli elementi raccolti nel livello precedente
				g.changeHp(l.getHp());
				
				if(arg0.getActionCommand().equalsIgnoreCase("Leva")) {
					//t.eseguiThread;
				}
			}
		}
	}
}
