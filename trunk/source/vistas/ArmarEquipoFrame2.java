package vistas;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.LayoutStyle;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


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

	/**
	 * Auto-generated main method to display this JFrame
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				ArmarEquipoFrame2 inst = new ArmarEquipoFrame2();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}

	public ArmarEquipoFrame2() {
		super();
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
							TableModel tableJugadoresModel = 
								new DefaultTableModel(
										new String[][] { { "One", "Two" }, { "Three", "Four" } },
										new String[] { "Jugador", "Equipo", "Posicion", "Cotiza" });
							tableJugadores = new JTable();
							jScrollPane1.setViewportView(tableJugadores);
							tableJugadores.setModel(tableJugadoresModel);
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
					}
					{
						btnAgregarT = new JButton();
						btnAgregarT.setText("Agregar Titular ->");
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
							TableModel tableEquipoSModel = 
								new DefaultTableModel(
										new String[][] { { "One", "Two" }, { "Three", "Four" } },
										new String[] { "Jugador", "Posicion" });
							tableEquipoS = new JTable();
							jScrollPane3.setViewportView(tableEquipoS);
							tableEquipoS.setModel(tableEquipoSModel);
						}
					}
					{
						btnQuitarS = new JButton();
						btnQuitarS.setText("<- Quitar Suplente");
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
							TableModel tableEquipoTModel = 
								new DefaultTableModel(
										new String[][] { { "One", "Two" }, { "Three", "Four" } },
										new String[] { "Jugador", "Posicion" });
							tableEquipoT = new JTable();
							jScrollPane2.setViewportView(tableEquipoT);
							tableEquipoT.setModel(tableEquipoTModel);
						}
					}
					{
						btnQuitarT = new JButton();
						btnQuitarT.setText("<- Quitar Titular");
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

}
