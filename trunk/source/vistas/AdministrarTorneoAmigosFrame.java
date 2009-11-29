package vistas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle;
import javax.swing.WindowConstants;

import logica.Torneo;
import controlador.AdministrarTorneoAmigosControlador;

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
public class AdministrarTorneoAmigosFrame extends javax.swing.JInternalFrame {
	private JLabel lblNombreTorneo;
	private JLabel lblPostulados;
	private JList listParticipantes;
	private JScrollPane jScrollPane2;
	private JButton btnRechazar;
	private JComboBox cmbTorneos;
	private JButton btnFinalizar;
	private JButton btnAceptar;
	private JList listPostulados;
	private JLabel lblParticipantes;

	private DefaultListModel listPostuladosModel;
	private DefaultListModel listParticipantesModel;

	private AdministrarTorneoAmigosControlador atac;
	private JScrollPane jScrollPane1;



	public AdministrarTorneoAmigosFrame(AdministrarTorneoAmigosControlador c) {
		super("Administrar torneo de amigos", true, true, true, true);
		this.atac=c;
		initGUI();
	}

	private void initGUI() {
		try {
			GroupLayout thisLayout = new GroupLayout(getContentPane());
			getContentPane().setLayout(thisLayout);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			{
				lblNombreTorneo = new JLabel();
				lblNombreTorneo.setText("Nombre del torneo:");
			}
			{
				lblPostulados = new JLabel();
				lblPostulados.setText("Equipos postulados");
			}
			{
				jScrollPane1 = new JScrollPane();
				jScrollPane1.setAutoscrolls(true);
				{
					listPostuladosModel = new DefaultListModel();
					listPostulados = new JList();
					jScrollPane1.setViewportView(listPostulados);
					listPostulados.setModel(listPostuladosModel);
					//listPostulados.setModel(listPostuladosModel);
					//listPostulados.setSize(250, 50);
				}
			}
			{
				lblParticipantes = new JLabel();
				lblParticipantes.setText("Equipos participantes");
			}
			{
				jScrollPane2 = new JScrollPane();
				{
					listParticipantesModel = new DefaultListModel();
					listParticipantes = new JList();
					jScrollPane2.setViewportView(listParticipantes);
					listParticipantes.setModel(listParticipantesModel);
				}
			}
			{
				btnAceptar = new JButton();
				btnAceptar.setText("Aceptar peticion");
				btnAceptar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						System.out.println("btnAceptar.actionPerformed, event="+evt);
						String e = (String) listPostulados.getSelectedValue();
						atac.aceptarPostulado(e, (Torneo)cmbTorneos.getSelectedItem());
						JOptionPane.showMessageDialog(null, "Se ha aceptado el equipo exitosamente");
						atac.refreshTorneo((Torneo) cmbTorneos.getSelectedItem());
					}
				});
			}
			{
				btnRechazar = new JButton();
				btnRechazar.setText("Rechazar peticion");
				btnRechazar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						System.out.println("btnRechazar.actionPerformed, event="+evt);
						//						Equipo e = null;
						//						e = (Equipo) listPostuladosModel.getElementAt(listPostulados.getSelectedIndex());
						//(Equipo) listPostulados.getSelectedValue();
						String e = (String) listPostulados.getSelectedValue();
						atac.rechazarPostulado(e, (Torneo)cmbTorneos.getSelectedItem());
						JOptionPane.showMessageDialog(null, "Se ha rechazado el equipo exitosamente");
						atac.refreshTorneo((Torneo) cmbTorneos.getSelectedItem());
					}}



				);
			}
			{
				btnFinalizar = new JButton();
				btnFinalizar.setText("Finalizar");
				btnFinalizar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						System.out.println("btnFinalizar.actionPerformed, event="+evt);
						dispose();
					}
				});
			}
			{

				cmbTorneos = new JComboBox(atac.cargarTorneosCreados());
				cmbTorneos.setSelectedItem(null);
				cmbTorneos.addActionListener(new ActionListener() {	
					public void actionPerformed(ActionEvent evt) {
						System.out.println("cmbTorneos.actionPerformed, event="+evt);
						atac.refreshTorneo((Torneo) cmbTorneos.getSelectedItem());

					}

				});
				//cmbTorneos.setModel(cmbTorneosModel);
				//cmbTorneos.addItem(anObject)
			}
			thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(cmbTorneos, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblNombreTorneo, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(21)
							.addComponent(lblPostulados, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
									.addComponent(btnAceptar, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
									.addComponent(btnRechazar, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
									.addGap(20)
									.addComponent(lblParticipantes, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
									.addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
									.addGap(28)
									.addComponent(btnFinalizar, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
									.addContainerGap(21, Short.MAX_VALUE));
			thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(thisLayout.createParallelGroup()
							.addGroup(thisLayout.createSequentialGroup()
									.addGroup(thisLayout.createParallelGroup()
											.addComponent(lblPostulados, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE)
											.addComponent(lblParticipantes, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE)
											.addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
													.addGap(36)
													.addComponent(btnRechazar, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)))
													.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
													.addGroup(thisLayout.createParallelGroup()
															.addGroup(thisLayout.createSequentialGroup()
																	.addComponent(btnAceptar, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE))
																	.addGroup(thisLayout.createSequentialGroup()
																			.addComponent(btnFinalizar, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE))))
																			.addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
																					.addComponent(lblNombreTorneo, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
																					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
																					.addComponent(cmbTorneos, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE))
																					.addGroup(thisLayout.createSequentialGroup()
																							.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 343, GroupLayout.PREFERRED_SIZE))
																							.addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
																									.addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 343, GroupLayout.PREFERRED_SIZE)))
																									.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
			pack();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public JList getListParticipantes() {
		return listParticipantes;
	}

	//	public void setListParticipantes(JList listParticipantes) {
	//		this.listParticipantes = listParticipantes;
	//	}

	public JComboBox getCmbTorneos() {
		return cmbTorneos;
	}

	//	public void setCmbTorneos(JComboBox cmbTorneos) {
	//		this.cmbTorneos = cmbTorneos;
	//	}

	public JList getListPostulados() {
		return listPostulados;
	}

	public DefaultListModel getListPostuladosModel() {
		return listPostuladosModel;
	}

	public void setListPostuladosModel(DefaultListModel listPostuladosModel) {
		this.listPostuladosModel = listPostuladosModel;
	}

	public DefaultListModel getListParticipantesModel() {
		return listParticipantesModel;
	}

	public void setListParticipantesModel(DefaultListModel listParticipantesModel) {
		this.listParticipantesModel = listParticipantesModel;
	}

	//	public void setListPostulados(JList listPostulados) {
	//		this.listPostulados = listPostulados;
	//	}

}
