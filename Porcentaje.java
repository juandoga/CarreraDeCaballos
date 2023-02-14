package carreraCaballosInterfaz;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class Porcentaje implements Runnable {

	private JProgressBar porcentaje;
	private String nombre;
	private boolean continuar = true;
	private long inicio;
	private long fin;
	private long resultadoTiempo;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public JProgressBar getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(JProgressBar porcentaje) {
		this.porcentaje = porcentaje;
	}

	public void run() {
		// TODO Auto-generated method stub
		Ganador g = new Ganador();
		inicio = System.currentTimeMillis();
		System.out.println("Tiempo inicio de " + this.nombre + " = " + inicio);
		while (continuar = true) {

			int aleatorio = (int) (Math.random() * 10);

			while (porcentaje.getValue() < 100) {
				porcentaje.setValue(aleatorio);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				aleatorio += (int) (Math.random() * 10);
				System.out.println("Posicion de " + this.nombre + " = " + porcentaje.getValue());

				fin = System.currentTimeMillis();
				System.out.println("Tiempo fin de " + this.nombre + " = " + fin);

				resultadoTiempo = fin - inicio;
				System.out.println("Tiempo transcurrido en " + this.nombre + " = " + resultadoTiempo);
			}

		}

	}

}
