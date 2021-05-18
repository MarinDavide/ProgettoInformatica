import java.net.URISyntaxException;

import Controller.Controller;
import Model.Livelli;
import thread.Thread_porte;
import view.Gioco;

public class Main{
	public static void main(String[] args) throws URISyntaxException {
	Gioco g = new Gioco();
	Livelli l = new Livelli();
	Thread_porte p = new Thread_porte(g, l);
	Controller c = new Controller(g, l, p);
	// Rendo visibile la view
	g.setVisible(true);
	}
}
