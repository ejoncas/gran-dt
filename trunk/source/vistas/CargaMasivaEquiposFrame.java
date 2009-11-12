package vistas;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
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
public class CargaMasivaEquiposFrame extends javax.swing.JFrame {
	private JLabel lblSeleccione;
	private JTextField txtPath;
	private JButton btnCargar;
	private JButton btnExaminar;

	/**
	 * Auto-generated main method to display this JFrame
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				CargaMasivaEquiposFrame inst = new CargaMasivaEquiposFrame();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}

	public CargaMasivaEquiposFrame() {
		super();
		initGUI();
	}

	private void initGUI() {
		try {
			GroupLayout thisLayout = new GroupLayout(getContentPane());
			getContentPane().setLayout(thisLayout);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			{
				lblSeleccione = new JLabel();
				lblSeleccione.setText("Seleccione el archivo de Equipos (*.csv)");
			}
			{
				txtPath = new JTextField();
			}
			{
				btnExaminar = new JButton();
				btnExaminar.setText("Examinar");
			}
			{
				btnCargar = new JButton();
				btnCargar.setText("Cargar");
			}
			thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblSeleccione, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
					.addComponent(txtPath, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
					.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(btnExaminar, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnCargar, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
							.addContainerGap());
			thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
					.addContainerGap(22, 22)
					.addGroup(thisLayout.createParallelGroup()
							.addComponent(txtPath, GroupLayout.Alignment.LEADING, 0, 366, Short.MAX_VALUE)
							.addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
									.addGroup(thisLayout.createParallelGroup()
											.addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
													.addGap(0, 226, Short.MAX_VALUE)
													.addComponent(btnCargar, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
													.addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
															.addComponent(lblSeleccione, GroupLayout.PREFERRED_SIZE, 243, GroupLayout.PREFERRED_SIZE)
															.addGap(45)))
															.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 0, GroupLayout.PREFERRED_SIZE)
															.addComponent(btnExaminar, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)))
															.addContainerGap());
			pack();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
