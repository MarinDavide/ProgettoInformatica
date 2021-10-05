package thread;

import Model.Livelli;
import view.Gioco;

public class Thread_porte implements Runnable {
	private Gioco g;
	private Livelli l;

	public Thread_porte(Gioco g, Livelli l) {
		this.g = g;
		this.l = l;
	}

	@Override
	public void run() {
		int stanza=l.getStanza();
		g.Hidebtn(stanza);
		int stato = 0;
		// System.out.println(l.getStanza());
		//System.out.println("Ho iniziato");
		for(int i=0; i<3; i++) {
			g.apriChiudi(stato);
			l.setTAperto(true);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			stato++;
		}
		g.apriChiudi(stato);
		l.setTAperto(false);
		g.showItem(stanza);
		//System.out.println("ho finito");

	}

}
