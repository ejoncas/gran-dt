package ui2;
import java.awt.event.ActionEvent;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.WindowConstants;

import controlador.AltaUsuarioControlador;


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
public class AltaUsuario3 extends javax.swing.JFrame {
	private JLabel lblEquipo;
	private JButton btnAceptar;
	private JButton btnCancelar;
	private JPasswordField txtPassword2;
	private JLabel lblContrasenia2;
	private JPasswordField txtPassword;
	private JLabel lblContrasenia;
	private JTextField txtEquipo;
	private final AltaUsuarioControlador auc;


	public AltaUsuario3(AltaUsuarioControlador auc) {
		super();
		this.auc=auc;
		initGUI();
	}

	private void initGUI() {
		try {
			GroupLayout thisLayout = new GroupLayout(getContentPane());
			getContentPane().setLayout(thisLayout);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			{
				lblEquipo = new JLabel();
				lblEquipo.setText("Nombre Equipo");
			}
			{
				txtEquipo = new JTextField();
			}
			{
				lblContrasenia = new JLabel();
				lblContrasenia.setText("Contraseña");
			}

			{
				txtPassword = new JPasswordField();
			}
			{
				lblContrasenia2 = new JLabel();
				lblContrasenia2.setText("Repetir Contraseña");
			}
			{
				txtPassword2 = new JPasswordField();
			}
			{
				btnAceptar = new JButton();
				btnAceptar.setText("Aceptar");
			}
			{
				btnCancelar = new JButton();
				btnCancelar.setText("Cancelar");
			}
			thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(txtEquipo, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblEquipo, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(17)
							.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
									.addComponent(txtPassword, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblContrasenia, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(16)
									.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
											.addComponent(txtPassword2, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
											.addComponent(lblContrasenia2, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
											.addGap(62)
											.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
													.addComponent(btnAceptar, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
													.addComponent(btnCancelar, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
													.addContainerGap(17, 17));
			thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
					.addContainerGap(19, 19)
					.addGroup(thisLayout.createParallelGroup()
							.addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
									.addComponent(lblEquipo, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
									.addGap(12))
									.addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
											.addComponent(lblContrasenia, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
											.addGap(18))
											.addComponent(lblContrasenia2, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE))
											.addGroup(thisLayout.createParallelGroup()
													.addGroup(thisLayout.createSequentialGroup()
															.addComponent(txtEquipo, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE))
															.addGroup(thisLayout.createSequentialGroup()
																	.addComponent(txtPassword, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE))
																	.addGroup(thisLayout.createSequentialGroup()
																			.addComponent(txtPassword2, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE))
																			.addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
																					.addGap(28)
																					.addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
																					.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
																					.addComponent(btnAceptar, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)))
																					.addContainerGap(12, Short.MAX_VALUE));
			pack();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void btnAceptarActionPerformed(ActionEvent evt) {
		System.out.println("btnAceptar.actionPerformed, event="+evt);
		//TODO add your code for btnAceptar.actionPerformed
		String r = this.auc.finalizarAltaUsuario3(txtEquipo.getText(), txtPassword.getText(), txtPassword2.getText());
		if(r!=null){
			JOptionPane.showMessageDialog(null, r);
		}
		else{
			new AltaUsuario3(this.auc).setVisible(true);
			this.dispose();
		}
	}


}
