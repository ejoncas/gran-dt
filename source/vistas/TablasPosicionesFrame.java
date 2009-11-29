package vistas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.LayoutStyle;
import javax.swing.WindowConstants;

import logica.Torneo;
import controlador.TablaPosicionesControlador;

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
public class TablasPosicionesFrame extends javax.swing.JInternalFrame {
	private JButton btnAceptar;
	private JScrollPane jScrollPane1;
	private JLabel lblSeleccioneTorneo;
	private JComboBox cmbTorneo;
	private JTable tableEquipos;
	private JLabel lblTitulo;
	private TablaPosicionesControlador tpc;



	public TablasPosicionesFrame() {
		super("Generar tablas de posiciones", true, true, true, true);
		initGUI();
	}

	private void initGUI() {
		try {
			GroupLayout thisLayout = new GroupLayout(getContentPane());
			getContentPane().setLayout(thisLayout);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			{
				btnAceptar = new JButton();
				btnAceptar.setText("Aceptar");
				btnAceptar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						System.out.println("btnAceptar.actionPerformed, event="+evt);
						dispose();
					}
				});
			}
			{
				jScrollPane1 = new JScrollPane();
				{
					tableEquipos = new JTable();
					jScrollPane1.setViewportView(tableEquipos);
				}
			}
			{
				cmbTorneo = new JComboBox();	
				cmbTorneo.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						cmbTorneoActionPerformed(evt);
					}
				});
			}
			{
				lblSeleccioneTorneo = new JLabel();
				lblSeleccioneTorneo.setText("Seleccione el Torneo:");
			}
			{
				lblTitulo = new JLabel();
				lblTitulo.setText("Equipos ordenados por puntaje:");
			}
			thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(cmbTorneo, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblSeleccioneTorneo, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
							.addComponent(lblTitulo, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 307, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(btnAceptar, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(29, Short.MAX_VALUE));
			thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(thisLayout.createParallelGroup()
							.addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
									.addComponent(lblTitulo, GroupLayout.PREFERRED_SIZE, 341, GroupLayout.PREFERRED_SIZE)
									.addGap(0, 0, Short.MAX_VALUE))
									.addComponent(jScrollPane1, GroupLayout.Alignment.LEADING, 0, 367, Short.MAX_VALUE)
									.addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
											.addComponent(lblSeleccioneTorneo, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
											.addGroup(thisLayout.createParallelGroup()
													.addComponent(cmbTorneo, GroupLayout.Alignment.LEADING, 0, 171, Short.MAX_VALUE)
													.addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
															.addGap(106)
															.addComponent(btnAceptar, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
															.addGap(0, 0, Short.MAX_VALUE)))))
															.addContainerGap());
			pack();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public JTable getTableEquipos() {
		return tableEquipos;
	}

	public void setControlador(TablaPosicionesControlador mec){
		this.tpc = mec;
	}

	public JComboBox getCmbTorneo() {
		return cmbTorneo;
	}

	private void cmbTorneoActionPerformed(ActionEvent evt) {
		System.out.println("cmbTorneo.actionPerformed, event="+evt);
		this.tpc.getPosiciones((Torneo)this.cmbTorneo.getSelectedItem());
	}

}
