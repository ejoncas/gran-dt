package vistas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.LayoutStyle;
import javax.swing.WindowConstants;

import logica.Jugador;
import controlador.ArmarEquipoControlador;


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
public class ArmarEquipoFrame2 extends javax.swing.JFrame {
	private JSeparator separatorJugadores;
	private JPanel pnlJugadores;
	private JScrollPane jScrollPane1;
	private JPanel panelEquipoT;
	private JScrollPane jScrollPane2;
	private JLabel lblMG;
	private JLabel lblMD;
	private JLabel lblMontoG;
	private JLabel lblMontoD;
	private JButton btnCancelar;
	private JButton btnConfirmar;
	private JButton btnQuitarT;
	private JButton btnQuitarS;
	private JButton btnAgregarT;
	private JButton btnAgregarS;
	private JScrollPane jScrollPane3;
	private JTable tableEquipoS;
	private JPanel panelEquipoS;
	private JSeparator separatorEquipoS;
	private JTable tableEquipoT;
	private JSeparator separatorEquipoT;
	private JTable tableJugadores;
	//TODO link the TableModels with the controller
	private JugadorTableModel tableJugadoresModel;
	private JugadorTableModel tableEquipoTModel;
	private JugadorTableModel tableEquipoSModel;
	//referencia al controlador
	private ArmarEquipoControlador aec;



	public ArmarEquipoControlador getControlador() {
		return aec;
	}

	public void setControlador(ArmarEquipoControlador aec) {
		this.aec = aec;
	}

	/**
	 * Auto-generated main method to display this JFrame
	 */
	//	public static void main(String[] args) {
	//		SwingUtilities.invokeLater(new Runnable() {
	//			public void run() {
	//
	//				ArmarEquipoFrame2 inst = new ArmarEquipoFrame2();
	//				inst.setLocationRelativeTo(null);
	//				inst.setVisible(true);
	//			}
	//		});
	//	}



	public ArmarEquipoFrame2() {
		super();
		//creamos las listas vacias
		this.tableJugadoresModel=new JugadorTableModel();
		this.tableEquipoSModel=new JugadorTableModel();
		this.tableEquipoTModel= new JugadorTableModel();
		initGUI();
	}

	public ArmarEquipoFrame2(JugadorTableModel j, JugadorTableModel et, JugadorTableModel es) {
		super();
		//Creamos las tablas cargadas
		this.tableJugadoresModel=j;
		this.tableEquipoSModel=es;
		this.tableEquipoTModel=et;
		initGUI();
	}

	private void initGUI() {
		try {
			GroupLayout thisLayout = new GroupLayout(getContentPane());
			getContentPane().setLayout(thisLayout);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			this.setTitle("Armar Equipo");
			{
				separatorJugadores = new JSeparator();
				separatorJugadores.setBorder(BorderFactory.createTitledBorder("JUGADORES"));
				{
					pnlJugadores = new JPanel();
					GroupLayout pnlJugadoresLayout = new GroupLayout(pnlJugadores);
					pnlJugadores.setLayout(pnlJugadoresLayout);
					separatorJugadores.add(pnlJugadores);
					pnlJugadores.setBounds(5, 20, 413, 376);
					{
						jScrollPane1 = new JScrollPane();
						{
							tableJugadores = new JTable();

							//we configure the table
							tableJugadores.setAutoCreateColumnsFromModel(true);
							tableJugadores.setModel(tableJugadoresModel);
							tableJugadores.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
							tableJugadores.setRowSelectionAllowed(true);

							jScrollPane1.setViewportView(tableJugadores);
							//tableJugadores.setPreferredSize(new java.awt.Dimension(386, 121));
							//tableJugadores.setPreferredSize(new java.awt.Dimension(375, 32));

						}
					}
					{
						lblMontoD = new JLabel();
						lblMontoD.setText("Monto Disponible");
					}
					{
						lblMontoG = new JLabel();
						lblMontoG.setText("Monto Gastado");
					}
					{
						lblMD = new JLabel();
						lblMD.setText("$<>");
					}
					{
						lblMG = new JLabel();
						lblMG.setText("$<>");
					}
					{
						btnAgregarS = new JButton();
						btnAgregarS.setText("Agregar Suplente ->");
						btnAgregarS.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								btnAgregarSActionPerformed(evt);
							}
						});
					}
					{
						btnAgregarT = new JButton();
						btnAgregarT.setText("Agregar Titular ->");
						btnAgregarT.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								btnAgregarTActionPerformed(evt);
							}
						});
					}
					pnlJugadoresLayout.setHorizontalGroup(pnlJugadoresLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(pnlJugadoresLayout.createParallelGroup()
									.addGroup(pnlJugadoresLayout.createSequentialGroup()
											.addGroup(pnlJugadoresLayout.createParallelGroup()
													.addComponent(lblMontoD, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
													.addComponent(lblMontoG, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE))
													.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
													.addGroup(pnlJugadoresLayout.createParallelGroup()
															.addComponent(lblMD, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
															.addComponent(lblMG, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE))
															.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
															.addGroup(pnlJugadoresLayout.createParallelGroup()
																	.addGroup(pnlJugadoresLayout.createSequentialGroup()
																			.addComponent(btnAgregarS, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
																			.addGap(0, 0, Short.MAX_VALUE))
																			.addComponent(btnAgregarT, GroupLayout.Alignment.LEADING, 0, 171, Short.MAX_VALUE)))
																			.addGroup(pnlJugadoresLayout.createSequentialGroup()
																					.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 389, GroupLayout.PREFERRED_SIZE)
																					.addGap(0, 0, Short.MAX_VALUE)))
																					.addContainerGap());
					pnlJugadoresLayout.setVerticalGroup(pnlJugadoresLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 299, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(pnlJugadoresLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
									.addComponent(btnAgregarT, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblMD, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblMontoD, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGroup(pnlJugadoresLayout.createParallelGroup()
											.addGroup(GroupLayout.Alignment.LEADING, pnlJugadoresLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
													.addComponent(lblMontoG, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
													.addComponent(lblMG, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
													.addGroup(GroupLayout.Alignment.LEADING, pnlJugadoresLayout.createSequentialGroup()
															.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
															.addComponent(btnAgregarS, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
															.addGap(0, 0, Short.MAX_VALUE)))
															.addContainerGap());
				}
			}
			{
				btnConfirmar = new JButton();
				btnConfirmar.setText("Confirmar Equipo");
			}
			{
				btnCancelar = new JButton();
				btnCancelar.setText("Cancelar");
			}
			{
				separatorEquipoS = new JSeparator();
				separatorEquipoS.setBorder(BorderFactory.createTitledBorder("Equipo Suplente"));
				{
					panelEquipoS = new JPanel();
					GroupLayout panelEquipoSLayout = new GroupLayout(panelEquipoS);
					panelEquipoS.setLayout(panelEquipoSLayout);
					separatorEquipoS.add(panelEquipoS);
					panelEquipoS.setBounds(5, 20, 310, 159);
					{
						jScrollPane3 = new JScrollPane();
						{
							tableEquipoS = new JTable();
							tableEquipoS.setAutoCreateColumnsFromModel(true);
							tableEquipoS.setModel(tableEquipoSModel);
							tableEquipoS.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
							tableEquipoS.setRowSelectionAllowed(true);

							jScrollPane3.setViewportView(tableEquipoS);
							tableEquipoS.setModel(tableEquipoSModel);
						}
					}
					{
						btnQuitarS = new JButton();
						btnQuitarS.setText("<- Quitar Suplente");
						btnQuitarS.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								btnQuitarSActionPerformed(evt);
							}
						});
					}
					panelEquipoSLayout.setHorizontalGroup(panelEquipoSLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(panelEquipoSLayout.createParallelGroup()
									.addGroup(panelEquipoSLayout.createSequentialGroup()
											.addComponent(jScrollPane3, GroupLayout.PREFERRED_SIZE, 286, GroupLayout.PREFERRED_SIZE)
											.addGap(0, 0, Short.MAX_VALUE))
											.addGroup(GroupLayout.Alignment.LEADING, panelEquipoSLayout.createSequentialGroup()
													.addGap(0, 114, Short.MAX_VALUE)
													.addComponent(btnQuitarS, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)))
													.addContainerGap());
					panelEquipoSLayout.setVerticalGroup(panelEquipoSLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(jScrollPane3, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED, 1, Short.MAX_VALUE)
							.addComponent(btnQuitarS, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
							.addContainerGap());
				}
			}
			{
				separatorEquipoT = new JSeparator();
				separatorEquipoT.setBorder(BorderFactory.createTitledBorder("Equipo Titular"));
				{
					panelEquipoT = new JPanel();
					GroupLayout panelEquipoTLayout = new GroupLayout(panelEquipoT);
					panelEquipoT.setLayout(panelEquipoTLayout);
					separatorEquipoT.add(panelEquipoT);
					panelEquipoT.setBounds(5, 20, 310, 166);
					{
						jScrollPane2 = new JScrollPane();
						{
							tableEquipoT = new JTable();
							tableEquipoT.setAutoCreateColumnsFromModel(true);
							tableEquipoT.setModel(tableEquipoTModel);
							tableEquipoT.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
							tableEquipoS.setRowSelectionAllowed(true);

							jScrollPane2.setViewportView(tableEquipoT);
							tableEquipoT.setModel(tableEquipoTModel);
							//tableEquipoT.setPreferredSize(new java.awt.Dimension(283, 32));
						}
					}
					{
						btnQuitarT = new JButton();
						btnQuitarT.setText("<- Quitar Titular");
						btnQuitarT.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								btnQuitarTActionPerformed(evt);
							}
						});
					}
					panelEquipoTLayout.setHorizontalGroup(panelEquipoTLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(panelEquipoTLayout.createParallelGroup()
									.addGroup(panelEquipoTLayout.createSequentialGroup()
											.addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 286, GroupLayout.PREFERRED_SIZE))
											.addGroup(GroupLayout.Alignment.LEADING, panelEquipoTLayout.createSequentialGroup()
													.addGap(113)
													.addComponent(btnQuitarT, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)))
													.addContainerGap(12, Short.MAX_VALUE));
					panelEquipoTLayout.setVerticalGroup(panelEquipoTLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED, 1, Short.MAX_VALUE)
							.addComponent(btnQuitarT, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
							.addContainerGap());
				}
			}
			thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(thisLayout.createParallelGroup()
							.addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
									.addComponent(separatorEquipoT, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
									.addGap(22)
									.addComponent(separatorEquipoS, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE))
									.addComponent(separatorJugadores, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 399, GroupLayout.PREFERRED_SIZE))
									.addGap(26)
									.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
											.addComponent(btnConfirmar, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
											.addComponent(btnCancelar, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
											.addContainerGap());
			thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(separatorJugadores, GroupLayout.PREFERRED_SIZE, 423, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
					.addGroup(thisLayout.createParallelGroup()
							.addComponent(separatorEquipoT, GroupLayout.Alignment.LEADING, 0, 320, Short.MAX_VALUE)
							.addComponent(separatorEquipoS, GroupLayout.Alignment.LEADING, 0, 320, Short.MAX_VALUE)
							.addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
									.addGap(0, 56, Short.MAX_VALUE)
									.addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED, 1, GroupLayout.PREFERRED_SIZE)
									.addComponent(btnConfirmar, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)))
									.addContainerGap());
			pack();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	//TODO Agregar Validaciones!!!!! Ahora puede meter todos los jugadores que quiera en cualquier equipo!
	//Agregar Titular
	private void btnAgregarTActionPerformed(ActionEvent evt) {
		System.out.println("btnAgregarT.actionPerformed, event="+evt);
		Jugador removed = tableJugadoresModel.removeJugadorAt(tableJugadores.getSelectedRow());
		tableEquipoTModel.addJugador(removed);
	}
	//Agregar Suplente
	private void btnAgregarSActionPerformed(ActionEvent evt) {
		System.out.println("btnAgregarS.actionPerformed, event="+evt);
		//TODO add your code for btnAgregarS.actionPerformed
		Jugador removed = tableJugadoresModel.removeJugadorAt(tableJugadores.getSelectedRow());
		tableEquipoSModel.addJugador(removed);
	}
	//Quitar Titular
	private void btnQuitarTActionPerformed(ActionEvent evt) {
		System.out.println("btnQuitarT.actionPerformed, event="+evt);
		//TODO add your code for btnQuitarT.actionPerformed
		Jugador removed = tableEquipoTModel.removeJugadorAt(tableEquipoT.getSelectedRow());
		tableJugadoresModel.addJugador(removed);
	}
	//Quitar Suplente
	private void btnQuitarSActionPerformed(ActionEvent evt) {
		System.out.println("btnQuitarS.actionPerformed, event="+evt);
		//TODO add your code for btnQuitarS.actionPerformed
		Jugador removed = tableEquipoSModel.removeJugadorAt(tableEquipoS.getSelectedRow());
		tableJugadoresModel.addJugador(removed);
	}

}
