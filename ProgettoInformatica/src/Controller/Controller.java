package Controller;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model.Livelli;
import view.Gioco;
import thread.Thread_porte;

public class Controller implements ActionListener {
	private Gioco g;
	private Livelli l;
	private Thread_porte p;
	int hp;
	int retard = 0;
	// int dovesono=0;

	public Controller(Gioco g, Livelli l, Thread_porte p) {
		this.g = g; // passo la vista
		this.l = l; // passo il model
		this.p = p; // passo il thread
		g.registraController(this);
	}

	// Thread_porte p = new Thread_porte();
	Thread t = new Thread(p);

	public void actionPerformed(ActionEvent arg0) {
		System.out.println("ho premuto " + arg0.getActionCommand());
		if (arg0.getActionCommand().equalsIgnoreCase("X")) { // pressione tasto ESC
			g.Quit(l.getStanza());
		}
		if (arg0.getActionCommand().equalsIgnoreCase("Entra")) { // pressione tasto start
			g.start(l.entraPremuto());
			l.setAperto(false);
		}
		if (l.getStanza() == 2) {
			if (arg0.getActionCommand().equalsIgnoreCase("Destra")) {
				if (l.getDirezione() == +1)
					g.descr("Non ha senso tornare fuori", l.getStanza());
				else {
					// g.descr("Solo un muro");
					g.descr("", l.getStanza());
					l.Destra();
					g.pareti(l.getStanza(), l.getDirezione(), l.getAperto());
				}
			}
			if (arg0.getActionCommand().equalsIgnoreCase("Sinistra")) {
				if (l.getDirezione() == -1)
					g.descr("Non ha senso tornare fuori", l.getStanza());
				else {
					// g.descr("Solo un muro");
					g.descr("", l.getStanza());
					l.Sinistra();
					g.pareti(l.getStanza(), l.getDirezione(), l.getAperto());
				}
			}
			if (arg0.getActionCommand().equalsIgnoreCase("Avanti")) {
				if (l.getDirezione() == -1) {
					g.descr("Bello, ma non sembra che io possa fare molto qui", l.getStanza());
				}
				if (l.getDirezione() == 0) {
					retard++;
					if (retard < 3)
						g.descr("Quattro porte...", l.getStanza());
					if (retard >= 3)
						g.descr("Devi indovinare la porta giusta...", l.getStanza());
				}
				if (l.getDirezione() == 1) {
					g.descr("Bello, ma non sembra che io possa fare molto qui", l.getStanza());
				}
				// g.descr("Quattro porte...");
			}
			if (arg0.getActionCommand().equalsIgnoreCase("Porta1") || arg0.getActionCommand().equalsIgnoreCase("Porta3")
					|| arg0.getActionCommand().equalsIgnoreCase("Porta4")) {
				// g.descr("Sei un Fallito");
				hp = l.togliVita(); // chiama la funzione del model
				if (hp == 0) {
					g.start(hp); // chiama il pannello della morte
				}
				g.changeHp(hp); // cambia lo stat hp nella view
			}
			if (arg0.getActionCommand().equalsIgnoreCase("Porta2")) {
				// g.descr("u win");
				g.Hidebtn(l.getStanza());
				g.ShowItem(l.getStanza());
				l.setAperto(true);
			}
			if (arg0.getActionCommand().equalsIgnoreCase("g1")) { // azioni dopo aver raccolto la gemma
				g.TakeItem(l.getStanza(), "Gemma preziosa");
				g.descr("hai raccolto 'Gemma Preziosa'", l.getStanza());
				l.gemmaPresa();
				g.start(l.getStanza());
				l.setAperto(false);
				g.addInventory("Gemma preziosa", l.getStanza()); // riaggiunge gli elementi raccolti nel livello precedente
				g.changeHp(l.getHp());
			}
		}
		if (l.getStanza() == 3) { // entra nel livello 3
			if (arg0.getActionCommand().equalsIgnoreCase("Porta5")) {
				if (!l.getAperto())
					g.descr("Chiusa", l.getStanza());
				if (l.getAperto()) {
					g.start(l.entratoPortaThread());
					l.setAperto(false);
				}
			}
			if ((arg0.getActionCommand().equalsIgnoreCase("Destra1"))
					|| (arg0.getActionCommand().equalsIgnoreCase("Destra2_1"))) {
				if (l.getDirezione() == +1)
					g.descr("Non ha senso tornare indietro", l.getStanza());
				else {
					// g.descr("Solo un muro");
					g.descr("", l.getStanza());
					l.Destra();
					g.pareti(l.getStanza(), l.getDirezione(), l.getAperto());
				}
			}
			if ((arg0.getActionCommand().equalsIgnoreCase("Sinistra1"))
					|| (arg0.getActionCommand().equalsIgnoreCase("Sinistra2_1"))) {
				if (l.getDirezione() == -1)
					g.descr("Non ha senso tornare indietro", l.getStanza());
				else {
					// g.descr("Solo un muro");
					g.descr("", l.getStanza());
					l.Sinistra();
					g.pareti(l.getStanza(), l.getDirezione(), l.getAperto());
				}
			}
			if ((arg0.getActionCommand().equalsIgnoreCase("Avanti1"))
					|| (arg0.getActionCommand().equalsIgnoreCase("Avanti2_1"))) {
				if (l.getDirezione() == 0)
					g.descr("Una porta", l.getStanza());
				if (l.getDirezione() == -1)
					g.descr("Non vedo nulla", l.getStanza());
				if (l.getDirezione() == 1)
					g.descr("Sembra una leva...", l.getStanza());
			}
			if (arg0.getActionCommand().equalsIgnoreCase("Leva")) {
				Thread_porte pp = new Thread_porte(g, l);
				Thread t = new Thread(pp);
				t.start();
				g.descr("Sembra che una porta si sia aperta", l.getStanza());
			}
		}

		if (l.getStanza() == 4) {
			if (arg0.getActionCommand().equalsIgnoreCase("Destra")) {
				if (l.getDirezione() == +1)
					g.descr("Non ha senso tornare fuori", l.getStanza());
				else {
					// g.descr("Solo un muro");
					g.descr("", l.getStanza());
					l.Destra();
					g.pareti(l.getStanza(), l.getDirezione(), l.getAperto());
				}
			}
			if (arg0.getActionCommand().equalsIgnoreCase("Sinistra")) {
				if (l.getDirezione() == -1)
					g.descr("Non ha senso tornare fuori", l.getStanza());
				else {
					// g.descr("Solo un muro");
					g.descr("", l.getStanza());
					l.Sinistra();
					g.pareti(l.getStanza(), l.getDirezione(), l.getAperto());
				}
			}
			if (arg0.getActionCommand().equalsIgnoreCase("Avanti")) {
				if (l.getDirezione() == 0) {
					g.descr("Bello, ma non sembra che io possa fare molto qui", l.getStanza());
				}
				if (l.getDirezione() == -1) {
					retard++;
					if (retard < 3)
						g.descr("Quattro porte...", l.getStanza());
					if (retard >= 3)
						g.descr("Devi indovinare la porta giusta...", l.getStanza());
				}
				if (l.getDirezione() == 1) {
					g.descr("Bello, ma non sembra che io possa fare molto qui", l.getStanza());
				}
				// g.descr("Quattro porte...");
			}
			if (arg0.getActionCommand().equalsIgnoreCase("Porta4")) {
				// g.descr("u win");
				g.Hidebtn(l.getStanza());
				g.ShowItem(l.getStanza());
				l.setAperto(true);
			}
			if ((arg0.getActionCommand().equalsIgnoreCase("Porta1"))
					|| (arg0.getActionCommand().equalsIgnoreCase("Porta2"))
					|| (arg0.getActionCommand().equalsIgnoreCase("Porta3"))) {
				l.togliVita();
				g.changeHp(l.getHp());
			}
			if (arg0.getActionCommand().equalsIgnoreCase("g2")) {
				// g.descr("u win");
				g.TakeItem(l.getStanza(), "Diamante");
				l.gemmaDuePresa();
				g.addInventory("Diamante", l.getStanza());
				g.start(l.getStanza());
				l.setAperto(false);
			}
		}

		if (l.getStanza() == 5) {
			
			if (arg0.getActionCommand().equalsIgnoreCase("Destra3")) {
				g.descr("..Nulla", l.getStanza());
			}
			if (arg0.getActionCommand().equalsIgnoreCase("Sinistra3")) {
				g.descr("Nulla", l.getStanza());
			}
			if (arg0.getActionCommand().equalsIgnoreCase("Avanti3")) {
				g.descr("Bello", l.getStanza());
			}

			if (arg0.getActionCommand().equalsIgnoreCase("Ser1")) {
				if (g.isSelezionato("Gemma preziosa")) {
					g.ser1(l.getGemmePiazzate());
					l.serPremuta();
					if (l.getGemmePiazzate() == 2)
						l.setAperto(true);
				}
				if (g.isSelezionato("Diamante")) g.descr("non combacia...", l.getStanza());
				else g.descr("sembra che ci possa inserire qualcosa...", l.getStanza());
			}
			if (arg0.getActionCommand().equalsIgnoreCase("Ser2")) {
				if (g.isSelezionato("Diamante")) {
					if( g.ser2(l.getGemmePiazzate()) ) l.serPremuta();
					if (l.getGemmePiazzate() == 2)
						l.setAperto(true);
				}
				if (g.isSelezionato("Gemma preziosa")) g.descr("non combacia...", l.getStanza());
				else g.descr("sembra che ci possa inserire qualcosa...", l.getStanza());
			}

			if (arg0.getActionCommand().equalsIgnoreCase("Porta6")) {
				if (!l.getAperto()) {
					if(l.getGemmePiazzate()==0)	g.descr("Chiusa", l.getStanza());
					if(l.getGemmePiazzate()==1) g.descr("Non riesco ancora a passare", l.getStanza());
				}
				if (l.getAperto()) {
					g.start(l.entratoPortaFinale());
				}
			}
		}
	}
}
