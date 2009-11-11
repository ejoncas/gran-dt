package ui;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.LayoutStyle;

import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
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
public class ArmarEquipoFrame extends javax.swing.JFrame {
	private JLabel lblDisponibles;
	private JTable tblDisponibles;
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

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				ArmarEquipoFrame inst = new ArmarEquipoFrame();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public ArmarEquipoFrame() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			GroupLayout thisLayout = new GroupLayout((JComponent)getContentPane());
			getContentPane().setLayout(thisLayout);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			{
				lblDisponibles = new JLabel();
				lblDisponibles.setText("Jugadores disponibles:");
			}
			{
				TableModel tblDisponiblesModel = 
					new DefaultTableModel(
							new String[][] { { "One", "Two" }, { "Three", "Four" } },
							new String[] { "Column 1", "Column 2" });
				tblDisponibles = new JTable();
				tblDisponibles.setModel(tblDisponiblesModel);
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
				TableModel tblTitularesModel = 
					new DefaultTableModel(
							new String[][] { { "One", "Two" }, { "Three", "Four" } },
							new String[] { "Column 1", "Column 2" });
				tblTitulares = new JTable();
				tblTitulares.setModel(tblTitularesModel);
			}
			{
				TableModel tblSuplentesModel = 
					new DefaultTableModel(
							new String[][] { { "One", "Two" }, { "Three", "Four" } },
							new String[] { "Column 1", "Column 2" });
				tblSuplentes = new JTable();
				tblSuplentes.setModel(tblSuplentesModel);
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
				btnQuitarT = new JButton();
				btnQuitarT.setText("Quitar titular");
			}
			thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
				.addContainerGap(21, 21)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(lblDisponibles, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
				    .addComponent(lblTitulares, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				.addGroup(thisLayout.createParallelGroup()
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(tblTitulares, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
				        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				        .addComponent(btnQuitarT, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				        .addComponent(lblSuplentes, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				        .addGap(15))
				    .addComponent(tblDisponibles, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE))
				.addGroup(thisLayout.createParallelGroup()
				    .addComponent(tblSuplentes, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
				    .addGroup(thisLayout.createSequentialGroup()
				        .addGap(18)
				        .addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				            .addComponent(btnAgregarT, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				            .addComponent(btnAgregarS, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				        .addGap(23)))
				.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				.addComponent(btnQuitarS, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				.addGap(0, 18, Short.MAX_VALUE)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(lblGastado, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(lblMontoGastado, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(thisLayout.createParallelGroup()
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				        .addComponent(lblDisponible, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				        .addComponent(lblMontoDisponible, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				    .addComponent(btnConfirmar, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addContainerGap());
			thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
				.addContainerGap(16, 16)
				.addGroup(thisLayout.createParallelGroup()
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(btnAgregarT, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
				        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				        .addComponent(btnAgregarS, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE))
				    .addComponent(tblDisponibles, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 256, GroupLayout.PREFERRED_SIZE)
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(lblDisponibles, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
				        .addGap(97))
				    .addGroup(thisLayout.createSequentialGroup()
				        .addPreferredGap(btnAgregarT, lblDisponible, LayoutStyle.ComponentPlacement.INDENT)
				        .addGroup(thisLayout.createParallelGroup()
				            .addComponent(lblDisponible, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
				            .addComponent(lblGastado, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE))
				        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				        .addGroup(thisLayout.createParallelGroup()
				            .addComponent(lblMontoDisponible, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
				            .addComponent(lblMontoGastado, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE))))
				.addGap(38)
				.addGroup(thisLayout.createParallelGroup()
				    .addGroup(thisLayout.createSequentialGroup()
				        .addComponent(tblSuplentes, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 0, Short.MAX_VALUE))
				    .addGroup(thisLayout.createSequentialGroup()
				        .addComponent(tblTitulares, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 0, Short.MAX_VALUE))
				    .addGroup(thisLayout.createSequentialGroup()
				        .addGap(16)
				        .addGroup(thisLayout.createParallelGroup()
				            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                .addComponent(lblSuplentes, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
				                .addGap(19)
				                .addGroup(thisLayout.createParallelGroup()
				                    .addGroup(thisLayout.createSequentialGroup()
				                        .addComponent(btnQuitarT, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE))
				                    .addGroup(thisLayout.createSequentialGroup()
				                        .addComponent(btnQuitarS, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)))
				                .addGap(0, 0, Short.MAX_VALUE))
				            .addGroup(thisLayout.createSequentialGroup()
				                .addPreferredGap(lblSuplentes, lblTitulares, LayoutStyle.ComponentPlacement.INDENT)
				                .addGroup(thisLayout.createParallelGroup()
				                    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                        .addComponent(lblTitulares, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
				                        .addGap(0, 137, Short.MAX_VALUE))
				                    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                        .addGap(32)
				                        .addComponent(btnConfirmar, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
				                        .addGap(0, 0, Short.MAX_VALUE)))))
				        .addGap(23)))
				.addContainerGap(24, 24));
			pack();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
