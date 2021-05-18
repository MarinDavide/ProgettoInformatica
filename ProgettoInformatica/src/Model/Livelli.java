package Model;

public class Livelli {
	private int stanza = 1;
	private int hp = 4;
	private int direzione = 0;
	private int gemmePiazzate = 0;
	private boolean aperto = false;

	/**
	 * Restituisce stanza
	 * 
	 * @return int
	 */
	public int getStanza() {
		return stanza;
	}

	/**
	 * Setta a 3 il valore di stanza
	 * 
	 * @return int
	 */
	public int gemmaPresa() { // in caso venga raccolta la gemma lvl1
		stanza = 3;
		return stanza;
	}

	public int entraPremuto() { // in caso venga premuto il tasto START
		stanza = 2;
		return stanza;
	}

	public int togliVita() { // in caso si prenda del danno
		return hp = hp - 1;
	}

	public int getHp() { // sepmlice get della variabile HP
		return hp;
	}

	public int Sinistra() {
		return direzione = direzione - 1;
	}

	public int Destra() {
		return direzione = direzione + 1;
	}

	public int getDirezione() {
		return direzione;
	}

	public boolean getAperto() {
		return aperto;
	}

	public void setAperto(boolean aperto) {
		this.aperto = aperto;
	}

	public int entratoPortaThread() {
		stanza = 4;
		return stanza;
	}

	public void gemmaDuePresa() {
		stanza = 5;
	}

	public int getGemmePiazzate() {
		return gemmePiazzate;
	}

	public void serPremuta() {
		gemmePiazzate = gemmePiazzate + 1;
	}

	public int entratoPortaFinale() {
		stanza = 6;
		//aperto = false;
		return stanza;
	}
	
}
