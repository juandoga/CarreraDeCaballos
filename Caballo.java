package carreraCaballosInterfaz;

public class Caballo implements Runnable {
	private String nombre;
	private int tiempo;

	public Caballo() {
		nombre = "";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int TiempoCaballo() {
		return tiempo;

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		
		int tiempo = (int) ((Math.random() * 10) * 1000);
		int segundos = tiempo / 1000;
		try {
			Thread.sleep(tiempo);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.tiempo = segundos;
		System.out.println("Soy el caballo " + nombre + " y he tardado " + segundos + " segundos.");
		
	}
}
