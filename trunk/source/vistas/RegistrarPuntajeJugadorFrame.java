package vistas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.LayoutStyle;

import controlador.RegistrarPuntajeJugadorControlador;

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
public class RegistrarPuntajeJugadorFrame extends javax.swing.JInternalFrame {
	private JPanel panel;
	private JButton btnCancelar;
	private JScrollPane jScrollPane1;
	private JButton btnConfirmar;
	private JTable tableJugadores;
	private RegistrarPuntajeJugadorControlador rpjc;

	public RegistrarPuntajeJugadorFrame() {
		super("Editar Puntajes", true, true ,true);
		initGUI();
	}

	private void initGUI() {
		try {
			this.setBounds(0, 0, 400, 533);
			GroupLayout thisLayout = new GroupLayout(getContentPane());
			getContentPane().setLayout(thisLayout);
			{
				panel = new JPanel();
				GroupLayout panelLayout = new GroupLayout(panel);
				panel.setLayout(panelLayout);
				{
					jScrollPane1 = new JScrollPane();
					{

						tableJugadores = new JTable();
						jScrollPane1.setViewportView(tableJugadores);
					}
				}
				{
					btnCancelar = new JButton();
					btnCancelar.setText("Cancelar");
					btnCancelar.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							System.out.println("btnCancelar.actionPerformed, event="+evt);
							dispose();
						}
					});
				}
				{
					btnConfirmar = new JButton();
					btnConfirmar.setText("Confirmar");
					btnConfirmar.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							btnConfirmarActionPerformed(evt);
						}
					});
				}
				panelLayout.setHorizontalGroup(panelLayout.createSequentialGroup()
						.addContainerGap()
						.addGroup(panelLayout.createParallelGroup()
								.addGroup(panelLayout.createSequentialGroup()
										.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 374, GroupLayout.PREFERRED_SIZE)
										.addGap(0, 0, Short.MAX_VALUE))
										.addGroup(GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
												.addGap(0, 148, Short.MAX_VALUE)
												.addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED, 1, GroupLayout.PREFERRED_SIZE)
												.addComponent(btnConfirmar, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)))
												.addContainerGap());
				panelLayout.setVerticalGroup(panelLayout.createSequentialGroup()
						.addContainerGap()
						.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 499, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(btnConfirmar, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnCancelar, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
								.addContainerGap());
			}
			thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
					.addComponent(panel, 0, 548, Short.MAX_VALUE));
			thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
					.addComponent(panel, 0, 398, Short.MAX_VALUE));
			pack();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public JTable getTableJugadores() {
		return tableJugadores;
	}

	public void setControlador(RegistrarPuntajeJugadorControlador rpjc) {
		this.rpjc = rpjc;
	}

	private void btnConfirmarActionPerformed(ActionEvent evt) {
		System.out.println("btnConfirmar.actionPerformed, event="+evt);
		this.rpjc.guardarNuevosPuntajes();
		this.dispose();
	}

}
