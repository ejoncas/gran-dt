package vistas;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.LayoutStyle;
import javax.swing.ListModel;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import controlador.MostrarEquipoControlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
public class MostrarEquipoFrame extends javax.swing.JInternalFrame {
	private JLabel lblAcumulado;
	private JLabel lblTitular;
	private JButton lblAceptar;
	private JLabel jLabel1;
	private JLabel lblUltFech;
	private JLabel lblPuntAcum;
	
	private JugadorTableModel tableEquipoTModel;
	private JugadorTableModel tableEquipoSModel;
	private JTable tableSuplente;
	private JLabel lblSuplente;
	private JScrollPane jScrollPane2;
	private JScrollPane jScrollPane1;
	private JTable tableTitular; 
	
	private MostrarEquipoControlador mec;
	
	public MostrarEquipoControlador getMec() {
		return mec;
	}

	public void setControlador(MostrarEquipoControlador mec) {
		this.mec = mec;
	}

	public MostrarEquipoFrame() {
		super("Mostrar equipo", true, true, true, true);
		this.tableEquipoSModel=new JugadorTableModel();
		this.tableEquipoTModel= new JugadorTableModel();
		
		initGUI();
	}
	

	public MostrarEquipoFrame(JugadorTableModel et, JugadorTableModel es) {
		super("Mostrar Equipo", true, true, true, true);
		//Creamos las tablas cargadas
		this.tableEquipoSModel=es;
		this.tableEquipoTModel=et;
		initGUI();
	}


	private void initGUI() {
		try {
			GroupLayout thisLayout = new GroupLayout((JComponent)getContentPane());
			getContentPane().setLayout(thisLayout);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			{
				lblAcumulado = new JLabel();
				lblAcumulado.setText("Puntaje acumulado:");
			}
			{
				lblPuntAcum = new JLabel();
				lblPuntAcum.setText("<>");
			}
			{
				lblUltFech = new JLabel();
				lblUltFech.setText("Puntaje obtenido en la ultima fecha:");
			}
			{
				jLabel1 = new JLabel();
				jLabel1.setText("<>");
			}
			{
				lblAceptar = new JButton();
				lblAceptar.setText("Aceptar");
				lblAceptar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						System.out.println("lblAceptar.actionPerformed, event="+evt);
						setDefaultCloseOperation(EXIT_ON_CLOSE);
						dispose();
						}
				});
			}
			{
				jScrollPane1 = new JScrollPane();
				{

					tableTitular = new JTable();
					tableTitular.setAutoCreateColumnsFromModel(true);
					tableTitular.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
					tableTitular.setRowSelectionAllowed(true);
					
					
					jScrollPane1.setViewportView(tableTitular);
					tableTitular.setModel(tableEquipoTModel);
				}
			}
			{
				jScrollPane2 = new JScrollPane();
				{

					tableSuplente = new JTable();
					tableSuplente.setAutoCreateColumnsFromModel(true);
					tableSuplente.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
					tableSuplente.setRowSelectionAllowed(true);
					
					jScrollPane2.setViewportView(tableSuplente);
					tableSuplente.setModel(tableEquipoSModel);
				}
			}
			{
				lblSuplente = new JLabel();
				lblSuplente.setText("Equipo suplente");
			}
			{
				lblTitular = new JLabel();
				lblTitular.setText("Equipo Titular");
			}
			thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
			.addContainerGap()
			.addComponent(lblTitular, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
			.addGap(20)
			.addComponent(jScrollPane1, 0, 176, Short.MAX_VALUE)
			.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
			.addComponent(lblSuplente, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
			.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
			.addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
			.addGap(23)
			.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
			    .addComponent(lblAcumulado, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
			    .addComponent(lblPuntAcum, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
			.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
			.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
			    .addComponent(lblAceptar, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
			    .addComponent(lblUltFech, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
			    .addComponent(jLabel1, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
			.addContainerGap());
		thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
				.addContainerGap(17, 17)
				.addGroup(thisLayout.createParallelGroup()
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addGroup(thisLayout.createParallelGroup()
				            .addComponent(lblUltFech, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 238, GroupLayout.PREFERRED_SIZE)
				            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                .addComponent(lblAcumulado, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
				                .addGap(88)))
				        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				        .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
				        .addGap(40)
				        .addComponent(lblAceptar, 0, 162, Short.MAX_VALUE)
				        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 0, GroupLayout.PREFERRED_SIZE))
				    .addGroup(thisLayout.createSequentialGroup()
				        .addPreferredGap(lblAcumulado, lblTitular, LayoutStyle.ComponentPlacement.INDENT)
				        .addGroup(thisLayout.createParallelGroup()
				            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                .addGroup(thisLayout.createParallelGroup()
				                    .addComponent(lblTitular, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
				                    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                        .addPreferredGap(lblTitular, lblSuplente, LayoutStyle.ComponentPlacement.INDENT)
				                        .addComponent(lblSuplente, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
				                        .addGap(43)))
				                .addComponent(lblPuntAcum, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
				                .addGap(0, 264, Short.MAX_VALUE))
				            .addGroup(thisLayout.createSequentialGroup()
				                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 487, GroupLayout.PREFERRED_SIZE)
				                .addGap(0, 0, Short.MAX_VALUE))
				            .addGroup(thisLayout.createSequentialGroup()
				                .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 487, GroupLayout.PREFERRED_SIZE)
				                .addGap(0, 0, Short.MAX_VALUE)))))
				.addGap(8));
			pack();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
