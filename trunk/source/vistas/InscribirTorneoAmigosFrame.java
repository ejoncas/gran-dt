package vistas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.ListModel;
import javax.swing.WindowConstants;

import logica.Torneo;
import controlador.InscribirTorneoAmigosControlador;


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
public class InscribirTorneoAmigosFrame extends javax.swing.JInternalFrame {
	private JLabel lblSeleccione;
	private JRadioButton jrbDuenio;
	private JRadioButton jrbNombre;
	private JTextField txtBuscar;
	private JScrollPane jScrollPane1;
	private JButton btnCancelar;
	private JButton btnPostularse;
	private JList listEncontrados;
	private JButton btnBuscar;
	private DefaultListModel listEncontradosModel;


	private InscribirTorneoAmigosControlador itac;

	public InscribirTorneoAmigosControlador getControlador() {
		return itac;
	}

	public void setControlador(InscribirTorneoAmigosControlador c) {
		this.itac = c;
	}


	public InscribirTorneoAmigosFrame() {
		super("Inscribir en torneo de amigos", true, true, true, true);
		initGUI();
	}

	private void initGUI() {
		try {
			GroupLayout thisLayout = new GroupLayout(getContentPane());
			getContentPane().setLayout(thisLayout);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			{
				lblSeleccione = new JLabel();
				lblSeleccione.setText("Seleccione el criterio de busqueda para el torneo:");
			}
			{
				jrbDuenio = new JRadioButton();
				jrbDuenio.setText("Buscar por dueno");
				jrbDuenio.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						System.out.println("jrbDuenio.actionPerformed, event="+evt);
						if (jrbDuenio.isSelected())
							jrbNombre.setSelected(false);

					}
				});
			}
			{
				jrbNombre = new JRadioButton();
				jrbNombre.setText("Buscar por nombre del torneo");
				jrbNombre.setSelected(true);
				jrbNombre.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						System.out.println("jrbNombre.actionPerformed, event="+evt);
						if (jrbNombre.isSelected())
							jrbDuenio.setSelected(false);
					}
				});
			}
			{
				txtBuscar = new JTextField();
				txtBuscar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						System.out.println("txtBuscar.actionPerformed, event="+evt);
					}
				});
			}
			{
				btnBuscar = new JButton();
				btnBuscar.setText("Buscar");
				btnBuscar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						listEncontradosModel.removeAllElements();

						System.out.println("btnBuscar.actionPerformed, event="+evt);
						String busqueda = null;
						busqueda = txtBuscar.getText();
						if (jrbDuenio.isSelected()){ // buscar por duenio
							itac.buscarTorneosPorDuenio(busqueda);

						}
						else{
							if (jrbNombre.isSelected()){ // buscar por nombre del torneo
								itac.buscarTorneosPorNombre(busqueda);								
							}

						}
					}
				});
			}
			{
				jScrollPane1 = new JScrollPane();
				{
					listEncontradosModel = 
						new DefaultListModel();
					listEncontrados = new JList();
					jScrollPane1.setViewportView(listEncontrados);
					listEncontrados.setModel(listEncontradosModel);
				}
			}
			{
				btnPostularse = new JButton();
				btnPostularse.setText("Postularse");
				btnPostularse.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						System.out.println("btnPostularse.actionPerformed, event="+evt);
						String r=null;
						Torneo t = null;
						t = (Torneo) listEncontrados.getSelectedValue();
						r = itac.postularse(t);
						if(r!=null)	
							JOptionPane.showMessageDialog(null, r);
						else{
							JOptionPane.showMessageDialog(null, "Se ha postulado exitosamente");
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
						System.out.println("btnCancelar.actionPerformed, event="+evt);
						setDefaultCloseOperation(EXIT_ON_CLOSE);	
						dispose();
					}
				});
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
					.addGap(19)
					.addComponent(jScrollPane1, 0, 129, Short.MAX_VALUE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 0, GroupLayout.PREFERRED_SIZE)
					.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(btnPostularse, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnCancelar, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
							.addContainerGap());
			thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(thisLayout.createParallelGroup()
							.addGroup(thisLayout.createSequentialGroup()
									.addComponent(lblSeleccione, GroupLayout.PREFERRED_SIZE, 359, GroupLayout.PREFERRED_SIZE)
									.addGap(0, 0, Short.MAX_VALUE))
									.addGroup(thisLayout.createSequentialGroup()
											.addComponent(jrbDuenio, GroupLayout.PREFERRED_SIZE, 359, GroupLayout.PREFERRED_SIZE)
											.addGap(0, 0, Short.MAX_VALUE))
											.addGroup(thisLayout.createSequentialGroup()
													.addComponent(jrbNombre, GroupLayout.PREFERRED_SIZE, 359, GroupLayout.PREFERRED_SIZE)
													.addGap(0, 0, Short.MAX_VALUE))
													.addGroup(thisLayout.createSequentialGroup()
															.addComponent(txtBuscar, GroupLayout.PREFERRED_SIZE, 359, GroupLayout.PREFERRED_SIZE)
															.addGap(0, 0, Short.MAX_VALUE))
															.addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
																	.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 353, GroupLayout.PREFERRED_SIZE)
																	.addGap(0, 6, Short.MAX_VALUE))
																	.addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
																			.addGap(97)
																			.addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
																			.addGroup(thisLayout.createParallelGroup()
																					.addGroup(thisLayout.createSequentialGroup()
																							.addComponent(btnBuscar, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
																							.addGap(0, 0, Short.MAX_VALUE))
																							.addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
																									.addGap(13)
																									.addComponent(btnPostularse, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
																									.addGap(0, 6, Short.MAX_VALUE)))))
																									.addContainerGap(30, 30));
			pack();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//	public JList getListEncontrados() {
	//		return listEncontrados;
	//	}
	//
	//	public void setListEncontrados(JList listEncontrados) {
	//		this.listEncontrados = listEncontrados;
	//	}

	public DefaultListModel getListEncontradosModel() {
		return this.listEncontradosModel;
	}

	public void setListEncontradosModel(ListModel listEncontradosModel) {
		this.listEncontradosModel = (DefaultListModel) listEncontradosModel;
	}



}
