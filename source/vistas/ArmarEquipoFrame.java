package vistas;
import java.util.Date;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.LayoutStyle;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import controlador.ArmarEquipoControlador;


/**
 * This code was edited or generated using CloudGarden's Jigloo
 * SWT/Swing GUI Builder, which is free for non-commercial
 * use. If Jigloo is being used commercially (ie, by a corporation,
 * company or business for any purpose whatever) then you
 * should purchase a license for each developer using Jigloo.
 * Please visit www.cloudgarden.com for details.
 * Use of Jigloo implies acceptance of these licensing terms.
 * A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
 * THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
 * LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
 */
public class ArmarEquipoFrame extends javax.swing.JFrame {
	private JLabel lblDisponibles;
	private JScrollPane jScrollPane1;
	private JScrollPane jScrollPane2;
	private JScrollPane jScrollPane3;
	private JTable tblJugadores;
	private JButton btnQuitarS;
	private JButton btnQuitarT;
	private JLabel lblSuplentes;
	private JTable tblTitulares;
	private JButton btnAgregarS;
	private JButton btnAgregarT;
	private JButton btnConfirmar;
	private JTable tblSuplentes;
	private JLabel lblMontoDisponible;
	private JLabel lblMontoGastado;
	private JLabel lblDisponible;
	private JLabel lblGastado;
	private JLabel lblTitulares;
	private ArmarEquipoControlador aec;

	/**
	 * Auto-generated main method to display this JFrame
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				ArmarEquipoFrame inst = new ArmarEquipoFrame();
				ArmarEquipoControlador aec = new ArmarEquipoControlador(inst);
				inst.addControlador(aec);

				aec.getLogica().crearUsuario("Manolo", "Loco", "DNI", 3456, new Date(1,1,2001), "F", "River", "Neuquen", "T3F", "JI", "Larrea", 33, 1, "A", "32AC", 3456, 3456, "lala@lalala.com", "1234","12345");
				aec.getLogica().setUsuarioActual(aec.getLogica().getUsuarios().elementAt(0));

				System.out.println(aec.getLogica().getUsuarioActual().toString());



				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}

	public ArmarEquipoFrame() {
		super();
		initGUI();
	}

	public void addControlador(ArmarEquipoControlador aec){
		this.aec = aec;
	}

	private void initGUI() {
		try {
			GroupLayout thisLayout = new GroupLayout(getContentPane());
			getContentPane().setLayout(thisLayout);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			{
				lblDisponibles = new JLabel();
				lblDisponibles.setText("Jugadores disponibles:");
			}
			{
				lblTitulares = new JLabel();
				lblTitulares.setText("Titulares");
			}
			{
				btnQuitarS = new JButton();
				btnQuitarS.setText("Quitar suplente");
			}
			{
				jScrollPane1 = new JScrollPane();
				{
					TableModel tblJugadoresModel = 
						new DefaultTableModel(
								new String[][] { { "One", "Two" }, { "Three", "Four" } },
								new String[] { "Jugador", "Club", "Posicion", "Cotiza" });
					tblJugadores = new JTable();
					jScrollPane1.setViewportView(tblJugadores);
					tblJugadores.setModel(tblJugadoresModel);
				}
			}
			{
				lblSuplentes = new JLabel();
				lblSuplentes.setText("Suplentes");
			}
			{
				lblGastado = new JLabel();
				lblGastado.setText("Gastado: $");
			}
			{
				lblDisponible = new JLabel();
				lblDisponible.setText("Disponible: $");
			}
			{
				lblMontoGastado = new JLabel();
				lblMontoGastado.setText("<monto gastado>");
			}
			{
				lblMontoDisponible = new JLabel();
				lblMontoDisponible.setText("<monto disponible>");
			}
			{
				jScrollPane2 = new JScrollPane();
				{
					TableModel tblTitularesModel = 
						new DefaultTableModel(
								new String[][] { { "One", "Two" }, { "Three", "Four" } },
								new String[] { "Jugador", "Posicion" });
					tblTitulares = new JTable();
					jScrollPane2.setViewportView(tblTitulares);
					tblTitulares.setModel(tblTitularesModel);
				}
			}
			{
				btnConfirmar = new JButton();
				btnConfirmar.setText("Confirmar equipo");
			}
			{
				btnAgregarT = new JButton();
				btnAgregarT.setText("Agregar titular");
			}
			{
				btnAgregarS = new JButton();
				btnAgregarS.setText("Agregar suplente");
			}
			{
				jScrollPane3 = new JScrollPane();
				{
					TableModel tblSuplentesModel = 
						new DefaultTableModel(
								new String[][] { { "One", "Two" }, { "Three", "Four" } },
								new String[] { "Jugador", "Posicion" });
					tblSuplentes = new JTable();
					jScrollPane3.setViewportView(tblSuplentes);
					tblSuplentes.setModel(tblSuplentesModel);
				}
			}
			{
				btnQuitarT = new JButton();
				btnQuitarT.setText("Quitar titular");
			}
			thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
					.addContainerGap(12, 12)
					.addGroup(thisLayout.createParallelGroup()
							.addGroup(thisLayout.createSequentialGroup()
									.addGroup(thisLayout.createParallelGroup()
											.addComponent(lblDisponible, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
											.addComponent(lblGastado, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE))
											.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
											.addGroup(thisLayout.createParallelGroup()
													.addComponent(lblMontoDisponible, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
													.addComponent(lblMontoGastado, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)))
													.addGroup(thisLayout.createSequentialGroup()
															.addComponent(btnAgregarT, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
															.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
															.addComponent(btnAgregarS, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE))
															.addComponent(lblDisponibles, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
															.addComponent(jScrollPane1, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 255, GroupLayout.PREFERRED_SIZE))
															.addGap(45)
															.addGroup(thisLayout.createParallelGroup()
																	.addComponent(jScrollPane3, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 242, GroupLayout.PREFERRED_SIZE)
																	.addComponent(jScrollPane2, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 242, GroupLayout.PREFERRED_SIZE)
																	.addGroup(thisLayout.createSequentialGroup()
																			.addGap(8)
																			.addGroup(thisLayout.createParallelGroup()
																					.addComponent(lblSuplentes, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
																					.addGroup(thisLayout.createSequentialGroup()
																							.addGap(20)
																							.addGroup(thisLayout.createParallelGroup()
																									.addGroup(thisLayout.createSequentialGroup()
																											.addComponent(lblTitulares, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
																											.addGap(28)
																											.addGroup(thisLayout.createParallelGroup()
																													.addComponent(btnQuitarT, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
																													.addComponent(btnQuitarS, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)))
																													.addGroup(thisLayout.createSequentialGroup()
																															.addGap(42)
																															.addComponent(btnConfirmar, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)))))))
																															.addContainerGap(11, 11));
			thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
					.addContainerGap(12, 12)
					.addGroup(thisLayout.createParallelGroup()
							.addComponent(lblDisponibles, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblTitulares, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
							.addGroup(thisLayout.createParallelGroup()
									.addGroup(thisLayout.createSequentialGroup()
											.addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
											.addComponent(btnQuitarT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
											.addComponent(lblSuplentes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
											.addComponent(jScrollPane3, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
											.addComponent(jScrollPane1, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 265, GroupLayout.PREFERRED_SIZE))
											.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
											.addGroup(thisLayout.createParallelGroup()
													.addComponent(btnAgregarT, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
													.addComponent(btnAgregarS, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
													.addComponent(btnQuitarS, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
													.addGap(28)
													.addGroup(thisLayout.createParallelGroup()
															.addComponent(lblGastado, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
															.addComponent(lblMontoGastado, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
															.addGroup(thisLayout.createParallelGroup()
																	.addComponent(btnConfirmar, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																	.addGroup(thisLayout.createSequentialGroup()
																			.addGap(7)
																			.addGroup(thisLayout.createParallelGroup()
																					.addComponent(lblDisponible, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																					.addComponent(lblMontoDisponible, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
																					.addContainerGap(12, 12));
			pack();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
