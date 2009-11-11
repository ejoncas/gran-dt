package ui2;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.ListModel;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;


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
public class InscribirTorneoAmigosFrame extends javax.swing.JFrame {
	private JLabel lblSeleccione;
	private JRadioButton jrbDuenio;
	private JRadioButton jrbNombre;
	private JTextField txtBuscar;
	private JButton btnPostularse;
	private JList listEncontrados;
	private JButton btnBuscar;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				InscribirTorneoAmigosFrame inst = new InscribirTorneoAmigosFrame();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public InscribirTorneoAmigosFrame() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			GroupLayout thisLayout = new GroupLayout((JComponent)getContentPane());
			getContentPane().setLayout(thisLayout);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			{
				lblSeleccione = new JLabel();
				lblSeleccione.setText("Seleccione el criterio de bœsqueda para el torneo:");
			}
			{
				jrbDuenio = new JRadioButton();
				jrbDuenio.setText("Buscar por due–o");
			}
			{
				jrbNombre = new JRadioButton();
				jrbNombre.setText("Buscar por nombre del torneo");
			}
			{
				txtBuscar = new JTextField();
			}
			{
				btnBuscar = new JButton();
				btnBuscar.setText("Buscar");
			}
			{
				ListModel listEncontradosModel = 
					new DefaultComboBoxModel(
							new String[] { "Item One", "Item Two" });
				listEncontrados = new JList();
				listEncontrados.setModel(listEncontradosModel);
			}
			{
				btnPostularse = new JButton();
				btnPostularse.setText("Postularse");
			}
			thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
				.addContainerGap()
				.addComponent(lblSeleccione, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				.addGap(17)
				.addComponent(jrbDuenio, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(jrbNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				.addComponent(txtBuscar, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				.addComponent(btnBuscar, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				.addGap(22)
				.addComponent(listEncontrados, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 0, GroupLayout.PREFERRED_SIZE)
				.addComponent(btnPostularse, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
			thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
				.addContainerGap(22, 22)
				.addGroup(thisLayout.createParallelGroup()
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(lblSeleccione, GroupLayout.PREFERRED_SIZE, 305, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 54, Short.MAX_VALUE))
				    .addGroup(thisLayout.createSequentialGroup()
				        .addGroup(thisLayout.createParallelGroup()
				            .addComponent(jrbNombre, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)
				            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                .addComponent(jrbDuenio, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
				                .addGap(65)))
				        .addGap(78)
				        .addGroup(thisLayout.createParallelGroup()
				            .addGroup(thisLayout.createSequentialGroup()
				                .addComponent(btnPostularse, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE))
				            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                .addGap(25)
				                .addComponent(btnBuscar, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)))
				        .addGap(0, 0, Short.MAX_VALUE))
				    .addGroup(thisLayout.createSequentialGroup()
				        .addComponent(txtBuscar, GroupLayout.PREFERRED_SIZE, 359, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 0, Short.MAX_VALUE))
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addPreferredGap(lblSeleccione, listEncontrados, LayoutStyle.ComponentPlacement.INDENT)
				        .addComponent(listEncontrados, GroupLayout.PREFERRED_SIZE, 353, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 0, Short.MAX_VALUE)))
				.addContainerGap(19, 19));
			pack();
			setSize(400, 300);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
