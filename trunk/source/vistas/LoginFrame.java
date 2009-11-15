package vistas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;

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
			GroupLayout thisLayout = new GroupLayout((JComponent)getContentPane());
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
				lblPassword.setText("Contrase–a:");
			}
			{
				jPasswordField1 = new JPasswordField();
			}
			{
				lblIngrese = new JLabel();
				lblIngrese.setText("Ingrese sus datos:");
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
							else {// si devolvio null, todo ok
								JOptionPane.showMessageDialog(null, "");
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
				    .addComponent(jPasswordField1, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(lblPassword, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(btnIngresar, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(btnCancelar, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
				.addContainerGap(17, 17));
			thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
				.addContainerGap()
				.addGroup(thisLayout.createParallelGroup()
				    .addGroup(thisLayout.createSequentialGroup()
				        .addGroup(thisLayout.createParallelGroup()
				            .addComponent(lblTipoDoc, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
				            .addComponent(lblNroDoc, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
				            .addComponent(lblPassword, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
				        .addGap(22)
				        .addGroup(thisLayout.createParallelGroup()
				            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                .addComponent(cmbTipoDoc, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				                .addGap(0, 48, Short.MAX_VALUE))
				            .addGroup(thisLayout.createSequentialGroup()
				                .addComponent(txtNroDoc, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
				                .addGap(0, 0, Short.MAX_VALUE))
				            .addGroup(thisLayout.createSequentialGroup()
				                .addComponent(jPasswordField1, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
				                .addGap(0, 0, Short.MAX_VALUE)))
				        .addGap(18))
				    .addGroup(thisLayout.createSequentialGroup()
				        .addPreferredGap(lblTipoDoc, lblIngrese, LayoutStyle.ComponentPlacement.INDENT)
				        .addGroup(thisLayout.createParallelGroup()
				            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                .addComponent(lblIngrese, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE)
				                .addGap(0, 66, Short.MAX_VALUE))
				            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                .addGap(61)
				                .addComponent(btnCancelar, 0, 91, Short.MAX_VALUE)
				                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				                .addComponent(btnIngresar, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)))))
				.addContainerGap(20, 20));
			pack();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
