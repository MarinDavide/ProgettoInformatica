package Model;
import view.Gioco;

public class Livelli {
	private Gioco g;
	private int stanza=1;
	private int hp=3;
	public int getStanza() {
		return stanza;
	}
	
	public int gemmaPresa() {
		stanza=3;
		return stanza;
	}
	public int entraPremuto() {
		stanza=2;
		return stanza;
	}
	public int togliVita() {
		return hp--;
	}
}

