package carreraCaballosInterfaz;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.awt.event.ActionEvent;

public class CarreraCaballos {

	private JFrame frame;
	private JTextField nombre1;
	private JTextField nombre2;
	private JTextField nombre3;
	JProgressBar porcentaje1;
	JProgressBar porcentaje2;
	JProgressBar porcentaje3;
	JLabel ganador;

	Caballo caballo1;
	Caballo caballo2;
	Caballo caballo3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CarreraCaballos window = new CarreraCaballos();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CarreraCaballos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 658, 508);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		porcentaje1 = new JProgressBar();
		porcentaje1.setStringPainted(true);
		porcentaje1.setBounds(188, 57, 428, 38);
		frame.getContentPane().add(porcentaje1);

		porcentaje2 = new JProgressBar();
		porcentaje2.setStringPainted(true);
		porcentaje2.setBounds(188, 125, 428, 38);
		frame.getContentPane().add(porcentaje2);

		porcentaje3 = new JProgressBar();
		porcentaje3.setStringPainted(true);
		porcentaje3.setBounds(188, 197, 428, 38);
		frame.getContentPane().add(porcentaje3);

		nombre1 = new JTextField();
		nombre1.setBounds(10, 57, 142, 38);
		frame.getContentPane().add(nombre1);
		nombre1.setColumns(10);

		nombre2 = new JTextField();
		nombre2.setColumns(10);
		nombre2.setBounds(10, 125, 142, 38);
		frame.getContentPane().add(nombre2);

		nombre3 = new JTextField();
		nombre3.setColumns(10);
		nombre3.setBounds(10, 197, 142, 38);
		frame.getContentPane().add(nombre3);

		ganador = new JLabel("Pulsa el botón para iniciar la carrera");
		ganador.setFont(new Font("Tahoma", Font.PLAIN, 20));
		ganador.setBounds(138, 281, 367, 38);
		frame.getContentPane().add(ganador);

		JButton Iniciar = new JButton("Iniciar");
		Iniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ganador.setText("La carrera ha empezado!!!");

				Porcentaje p1 = new Porcentaje();
				Porcentaje p2 = new Porcentaje();
				Porcentaje p3 = new Porcentaje();
				p1.setPorcentaje(porcentaje1);
				p2.setPorcentaje(porcentaje2);
				p3.setPorcentaje(porcentaje3);
				Thread h1 = new Thread(p1);
				Thread h2 = new Thread(p2);
				Thread h3 = new Thread(p3);

				h1.start();
				h2.start();
				h3.start();

				p1.setNombre(nombre1.getText());
				p2.setNombre(nombre2.getText());
				p3.setNombre(nombre3.getText());
			}
		});
		Iniciar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Iniciar.setBounds(226, 351, 192, 49);
		frame.getContentPane().add(Iniciar);
	}
}
