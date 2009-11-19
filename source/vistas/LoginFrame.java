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
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

import controlador.AltaUsuarioControlador;
import controlador.LoginControlador;


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
public class LoginFrame extends javax.swing.JFrame {

	{
		//Set Look & Feel
		try {
			javax.swing.UIManager.setLookAndFeel("com.jgoodies.looks.plastic.Plastic3DLookAndFeel");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	private JLabel lblTipoDoc;
	private JLabel lblNroDoc;
	private JPasswordField jPasswordField1;
	private JButton btnIngresar;
	private JButton btnCancelar;
	private JLabel lblNoRegistrado;
	private JButton btnRegistrarse;
	private JLabel lblIngrese;
	private JLabel lblPassword;
	private JTextField txtNroDoc;
	private JComboBox cmbTipoDoc;	

	private final LoginControlador lc;

	/**
	 * Auto-generated main method to display this JFrame
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				LoginFrame inst = new LoginFrame(new LoginControlador());
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}

	public LoginFrame(LoginControlador c) {
		super();
		this.lc=c;
		initGUI();
	}

	private void initGUI() {
		try {
			GroupLayout thisLayout = new GroupLayout(getContentPane());
			getContentPane().setLayout(thisLayout);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			{
				lblTipoDoc = new JLabel();
				lblTipoDoc.setText("Tipo doc:");
			}
			{
				lblNroDoc = new JLabel();
				lblNroDoc.setText("Nro doc:");
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
				lblPassword = new JLabel();
				lblPassword.setText("Contrasena:");
			}
			{
				jPasswordField1 = new JPasswordField();
			}
			{
				lblIngrese = new JLabel();
				lblIngrese.setText("Ingrese sus datos:");
			}
			{
				lblNoRegistrado = new JLabel();
				lblNoRegistrado.setText("No est‡ registrado?");
			}
			{
				btnRegistrarse = new JButton();
				btnRegistrarse.setText("Registrarse");
				btnRegistrarse.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						System.out.println("btnRegistrarse.actionPerformed, event="+evt);
						new AltaUsuario1Frame(new AltaUsuarioControlador()).setVisible(true);
						dispose();					}
				});
			}
			{
				btnIngresar = new JButton();
				btnIngresar.setText("Ingresar");
				btnIngresar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						System.out.println("btnIngresar.actionPerformed, event="+evt);
						String r = lc.validarLogin(cmbTipoDoc.getSelectedItem().toString(), txtNroDoc.getText(), jPasswordField1.getText());
						if(r!=null)	// si hubo algun problema
							JOptionPane.showMessageDialog(null, r); // muestra el mensaje de error correspondiente
						else{
							String r2 = lc.loguearUsuario(cmbTipoDoc.getSelectedItem().toString(), txtNroDoc.getText(), jPasswordField1.getText());
							if (r2!=null) // si devolvio algun error
								JOptionPane.showMessageDialog(null, r2); //imprime el error
							else {// si devolvio null, todo ok \u00a9 es el caracter unicode del copyright
								JOptionPane.showMessageDialog(null, "Bienvenido al GranDT!\n\n \u00a9by Jonatan y Candelas");
								dispose(); // cierra la ventana
							}
						}

					}
				});
			}



			{
				btnCancelar = new JButton();
				btnCancelar.setText("Cancelar");
				btnCancelar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						System.out.println("btnCancelar.actionPerformed, event="+evt);
						dispose();
						setDefaultCloseOperation(EXIT_ON_CLOSE);

					}
				});
			}
			thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
				.addGap(6)
				.addComponent(lblIngrese, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(cmbTipoDoc, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(lblTipoDoc, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(txtNroDoc, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(lblNroDoc, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(jPasswordField1, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
				    .addComponent(lblPassword, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(btnIngresar, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(btnCancelar, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(lblNoRegistrado, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 0, Short.MAX_VALUE)
				.addComponent(btnRegistrarse, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				.addContainerGap());
			thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
				.addContainerGap()
				.addGroup(thisLayout.createParallelGroup()
				    .addGroup(thisLayout.createSequentialGroup()
				        .addGroup(thisLayout.createParallelGroup()
				            .addComponent(lblPassword, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
				            .addComponent(lblNroDoc, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
				            .addComponent(lblTipoDoc, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
				        .addGap(22)
				        .addGroup(thisLayout.createParallelGroup()
				            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                .addComponent(jPasswordField1, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)
				                .addGap(0, 10, Short.MAX_VALUE))
				            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                .addComponent(txtNroDoc, 0, 202, Short.MAX_VALUE)
				                .addGap(10))
				            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                .addComponent(cmbTipoDoc, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				                .addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
				                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				                .addComponent(btnIngresar, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
				                .addGap(0, 0, Short.MAX_VALUE))))
				    .addGroup(thisLayout.createSequentialGroup()
				        .addPreferredGap(lblPassword, lblIngrese, LayoutStyle.ComponentPlacement.INDENT)
				        .addGroup(thisLayout.createParallelGroup()
				            .addGroup(thisLayout.createSequentialGroup()
				                .addComponent(lblIngrese, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE)
				                .addGap(0, 0, Short.MAX_VALUE))
				            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                .addComponent(lblNoRegistrado, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
				                .addGap(0, 26, Short.MAX_VALUE))
				            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                .addPreferredGap(lblIngrese, btnRegistrarse, LayoutStyle.ComponentPlacement.INDENT)
				                .addComponent(btnRegistrarse, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
				                .addGap(0, 62, Short.MAX_VALUE)))
				        .addGap(136)))
				.addContainerGap(23, 23));
			pack();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
