package vistas;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.ListModel;
import javax.swing.WindowConstants;


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
public class RegistrarPuntajesJugadoresFrame extends javax.swing.JInternalFrame {
	private JLabel lblJugadores;
	private JList listJugadores;
	private JLabel lblJug;
	private JTextField txtPuntaje;
	private JButton btnFinalizar;
	private JLabel jLabel1;
	private JLabel lblIngresado;
	private JButton btnIngresar;
	private JLabel lblIngresar;
	private JLabel lblJugador;
	private JButton btnSeleccionar;


	public RegistrarPuntajesJugadoresFrame() {
		super("Cargar puntajes de jugadores", true, true, true, true);
		initGUI();
	}

	private void initGUI() {
		try {
			GroupLayout thisLayout = new GroupLayout(getContentPane());
			getContentPane().setLayout(thisLayout);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			{
				lblJugadores = new JLabel();
				lblJugadores.setText("Jugadores:");
			}
			{
				ListModel listJugadoresModel = 
					new DefaultComboBoxModel(
							new String[] { "Item One", "Item Two" });
				listJugadores = new JList();
				listJugadores.setModel(listJugadoresModel);
			}
			{
				btnSeleccionar = new JButton();
				btnSeleccionar.setText("Seleccionar");
			}
			{
				lblJugador = new JLabel();
				lblJugador.setText("Jugador");
			}
			{
				lblJug = new JLabel();
				lblJug.setText("<jugador>");
			}
			{
				lblIngresar = new JLabel();
				lblIngresar.setText("Ingresar puntaje:");
			}
			{
				txtPuntaje = new JTextField();
				txtPuntaje.setText("jTextField1");
			}
			{
				btnIngresar = new JButton();
				btnIngresar.setText("Ingresar");
			}
			{
				lblIngresado = new JLabel();
				lblIngresado.setText("Puntaje ingresado:");
			}
			{
				jLabel1 = new JLabel();
				jLabel1.setText("<puntaje ingresado>");
			}
			{
				btnFinalizar = new JButton();
				btnFinalizar.setText("Finalizar");
			}
			thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
					.addContainerGap(17, 17)
					.addComponent(lblJugadores, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
					.addComponent(listJugadores, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
					.addComponent(btnSeleccionar, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(47)
					.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(lblJugador, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblJug, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(16)
							.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
									.addComponent(txtPuntaje, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblIngresar, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(btnIngresar, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(17)
									.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
											.addComponent(jLabel1, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
											.addComponent(lblIngresado, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
											.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 0, Short.MAX_VALUE)
											.addComponent(btnFinalizar, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
											.addContainerGap(26, 26));
			thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
					.addContainerGap(21, 21)
					.addGroup(thisLayout.createParallelGroup()
							.addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
									.addComponent(lblJugadores, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
									.addGap(27)
									.addComponent(btnSeleccionar, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
									.addGap(151))
									.addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
											.addComponent(listJugadores, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE)
											.addGap(151))
											.addGroup(thisLayout.createSequentialGroup()
													.addGap(12)
													.addGroup(thisLayout.createParallelGroup()
															.addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
																	.addComponent(lblJugador, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
																	.addGap(17)
																	.addComponent(lblJug, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
																	.addGap(210))
																	.addGroup(thisLayout.createSequentialGroup()
																			.addGroup(thisLayout.createParallelGroup()
																					.addComponent(lblIngresar, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
																					.addComponent(lblIngresado, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE))
																					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
																					.addGroup(thisLayout.createParallelGroup()
																							.addComponent(txtPuntaje, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE)
																							.addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
																									.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
																									.addGap(98)))))))
																									.addGroup(thisLayout.createParallelGroup()
																											.addGroup(thisLayout.createSequentialGroup()
																													.addComponent(btnIngresar, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
																													.addGroup(thisLayout.createSequentialGroup()
																															.addComponent(btnFinalizar, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)))
																															.addContainerGap(12, Short.MAX_VALUE));
			pack();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
