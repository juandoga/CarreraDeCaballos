package carreraCaballosInterfaz;

public class Ganador {

	long inicio;
	long fin;

	public long getInicio() {
		return inicio;
	}

	public void setInicio(long inicio) {
		this.inicio = inicio;
	}

	public long getFin() {
		return fin;
	}

	public void setFin(long fin) {
		this.fin = fin;
	}

	public long tiempo() {
		this.inicio = System.currentTimeMillis();
		this.fin = System.currentTimeMillis();

		return (this.fin - this.inicio);
	}
}
