package vistas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.LayoutStyle;
import javax.swing.WindowConstants;

import logica.Jugador;
import controlador.ArmarEquipoControlador;
import controlador.JugadorTableModel;


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
public class ArmarEquipoFrame extends javax.swing.JInternalFrame {
	private JSeparator separatorJugadores;
	private JComboBox cmbClub;
	private JComboBox cmbPosicion;
	private JLabel lblFiltrar;
	private JLabel lblMG;
	private JPanel pnlJugadores;
	private JScrollPane jScrollPane1;
	private JPanel panelEquipoT;
	private JScrollPane jScrollPane2;
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

	public ArmarEquipoFrame() {
		super("Armar Equipo", false, true, true, true);
		//creamos las listas vacias
		this.tableJugadoresModel=new JugadorTableModel();
		this.tableEquipoSModel=new JugadorTableModel();
		this.tableEquipoTModel= new JugadorTableModel();

		initGUI();
	}

	public ArmarEquipoFrame(JugadorTableModel j, JugadorTableModel et, JugadorTableModel es) {
		super("Armar Equipo", true, true, true, true);
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
					pnlJugadores.setBounds(11, 21, 460, 558);
					{
						jScrollPane1 = new JScrollPane();
						{
							tableJugadores = new JTable();

							//we configure the table
							tableJugadores.setAutoCreateColumnsFromModel(true);
							tableJugadores.setModel(tableJugadoresModel);
							tableJugadores.doLayout();
							tableJugadores.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
							tableJugadores.setRowSelectionAllowed(true);

							jScrollPane1.setViewportView(tableJugadores);

							//tableJugadores.setPreferredSize(new java.awt.Dimension(436, 135));

						}
					}
					{
						lblFiltrar = new JLabel();
						lblFiltrar.setText("Filtrar por:");
					}
					{
						ComboBoxModel cmbPosicionModel = 
							new DefaultComboBoxModel(
									new String[] { "Posicion", "Arquero" , "Delantero", "Volante", "Defensor"});
						cmbPosicion = new JComboBox();
						cmbPosicion.setModel(cmbPosicionModel);
						cmbPosicion.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								cmbPosicionActionPerformed(evt);
							}
						});
					}
					{
						cmbClub = new JComboBox();
						cmbClub.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								cmbClubActionPerformed(evt);
							}
						});
					}
					{
						lblMontoG = new JLabel();
						lblMontoG.setText("Monto Gastado:  $");
					}
					{
						lblMD = new JLabel();
					}
					{
						lblMG = new JLabel();
					}
					{
						lblMontoD = new JLabel();
						lblMontoD.setText("Monto Disponible:  $");
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
													.addComponent(lblMontoD, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE)
													.addComponent(lblMontoG, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE)
													.addGroup(GroupLayout.Alignment.LEADING, pnlJugadoresLayout.createSequentialGroup()
															.addComponent(lblFiltrar, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
															.addGap(59)))
															.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
															.addGroup(pnlJugadoresLayout.createParallelGroup()
																	.addGroup(pnlJugadoresLayout.createSequentialGroup()
																			.addGroup(pnlJugadoresLayout.createParallelGroup()
																					.addComponent(lblMG, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
																					.addGroup(GroupLayout.Alignment.LEADING, pnlJugadoresLayout.createSequentialGroup()
																							.addComponent(lblMD, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
																							.addGap(8)))
																							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
																							.addGroup(pnlJugadoresLayout.createParallelGroup()
																									.addGroup(pnlJugadoresLayout.createSequentialGroup()
																											.addComponent(btnAgregarS, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
																											.addGap(0, 0, Short.MAX_VALUE))
																											.addComponent(btnAgregarT, GroupLayout.Alignment.LEADING, 0, 159, Short.MAX_VALUE)))
																											.addGroup(GroupLayout.Alignment.LEADING, pnlJugadoresLayout.createSequentialGroup()
																													.addGap(7)
																													.addComponent(cmbPosicion, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
																													.addGap(0, 16, Short.MAX_VALUE)
																													.addComponent(cmbClub, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE))))
																													.addComponent(jScrollPane1, GroupLayout.Alignment.LEADING, 0, 439, Short.MAX_VALUE))
																													.addContainerGap());
					pnlJugadoresLayout.setVerticalGroup(pnlJugadoresLayout.createSequentialGroup()
							.addGap(8)
							.addGroup(pnlJugadoresLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
									.addComponent(cmbPosicion, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblFiltrar, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(cmbClub, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(21)
									.addComponent(jScrollPane1, 0, 436, Short.MAX_VALUE)
									.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
									.addGroup(pnlJugadoresLayout.createParallelGroup()
											.addGroup(GroupLayout.Alignment.LEADING, pnlJugadoresLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
													.addComponent(btnAgregarT, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
													.addComponent(lblMontoD, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
													.addGroup(GroupLayout.Alignment.LEADING, pnlJugadoresLayout.createSequentialGroup()
															.addComponent(lblMD, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
															.addGap(7)))
															.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
															.addGroup(pnlJugadoresLayout.createParallelGroup()
																	.addGroup(GroupLayout.Alignment.LEADING, pnlJugadoresLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
																			.addComponent(btnAgregarS, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
																			.addComponent(lblMontoG, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
																			.addGroup(GroupLayout.Alignment.LEADING, pnlJugadoresLayout.createSequentialGroup()
																					.addComponent(lblMG, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
																					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)))
																					.addContainerGap());
				}
			}
			{
				btnConfirmar = new JButton();
				btnConfirmar.setText("Confirmar Equipo");
				btnConfirmar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						btnConfirmarActionPerformed(evt);
					}
				});
			}
			{
				btnCancelar = new JButton();
				btnCancelar.setText("Cancelar");
				btnCancelar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						btnCancelarActionPerformed(evt);
					}
				});
			}
			{
				separatorEquipoS = new JSeparator();
				separatorEquipoS.setBorder(BorderFactory.createTitledBorder("Equipo Suplente"));
				{
					panelEquipoS = new JPanel();
					GroupLayout panelEquipoSLayout = new GroupLayout(panelEquipoS);
					panelEquipoS.setLayout(panelEquipoSLayout);
					separatorEquipoS.add(panelEquipoS);
					panelEquipoS.setBounds(10, 20, 359, 183);
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
									.addGroup(GroupLayout.Alignment.LEADING, panelEquipoSLayout.createSequentialGroup()
											.addComponent(btnQuitarS, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
											.addGap(0, 162, Short.MAX_VALUE))
											.addComponent(jScrollPane3, GroupLayout.Alignment.LEADING, 0, 335, Short.MAX_VALUE))
											.addContainerGap());
					panelEquipoSLayout.setVerticalGroup(panelEquipoSLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(jScrollPane3, 0, 121, Short.MAX_VALUE)
							.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED, 1, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnQuitarS, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
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
					panelEquipoT.setBounds(12, 20, 355, 305);
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
									.addGroup(GroupLayout.Alignment.LEADING, panelEquipoTLayout.createSequentialGroup()
											.addComponent(btnQuitarT, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
											.addGap(0, 158, Short.MAX_VALUE))
											.addComponent(jScrollPane2, GroupLayout.Alignment.LEADING, 0, 331, Short.MAX_VALUE))
											.addContainerGap());
					panelEquipoTLayout.setVerticalGroup(panelEquipoTLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(jScrollPane2, 0, 248, Short.MAX_VALUE)
							.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED, 1, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnQuitarT, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
							.addContainerGap());
				}
			}
			thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(thisLayout.createParallelGroup()
							.addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
									.addComponent(separatorEquipoT, 0, 342, Short.MAX_VALUE)
									.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
									.addComponent(separatorEquipoS, 0, 208, Short.MAX_VALUE)
									.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
									.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
											.addComponent(btnCancelar, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
											.addComponent(btnConfirmar, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)))
											.addComponent(separatorJugadores, GroupLayout.Alignment.LEADING, 0, 596, Short.MAX_VALUE))
											.addContainerGap());
			thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(separatorJugadores, GroupLayout.PREFERRED_SIZE, 483, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(thisLayout.createParallelGroup()
							.addComponent(separatorEquipoT, GroupLayout.Alignment.LEADING, 0, 380, Short.MAX_VALUE)
							.addComponent(separatorEquipoS, GroupLayout.Alignment.LEADING, 0, 380, Short.MAX_VALUE)
							.addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
									.addGap(115)
									.addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
									.addComponent(btnConfirmar, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
									.addGap(0, 0, Short.MAX_VALUE)))
									.addContainerGap());
			pack();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public JLabel getLblMG() {
		return lblMG;
	}

	public void setLblMG(JLabel lblMG) {
		this.lblMG = lblMG;
	}

	public JLabel getLblMD() {
		return lblMD;
	}

	public void setLblMD(JLabel lblMD) {
		this.lblMD = lblMD;
	}

	//TODO Agregar Validaciones!!!!! Ahora puede meter todos los jugadores que quiera en cualquier equipo!
	//Agregar Titular
	private void btnAgregarTActionPerformed(ActionEvent evt) {
		System.out.println("btnAgregarT.actionPerformed, event="+evt);

		String r = this.aec.validarJugadorTitular(tableJugadoresModel.getJugadorAt(tableJugadores.getSelectedRow()),this.tableEquipoTModel.getDatalist());
		if(r==null){
			Jugador removed = tableJugadoresModel.removeJugadorAt(tableJugadores.getSelectedRow());
			tableEquipoTModel.addJugador(removed);
			this.aec.setMontoDisponible(this.aec.getMontoDisponible() - removed.getPrecio());
			this.lblMD.setText(this.aec.getMontoDisponibleString());
			this.aec.setMontoGastado(this.aec.getMontoGastado() + removed.getPrecio());
			this.lblMG.setText(this.aec.getMontoGastadoString());
		}
		else
			JOptionPane.showMessageDialog(null, r);
	}
	//Agregar Suplente
	private void btnAgregarSActionPerformed(ActionEvent evt) {
		System.out.println("btnAgregarS.actionPerformed, event="+evt);
		//TODO add your code for btnAgregarS.actionPerformed
		String r = this.aec.validarJugadorSuplente(tableJugadoresModel.getJugadorAt(tableJugadores.getSelectedRow()), this.tableEquipoSModel.getDatalist());
		if (r == null){
			Jugador removed = tableJugadoresModel.removeJugadorAt(tableJugadores.getSelectedRow());
			tableEquipoSModel.addJugador(removed);
			this.aec.setMontoDisponible(this.aec.getMontoDisponible() - removed.getPrecio());
			lblMD.setText(this.aec.getMontoDisponibleString());
			this.aec.setMontoGastado(this.aec.getMontoGastado() + removed.getPrecio());
			lblMG.setText(this.aec.getMontoGastadoString());
		}
		else
			JOptionPane.showMessageDialog(null, r);
	}

	//Quitar Titular
	private void btnQuitarTActionPerformed(ActionEvent evt) {
		System.out.println("btnQuitarT.actionPerformed, event="+evt);
		//TODO Remover del monto gastado!
		Jugador removed = tableEquipoTModel.removeJugadorAt(tableEquipoT.getSelectedRow());
		tableJugadoresModel.addJugador(removed);
		this.aec.setMontoDisponible(this.aec.getMontoDisponible() + removed.getPrecio());
		lblMD.setText(this.aec.getMontoDisponibleString());
	}
	//Quitar Suplente
	private void btnQuitarSActionPerformed(ActionEvent evt) {
		System.out.println("btnQuitarS.actionPerformed, event="+evt);
		//TODO Remover del monto gastad! actualizar precios
		Jugador removed = tableEquipoSModel.removeJugadorAt(tableEquipoS.getSelectedRow());
		tableJugadoresModel.addJugador(removed);
		this.aec.setMontoDisponible(this.aec.getMontoDisponible() + removed.getPrecio());
		lblMD.setText(this.aec.getMontoDisponibleString());
	}

	private void btnCancelarActionPerformed(ActionEvent evt) {
		System.out.println("btnCancelar.actionPerformed, event="+evt);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.dispose();
	}

	private void btnConfirmarActionPerformed(ActionEvent evt) {
		System.out.println("btnConfirmar.actionPerformed, event="+evt);
		//guardamos el equipo titular y suplente en el modelo de datos y en la logica
		String r = this.aec.guardarEquipoT(this.tableEquipoTModel.getDatalist());
		if ( r!= null)
			JOptionPane.showMessageDialog(null, r);
		else{
			String r2 = this.aec.gaurdarEquipoS(this.tableEquipoSModel.getDatalist());
			if(r2!=null)
				JOptionPane.showMessageDialog(null, r2);
			else
				this.dispose();
		}

	}

	public JComboBox getCmbClub() {
		return cmbClub;
	}

	public JComboBox getCmbPosicion() {
		return cmbPosicion;
	}

	private void cmbPosicionActionPerformed(ActionEvent evt) {
		System.out.println("cmbPosicion.actionPerformed, event="+evt);
		this.aec.procesarFiltros((String)cmbPosicion.getSelectedItem(), (String) cmbClub.getSelectedItem());
	}

	private void cmbClubActionPerformed(ActionEvent evt) {
		System.out.println("cmbClub.actionPerformed, event="+evt);
		this.aec.procesarFiltros((String)cmbPosicion.getSelectedItem(), (String) cmbClub.getSelectedItem());
	}

}
