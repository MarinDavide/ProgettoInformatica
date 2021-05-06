import Controller.Controller;
import view.Gioco;

public class Main {
	public static void main(String[] args) {
	Gioco g = new Gioco();
	Controller c = new Controller(g);
	// Rendo visibile la view
	g.setVisible(true);
	}
}
