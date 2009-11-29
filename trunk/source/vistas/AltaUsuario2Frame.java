package vistas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
public class AltaUsuario2Frame extends javax.swing.JFrame {
	private JLabel lblPartido;
	private JLabel lblProvincia;
	private JLabel lblCiudad;
	private JTextField txtLocalidad;
	private JTextField txtProvincia;
	private JTextField txtPartido;
	private JButton btnCancelar;
	private JButton btnAceptar;
	private JTextField txtEmail;
	private JLabel lblEmail;
	private JComboBox cmbCompanias;
	private JLabel lblCompani;
	private JTextField txtCelular;
	private JLabel lblCelular;
	private JTextField txtTelefono;
	private JLabel lblTelefono;
	private JTextField txtCP;
	private JLabel lblCP;
	private JTextField txtCalle;
	private JTextField txtDpto;
	private JLabel lblDepto;
	private JLabel lblPiso;
	private JTextField txtNumero;
	private JTextField txtPiso;
	private JLabel lblNumero;
	private JLabel lblCalle;
	private final AltaUsuarioControlador auc;



	public AltaUsuario2Frame(AltaUsuarioControlador auc) {
		super();
		initGUI();
		this.auc=auc;
	}

	private void initGUI() {
		try {
			GroupLayout thisLayout = new GroupLayout(getContentPane());
			getContentPane().setLayout(thisLayout);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			this.setTitle("Alta Usuario - Datos Contacto (2 de 3)");
			{
				lblPartido = new JLabel();
				lblPartido.setText("Partido");
			}
			{
				lblProvincia = new JLabel();
				lblProvincia.setText("Provincia");
			}
			{
				lblCiudad = new JLabel();
				lblCiudad.setText("Localidad");
			}
			{
				lblCalle = new JLabel();
				lblCalle.setText("Calle");
			}
			{
				lblTelefono = new JLabel();
				lblTelefono.setText("Telefono");
			}
			{
				txtTelefono = new JTextField();
			}
			{
				lblCelular = new JLabel();
				lblCelular.setText("Celular");
			}
			{
				txtCelular = new JTextField();
			}
			{
				lblCompani = new JLabel();
				lblCompani.setText("Compañia");
			}
			{
				ComboBoxModel cmbCompaniasModel = 
					new DefaultComboBoxModel(
							new String[] { "", "Movistar", "Personal", "Claro", "Nextel" });
				cmbCompanias = new JComboBox();
				cmbCompanias.setModel(cmbCompaniasModel);
			}
			{
				lblEmail = new JLabel();
				lblEmail.setText("Email");
			}
			{
				txtEmail = new JTextField();
			}
			{
				btnAceptar = new JButton();
				btnAceptar.setText("Aceptar");
				btnAceptar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						btnAceptarActionPerformed(evt);
					}
				});
			}
			{
				btnCancelar = new JButton();
				btnCancelar.setText("Cancelar");
				btnCancelar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e)
					{	dispose();
					setDefaultCloseOperation(EXIT_ON_CLOSE);
					}
				});
			}
			{
				txtPartido = new JTextField();
			}
			{
				txtProvincia = new JTextField();
			}
			{
				txtLocalidad = new JTextField();
			}
			{
				txtCalle = new JTextField();
			}
			{
				lblCP = new JLabel();
				lblCP.setText("Codigo Postal");
			}
			{
				txtCP = new JTextField();
			}
			{
				lblNumero = new JLabel();
				lblNumero.setText("Numero");
			}
			{
				txtPiso = new JTextField();
			}
			{
				txtNumero = new JTextField();
			}
			{
				lblPiso = new JLabel();
				lblPiso.setText("Piso");
			}
			{
				lblDepto = new JLabel();
				lblDepto.setText("Departamento");
			}
			{
				txtDpto = new JTextField();
			}
			thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(txtPartido, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblPartido, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
									.addComponent(txtProvincia, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblProvincia, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
									.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
											.addComponent(txtLocalidad, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
											.addComponent(lblCiudad, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
											.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
											.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
													.addComponent(txtCalle, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
													.addComponent(lblCalle, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
													.addGap(21)
													.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
															.addComponent(txtPiso, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
															.addComponent(lblNumero, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
															.addComponent(txtNumero, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
															.addComponent(lblPiso, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
															.addComponent(lblDepto, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
															.addComponent(txtDpto, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
															.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
															.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
																	.addComponent(txtCP, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
																	.addComponent(lblCP, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
																	.addComponent(lblTelefono, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
																	.addComponent(txtTelefono, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
																	.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
																	.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
																			.addComponent(cmbCompanias, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
																			.addComponent(lblCelular, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
																			.addComponent(txtCelular, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
																			.addComponent(lblCompani, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
																			.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
																			.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
																					.addComponent(txtEmail, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
																					.addComponent(lblEmail, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
																					.addGap(29)
																					.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
																							.addComponent(btnAceptar, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
																							.addComponent(btnCancelar, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
																							.addContainerGap());
			thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(thisLayout.createParallelGroup()
							.addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
									.addComponent(lblEmail, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
									.addGap(18))
									.addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
											.addComponent(lblCelular, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
											.addGap(12))
											.addComponent(lblCP, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
											.addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
													.addComponent(lblNumero, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
													.addGap(27))
													.addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
															.addComponent(lblCalle, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
															.addGap(27))
															.addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
																	.addComponent(lblCiudad, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
																	.addGap(27))
																	.addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
																			.addComponent(lblProvincia, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
																			.addGap(27))
																			.addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
																					.addComponent(lblPartido, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
																					.addGap(27)))
																					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
																					.addGroup(thisLayout.createParallelGroup()
																							.addComponent(txtEmail, GroupLayout.Alignment.LEADING, 0, 372, Short.MAX_VALUE)
																							.addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
																									.addComponent(txtCelular, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
																									.addComponent(txtPiso, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
																									.addGroup(thisLayout.createParallelGroup()
																											.addGroup(thisLayout.createSequentialGroup()
																													.addGap(0, 0, Short.MAX_VALUE)
																													.addComponent(txtTelefono, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE))
																													.addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
																															.addGroup(thisLayout.createParallelGroup()
																																	.addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
																																			.addGap(8)
																																			.addComponent(lblDepto, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))
																																			.addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
																																					.addComponent(lblCompani, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
																																					.addGap(43)))
																																					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
																																					.addComponent(txtDpto, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
																																					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 0, Short.MAX_VALUE))))
																																					.addGroup(thisLayout.createSequentialGroup()
																																							.addGroup(thisLayout.createParallelGroup()
																																									.addComponent(txtCP, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
																																									.addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
																																											.addComponent(txtNumero, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
																																											.addGap(30)))
																																											.addGroup(thisLayout.createParallelGroup()
																																													.addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
																																															.addGap(0, 0, Short.MAX_VALUE)
																																															.addComponent(lblPiso, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
																																															.addGap(0, 23, GroupLayout.PREFERRED_SIZE)
																																															.addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE))
																																															.addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
																																																	.addGap(0, 16, Short.MAX_VALUE)
																																																	.addComponent(lblTelefono, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
																																																	.addGap(97)))
																																																	.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
																																																	.addGroup(thisLayout.createParallelGroup()
																																																			.addGroup(thisLayout.createSequentialGroup()
																																																					.addComponent(btnAceptar, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
																																																					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED))
																																																					.addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
																																																							.addPreferredGap(btnAceptar, cmbCompanias, LayoutStyle.ComponentPlacement.INDENT)
																																																							.addComponent(cmbCompanias, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE))))
																																																							.addGroup(thisLayout.createSequentialGroup()
																																																									.addComponent(txtCalle, GroupLayout.PREFERRED_SIZE, 372, GroupLayout.PREFERRED_SIZE)
																																																									.addGap(0, 0, Short.MAX_VALUE))
																																																									.addGroup(thisLayout.createSequentialGroup()
																																																											.addComponent(txtLocalidad, GroupLayout.PREFERRED_SIZE, 372, GroupLayout.PREFERRED_SIZE)
																																																											.addGap(0, 0, Short.MAX_VALUE))
																																																											.addGroup(thisLayout.createSequentialGroup()
																																																													.addComponent(txtProvincia, GroupLayout.PREFERRED_SIZE, 372, GroupLayout.PREFERRED_SIZE)
																																																													.addGap(0, 0, Short.MAX_VALUE))
																																																													.addComponent(txtPartido, GroupLayout.Alignment.LEADING, 0, 372, Short.MAX_VALUE))
																																																													.addContainerGap());
			pack();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void btnAceptarActionPerformed(ActionEvent evt) {
		System.out.println("btnAceptar.actionPerformed, event="+evt);
		//TODO add your code for btnAceptar.actionPerformed
		String r = this.auc.siguienteAltaUsuario2(txtPartido.getText(), txtProvincia.getText(), txtLocalidad.getText()
				, txtCalle.getText(), txtNumero.getText(), txtPiso.getText(), txtDpto.getText(), txtCP.getText(), txtTelefono.getText()
				, txtCelular.getText(), cmbCompanias.getSelectedItem().toString(), txtEmail.getText());
		if(r!=null){
			JOptionPane.showMessageDialog(null, r);
		}
		else{
			new AltaUsuario3Frame(this.auc).setVisible(true);
			this.dispose();
		}
	}

}
