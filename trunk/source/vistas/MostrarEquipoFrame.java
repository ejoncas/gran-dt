package vistas;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.LayoutStyle;
import javax.swing.ListModel;
import javax.swing.SwingUtilities;
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
public class MostrarEquipoFrame extends javax.swing.JInternalFrame {
	private JLabel lblJugadores;
	private JList listJugadores;
	private JLabel lblAcumulado;
	private JButton lblAceptar;
	private JLabel jLabel1;
	private JLabel lblUltFech;
	private JLabel lblPuntAcum;

	/**
	 * Auto-generated main method to display this JFrame
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				MostrarEquipoFrame inst = new MostrarEquipoFrame();
	//			inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}

	public MostrarEquipoFrame() {
		super("Ver equipo", true, true, true, true);
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
				lblAcumulado = new JLabel();
				lblAcumulado.setText("Puntaje acumulado:");
			}
			{
				lblPuntAcum = new JLabel();
				lblPuntAcum.setText("<>");
			}
			{
				lblUltFech = new JLabel();
				lblUltFech.setText("Puntaje obtenido en la �ltima fecha:");
			}
			{
				jLabel1 = new JLabel();
				jLabel1.setText("<>");
			}
			{
				lblAceptar = new JButton();
				lblAceptar.setText("Aceptar");
			}
			thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
					.addContainerGap(21, 21)
					.addComponent(lblJugadores, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(listJugadores, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
					.addGap(24)
					.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(lblAcumulado, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblPuntAcum, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
							.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
									.addComponent(lblUltFech, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
									.addComponent(jLabel1, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(18)
									.addComponent(lblAceptar, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
									.addContainerGap(24, Short.MAX_VALUE));
			thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
					.addContainerGap(19, 19)
					.addGroup(thisLayout.createParallelGroup()
							.addComponent(listJugadores, GroupLayout.Alignment.LEADING, 0, 369, Short.MAX_VALUE)
							.addGroup(thisLayout.createSequentialGroup()
									.addGroup(thisLayout.createParallelGroup()
											.addGroup(thisLayout.createSequentialGroup()
													.addPreferredGap(lblJugadores, lblAcumulado, LayoutStyle.ComponentPlacement.INDENT)
													.addGroup(thisLayout.createParallelGroup()
															.addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
																	.addComponent(lblAcumulado, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
																	.addGap(17)
																	.addComponent(lblPuntAcum, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
																	.addGap(60))
																	.addComponent(lblUltFech, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE)))
																	.addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
																			.addComponent(lblJugadores, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
																			.addGap(151)))
																			.addGap(24)
																			.addGroup(thisLayout.createParallelGroup()
																					.addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
																							.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
																							.addGap(0, 56, Short.MAX_VALUE))
																							.addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
																									.addGap(37)
																									.addComponent(lblAceptar, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
																									.addGap(0, 0, Short.MAX_VALUE)))
																									.addGap(26)))
																									.addContainerGap());
			pack();
			setSize(400, 300);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
