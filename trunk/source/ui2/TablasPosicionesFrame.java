package ui2;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;
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
public class TablasPosicionesFrame extends javax.swing.JFrame {
	private JButton btnAceptar;
	private JLabel lblTitulo;
	private JList listEquipos;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				TablasPosicionesFrame inst = new TablasPosicionesFrame();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public TablasPosicionesFrame() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			GroupLayout thisLayout = new GroupLayout((JComponent)getContentPane());
			getContentPane().setLayout(thisLayout);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			{
				btnAceptar = new JButton();
				btnAceptar.setText("Aceptar");
			}
			{
				lblTitulo = new JLabel();
				lblTitulo.setText("Equipos ordenados por puntaje:");
			}
			{
				ListModel listEquiposModel = 
					new DefaultComboBoxModel(
							new String[] { "Item One", "Item Two" });
				listEquipos = new JList();
				listEquipos.setModel(listEquiposModel);
			}
			thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
				.addContainerGap(19, 19)
				.addComponent(lblTitulo, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				.addComponent(listEquipos, 0, 92, Short.MAX_VALUE)
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(btnAceptar, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				.addContainerGap());
			thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
				.addContainerGap(27, 27)
				.addGroup(thisLayout.createParallelGroup()
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(lblTitulo, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
				        .addGap(86)
				        .addComponent(btnAceptar, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
				        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 0, Short.MAX_VALUE))
				    .addGroup(thisLayout.createSequentialGroup()
				        .addComponent(listEquipos, GroupLayout.PREFERRED_SIZE, 346, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 0, Short.MAX_VALUE)))
				.addContainerGap(19, 19));
			pack();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
