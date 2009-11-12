package vistas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SwingUtilities;
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
public class AltaUsuario1Frame extends javax.swing.JFrame {
	private JLabel lblNombre;
	private JTextField txtNombre;
	private JSeparator lineSeparator;
	private JTextField txtNroDoc;
	private JLabel lblNacimiento;
	private JLabel lblNroDoc;
	private JComboBox cmbTipoDoc;
	private JLabel Documento;
	private JRadioButton radioMasculino;
	private JLabel lblSexo;
	private JRadioButton radioFemenino;
	private JTextField txtApellido;
	private JButton btnAceptar;
	private JButton btnCancelar;
	private JTextField txtHincha;
	private JLabel lblHincha;
	private JComboBox cmbAnios;
	private JComboBox cmbMeses;
	private JComboBox cmbDias;
	private JLabel Apellido;
	private final AltaUsuarioControlador auc;


	/**
	 * Auto-generated main method to display this JFrame
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				AltaUsuario1Frame inst = new AltaUsuario1Frame(new AltaUsuarioControlador());
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}

	public AltaUsuario1Frame(AltaUsuarioControlador a) {
		super();
		this.auc=a;
		initGUI();
	}

	private void initGUI() {
		try {
			GroupLayout thisLayout = new GroupLayout(getContentPane());
			getContentPane().setLayout(thisLayout);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			this.setTitle("Alta Usuario - Datos Personales(1 de 3)");
			{
				lblNombre = new JLabel();
				lblNombre.setText("Nombre");
			}
			{
				txtNombre = new JTextField();
			}
			{
				Apellido = new JLabel();
				Apellido.setText("Apellido");
			}
			{
				txtApellido = new JTextField();
			}
			{
				radioFemenino = new JRadioButton();
				radioFemenino.setText("Femenino");
			}
			{
				lblSexo = new JLabel();
				lblSexo.setText("Sexo");
			}
			{
				radioMasculino = new JRadioButton();
				radioMasculino.setText("Masculino");
			}
			{
				Documento = new JLabel();
				Documento.setText("Tipo Doc");
			}
			{
				ComboBoxModel cmbTipoDocModel = 
					new DefaultComboBoxModel(
							new String[] { "DNI", "LCI", "LCE" });
				cmbTipoDoc = new JComboBox();
				cmbTipoDoc.setModel(cmbTipoDocModel);
			}
			{
				txtNroDoc = new JTextField();
			}
			{
				lblNroDoc = new JLabel();
				lblNroDoc.setText("Numero Doc");
			}
			{
				lblNacimiento = new JLabel();
				lblNacimiento.setText("Nacimiento");
			}
			{
				Vector<Integer> dias = new Vector<Integer>();
				for(int i = 1; i<32; i++){
					dias.add(i);
				}
				cmbDias = new JComboBox(dias);
			}
			{
				Vector<Integer> meses = new Vector<Integer>();
				for(int i=1; i<13; i++){
					meses.add(i);
				}
				cmbMeses = new JComboBox(meses);
			}
			{
				Vector<Integer> anios = new Vector<Integer>();
				for(int i=1; i<100; ++i){
					anios.add(java.util.GregorianCalendar.getInstance().get(java.util.GregorianCalendar.YEAR)-i);
				}
				cmbAnios = new JComboBox(anios);
			}
			{
				lblHincha = new JLabel();
				lblHincha.setText("Hincha de");
			}
			{
				txtHincha = new JTextField();
				txtHincha.setText("Equipo");
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
			}
			thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(txtNombre, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblNombre, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(21)
							.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
									.addComponent(txtApellido, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(Apellido, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
									.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
											.addComponent(radioFemenino, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
											.addComponent(lblSexo, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
											.addComponent(radioMasculino, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
											.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
											.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
													.addComponent(cmbTipoDoc, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
													.addComponent(Documento, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
													.addComponent(txtNroDoc, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
													.addComponent(lblNroDoc, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
													.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
													.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
															.addComponent(cmbDias, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
															.addComponent(lblNacimiento, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
															.addComponent(cmbMeses, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
															.addComponent(cmbAnios, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
															.addGap(16)
															.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
																	.addComponent(txtHincha, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
																	.addComponent(lblHincha, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
																	.addGap(32)
																	.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
																			.addComponent(btnAceptar, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
																			.addComponent(btnCancelar, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
																			.addContainerGap());
			thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(thisLayout.createParallelGroup()
							.addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
									.addComponent(lblHincha, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED))
									.addComponent(lblNacimiento, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
									.addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
											.addComponent(Documento, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED))
											.addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
													.addComponent(lblSexo, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
													.addGap(36))
													.addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
															.addComponent(Apellido, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
															.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED))
															.addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
																	.addComponent(lblNombre, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
																	.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)))
																	.addGap(7)
																	.addGroup(thisLayout.createParallelGroup()
																			.addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
																					.addComponent(txtHincha, GroupLayout.PREFERRED_SIZE, 282, GroupLayout.PREFERRED_SIZE)
																					.addGap(0, 6, Short.MAX_VALUE))
																					.addGroup(thisLayout.createSequentialGroup()
																							.addGroup(thisLayout.createParallelGroup()
																									.addComponent(cmbDias, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
																									.addComponent(cmbTipoDoc, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
																									.addGap(12)
																									.addGroup(thisLayout.createParallelGroup()
																											.addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
																													.addComponent(btnCancelar, 0, 110, Short.MAX_VALUE)
																													.addGap(97))
																													.addGroup(thisLayout.createSequentialGroup()
																															.addGroup(thisLayout.createParallelGroup()
																																	.addComponent(lblNroDoc, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
																																	.addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
																																			.addComponent(cmbMeses, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
																																			.addGap(9)))
																																			.addGap(18)
																																			.addGroup(thisLayout.createParallelGroup()
																																					.addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
																																							.addComponent(cmbAnios, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
																																							.addGap(0, 9, Short.MAX_VALUE))
																																							.addGroup(thisLayout.createSequentialGroup()
																																									.addComponent(txtNroDoc, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
																																									.addGap(0, 0, Short.MAX_VALUE)))))
																																									.addGap(9))
																																									.addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
																																											.addComponent(radioFemenino, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
																																											.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
																																											.addComponent(radioMasculino, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
																																											.addGap(0, 0, Short.MAX_VALUE)
																																											.addComponent(btnAceptar, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE))
																																											.addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
																																													.addComponent(txtApellido, GroupLayout.PREFERRED_SIZE, 279, GroupLayout.PREFERRED_SIZE)
																																													.addGap(0, 9, Short.MAX_VALUE))
																																													.addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
																																															.addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, 279, GroupLayout.PREFERRED_SIZE)
																																															.addGap(0, 9, Short.MAX_VALUE)))
																																															.addContainerGap());
			pack();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void btnAceptarActionPerformed(ActionEvent evt) {
		System.out.println("btnAceptar.actionPerformed, event="+evt);
		//TODO add your code for btnAceptar.actionPerformed
		// TODO implementar regla de ventana que no permita que los dos esten seleccionados y que uno de los dos siempre este seleccionado
		String r = auc.siguienteAltaUsuario1(txtNombre.getText(), txtApellido.getText(),
				radioFemenino.isSelected() ? "F" : "M", cmbTipoDoc.getSelectedItem().toString(), 
						Integer.parseInt(txtNroDoc.getText()), cmbDias.getSelectedIndex()+1, cmbMeses.getSelectedIndex()+1, 
						Integer.parseInt(cmbAnios.getSelectedItem().toString()), txtHincha.getText());
		//we show an error message if it exists or we close this windows and create de following frame
		if(r!=null)	
			JOptionPane.showMessageDialog(null, r);
		else{
			new AltaUsuario2Frame(this.auc).setVisible(true);
			this.dispose();
		}
	}

}
