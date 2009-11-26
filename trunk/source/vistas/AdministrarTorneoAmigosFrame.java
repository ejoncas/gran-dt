package vistas;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
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
public class AdministrarTorneoAmigosFrame extends javax.swing.JInternalFrame {
	private JLabel lblNombreTorneo;
	private JLabel lblPostulados;
	private JList listParticipantes;
	private JButton btnRechazar;
	private JComboBox cmbTorneos;
	private JButton btnFinalizar;
	private JButton btnAceptar;
	private JList listPostulados;
	private JLabel lblParticipantes;

	/**
	 * Auto-generated main method to display this JFrame
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				AdministrarTorneoAmigosFrame inst = new AdministrarTorneoAmigosFrame();
				//inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}

	public AdministrarTorneoAmigosFrame() {
		super("Administrar torneo de amigos", true, true, true, true);
		initGUI();
	}

	private void initGUI() {
		try {
			GroupLayout thisLayout = new GroupLayout((JComponent)getContentPane());
			getContentPane().setLayout(thisLayout);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			{
				lblNombreTorneo = new JLabel();
				lblNombreTorneo.setText("Nombre del torneo:");
			}
			{
				lblPostulados = new JLabel();
				lblPostulados.setText("Equipos postulados");
			}
			{
				lblParticipantes = new JLabel();
				lblParticipantes.setText("Equipos participantes");
			}
			{
				ListModel listPostuladosModel = 
					new DefaultComboBoxModel(
							new String[] { "Item One", "Item Two" });
				listPostulados = new JList();
				listPostulados.setModel(listPostuladosModel);
				listPostulados.setSize(250, 50);
			}
			{
				ListModel listParticipantesModel = 
					new DefaultComboBoxModel(
							new String[] { "Item One", "Item Two" });
				listParticipantes = new JList();
				listParticipantes.setModel(listParticipantesModel);
			}
			{
				btnAceptar = new JButton();
				btnAceptar.setText("Aceptar peticion");
			}
			{
				btnRechazar = new JButton();
				btnRechazar.setText("Rechazar peticion");
			}
			{
				btnFinalizar = new JButton();
				btnFinalizar.setText("Finalizar");
			}
			{
				ComboBoxModel cmbTorneosModel = 
					new DefaultComboBoxModel(
							new String[] { "Item One", "Item Two" });
				cmbTorneos = new JComboBox();
				cmbTorneos.setModel(cmbTorneosModel);
			}
			thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
				.addGap(8)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(cmbTorneos, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
				    .addComponent(lblNombreTorneo, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(21)
				.addComponent(lblPostulados, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				.addComponent(listPostulados, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(btnAceptar, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
				    .addComponent(btnRechazar, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
				.addGap(20)
				.addComponent(lblParticipantes, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED, 1, Short.MAX_VALUE)
				.addComponent(listParticipantes, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
				.addGap(22)
				.addComponent(btnFinalizar, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(21, 21));
			thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
				.addContainerGap()
				.addGroup(thisLayout.createParallelGroup()
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(lblNombreTorneo, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
				        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				        .addComponent(cmbTorneos, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 0, Short.MAX_VALUE))
				    .addGroup(thisLayout.createSequentialGroup()
				        .addGroup(thisLayout.createParallelGroup()
				            .addComponent(lblPostulados, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE)
				            .addComponent(lblParticipantes, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE)
				            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                .addGap(36)
				                .addComponent(btnRechazar, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)))
				        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				        .addGroup(thisLayout.createParallelGroup()
				            .addComponent(btnAceptar, GroupLayout.Alignment.LEADING, 0, 142, Short.MAX_VALUE)
				            .addGroup(thisLayout.createSequentialGroup()
				                .addGap(0, 0, Short.MAX_VALUE)
				                .addComponent(btnFinalizar, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE))))
				    .addGroup(thisLayout.createSequentialGroup()
				        .addComponent(listPostulados, GroupLayout.PREFERRED_SIZE, 343, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 0, Short.MAX_VALUE))
				    .addGroup(thisLayout.createSequentialGroup()
				        .addComponent(listParticipantes, GroupLayout.PREFERRED_SIZE, 343, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 0, Short.MAX_VALUE)))
				.addContainerGap(16, 16));
			pack();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
