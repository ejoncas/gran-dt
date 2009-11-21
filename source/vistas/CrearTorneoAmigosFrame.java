package vistas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

import controlador.CrearTorneoAmigosControlador;


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
public class CrearTorneoAmigosFrame extends javax.swing.JInternalFrame {
	private JLabel lblIngrese;
	private JTextField txtNombreTorneo;
	private JButton btnCrear;
	private JButton btnCancelar;
	private CrearTorneoAmigosControlador ctac;

	/**
	 * Auto-generated main method to display this JFrame
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				CrearTorneoAmigosFrame inst = new CrearTorneoAmigosFrame();
	//			inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}

	public CrearTorneoAmigosFrame() {
		super("Crear toreo de amigos", true, true, true, true);
		this.ctac = new CrearTorneoAmigosControlador();
		initGUI();
	}

	private void initGUI() {
		try {
			GroupLayout thisLayout = new GroupLayout(getContentPane());
			getContentPane().setLayout(thisLayout);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			{
				lblIngrese = new JLabel();
				lblIngrese.setText("Ingrese el nombre del torneo que desea crear:");
			}
			{
				txtNombreTorneo = new JTextField();
			}
			{
				btnCrear = new JButton();
				btnCrear.setText("Crear");
				btnCrear.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						System.out.println("btnCrear.actionPerformed, event="+evt);
						String nombre = txtNombreTorneo.getText();
						String r = ctac.crearTorneo(nombre);
						if(r!=null)	
							JOptionPane.showMessageDialog(null, r);
						else{

							JOptionPane.showMessageDialog(null, "El torneo '"+nombre+ "' se ha creado con exito.");
							dispose();
						}
						
					}
				});
			}
			{
				btnCancelar = new JButton();
				btnCancelar.setText("Cancelar");
				btnCancelar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						btnCancelarActionPerformed(evt);
					}
				});
			}
			thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
				.addContainerGap(20, 20)
				.addComponent(lblIngrese, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				.addComponent(txtNombreTorneo, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(btnCrear, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(btnCancelar, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
				.addContainerGap(19, 19));
			thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
				.addContainerGap()
				.addGroup(thisLayout.createParallelGroup()
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(lblIngrese, GroupLayout.PREFERRED_SIZE, 313, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 12, Short.MAX_VALUE))
				    .addGroup(thisLayout.createSequentialGroup()
				        .addComponent(txtNombreTorneo, GroupLayout.PREFERRED_SIZE, 325, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 0, Short.MAX_VALUE))
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addGap(163)
				        .addComponent(btnCancelar, 0, 88, Short.MAX_VALUE)
				        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				        .addComponent(btnCrear, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)))
				.addContainerGap(18, 18));
			pack();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void btnCancelarActionPerformed(ActionEvent evt) {
		System.out.println("btnCancelar.actionPerformed, event="+evt);
		dispose();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		}

}
