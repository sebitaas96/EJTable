package basico;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EjTablaBasico extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JPanel panelCentral;
	private JPanel panelBotones;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EjTablaBasico frame = new EjTablaBasico();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private void InicioComponentes() {
		//Tabla basica para mostrar datos
		String [] cabecera = {"ID" , "NOMBRE" , "PAIS"};
		Object [][] datos = {{1,"Madrid","España"}, {2 , "ROma" , "Italia"}};
		table = new JTable(datos , cabecera);
		JScrollPane scroll = new JScrollPane(table);
		panelCentral.add(scroll);
		
		JButton btnNewButton_1 = new JButton("Ver lo seleccionado");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Me devuelve el id de los seleccionado , empezando desde el 0
				System.out.println(datos[table.getSelectedRow()][2]);
			}
		});
		panelBotones.add(btnNewButton_1);
		
		
		
	}

	/**
	 * Create the frame.
	 */
	public EjTablaBasico() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		 panelCentral = new JPanel();
		contentPane.add(panelCentral, BorderLayout.CENTER);
		
		
		
		panelBotones = new JPanel();
		contentPane.add(panelBotones, BorderLayout.SOUTH);
		

		
		JButton btnNewButton_2 = new JButton("New button");
		panelBotones.add(btnNewButton_2);
		
		JButton btnNewButton = new JButton("New button");
		panelBotones.add(btnNewButton);
		
		InicioComponentes();
	}
}
