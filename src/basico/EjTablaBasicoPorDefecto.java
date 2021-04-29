package basico;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EjTablaBasicoPorDefecto extends JFrame {

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
					EjTablaBasicoPorDefecto frame = new EjTablaBasicoPorDefecto();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private void InicioComponentes() {
		//Tabla con modelo  para mostrar datos
		String [] cabecera = {"ID" , "NOMBRE" , "PAIS"};
		Object [][] datos = {{1,"Madrid","España"}, {2 , "ROma" , "Italia"}};
		
		
		DefaultTableModel modelo = new DefaultTableModel();
		modelo.setColumnIdentifiers(cabecera); // Seteamos las cabeceras
		modelo.addRow(datos[0]); //Añadir filas como un array de objetos
		modelo.addRow(datos[1]);
		
		
		table = new JTable(modelo);
		JScrollPane scroll = new JScrollPane(table);
		panelCentral.add(scroll);
		
		JButton btnNewButton_1 = new JButton("Ver lo seleccionado");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Me devuelve el valor de la fila seleccionada , de la columna 1 , la fila entera
				//Nunca nos va a devolver , unicamente celdas 
				System.out.println(modelo.getValueAt(table.getSelectedRow(), 1));
				
				//Añadir nuevos datos que no provengan del array 
				modelo.addRow(new Object[] {2,"Paris","Francia"});
				
			}
		});
		panelBotones.add(btnNewButton_1);
		
		
		JButton btnNewButton = new JButton("Eliminar Seleccionado");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Eliminar aquella fila que tiene seleccionada
				modelo.removeRow(table.getSelectedRow());
				
			}
		});
		panelBotones.add(btnNewButton);
		
		JButton btnNewButton2 = new JButton("Eliminar Varios Seleccionado");
		btnNewButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Eliminar varios elementos de golpe
				int cont = 0;
				
				for (int y : table.getSelectedRows()) {
					modelo.removeRow(y - cont++);
				}
				
			}
		});
		panelBotones.add(btnNewButton2);
		
		
	}

	/**
	 * Create the frame.
	 */
	public EjTablaBasicoPorDefecto() {
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
		

		
		InicioComponentes();
	}
}
