import Controller.Controller;
import Model.Livelli;
import view.Gioco;

public class Main {
	public static void main(String[] args) {
	Gioco g = new Gioco();
	Livelli l = new Livelli();
	Controller c = new Controller(g, l);
	// Rendo visibile la view
	g.setVisible(true);
	}
}
