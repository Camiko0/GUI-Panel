//Paquete
package vista;

import java.awt.Color;
//Librerias
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

//Declaración de la clase
public class Vista extends JFrame implements ActionListener{
	
	//Declaración de componentes
	private JPanel panelIzquierdo, panelDerecho;
	
	//Constructor
	public Vista() {
		//Creación de dos paneles (Izquierdo y derecho) con diferente color
		
		//Panel Izquierdo
		//Ejemplificación del Panel
		panelIzquierdo = new JPanel();
		//Posición y tamaño del panel
		panelIzquierdo.setBounds(0, 0, 325, 560);
		//Color de fondo
		panelIzquierdo.setBackground(Color.blue);
		//Sin Layout
		panelIzquierdo.setLayout(null);
		
		//Panel Derecho
		panelDerecho = new JPanel();
		panelDerecho.setBounds(325, 0, 325, 560);
		panelDerecho.setBackground(Color.red);
		panelDerecho.setLayout(null);
		
		//Agregar componentes a la ventana
		add(panelIzquierdo);
		add(panelDerecho);
		
		//Configuración de la ventana
		//Cerrar la ventana al terminar la ejecución
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//Tamaño de la ventana
		setSize(650,560);
		//Ubicación en el centro de la pantalla
		setLocationRelativeTo(this);
		//Sin Layout
		setLayout(null);
		//Sin barra superior
		setUndecorated(true);
		//Color de fondo de la ventana
		getContentPane().setBackground(Color.green);
		setVisible(true);
	}

	//Metodo de eventos	
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
	}
}
