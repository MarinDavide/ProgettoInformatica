package Model;

public class Livelli {
	private int stanza=1;
	private int hp=4;
	public int getStanza() {
		return stanza;
	}
	
	public int gemmaPresa() {	//in caso venga raccolta la gemma lvl1
		stanza=3;
		return stanza;
	}
	public int entraPremuto() {	//in caso venga premuto il tasto START
		stanza=2;
		return stanza;
	}
	public int togliVita() {	//in caso si prenda del danno
		return hp=hp-1;
	}
	public int getHp() {	//sepmlice get della variabile HP
		return hp;
	}
}

