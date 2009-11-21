package vistas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JDesktopPane;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;


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
public class MenuUsuarioFrame extends javax.swing.JFrame {

	{
		//Set Look & Feel
		try {
			javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	private JDesktopPane desktopPane;
	private JMenuBar jMenuBar1;
	private JMenuItem btnArmarEquipo;
	private JMenuItem btnEquipoEstado;
	private JMenuItem btnInscribir;
	private JMenuItem btnCrear;
	private JMenuItem btnAceptar;
	private JMenu jMenu2;
	private JMenu jMenu1;

	/**
	 * Auto-generated main method to display this JFrame
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				MenuUsuarioFrame inst = new MenuUsuarioFrame();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}

	public MenuUsuarioFrame() {
		super();
		initGUI();
	}

	private void initGUI() {
		try {
			GroupLayout thisLayout = new GroupLayout(getContentPane());
			getContentPane().setLayout(thisLayout);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			this.setTitle("Menu Principal");
			{
				jMenuBar1 = new JMenuBar();
				setJMenuBar(jMenuBar1);
				{
					jMenu1 = new JMenu();
					jMenuBar1.add(jMenu1);
					jMenu1.setText("Equipo");
					{
						btnArmarEquipo = new JMenuItem();
						jMenu1.add(btnArmarEquipo);
						btnArmarEquipo.setText("Armar...");
						btnArmarEquipo.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								btnArmarEquipoActionPerformed(evt);
							}
						});
					}
					{
						btnEquipoEstado = new JMenuItem();
						jMenu1.add(btnEquipoEstado);
						btnEquipoEstado.setText("Mi Equipo - Estado");
						btnEquipoEstado.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								System.out.println("btnEquipoEstado.actionPerformed, event="+evt);
								MostrarEquipoFrame frame = new MostrarEquipoFrame();
								frame.setVisible(true);
								desktopPane.add(frame);							}
						});
					}
				}
				{
					jMenu2 = new JMenu();
					jMenuBar1.add(jMenu2);
					jMenu2.setText("Torneos");
					{
						btnCrear = new JMenuItem();
						jMenu2.add(btnCrear);
						btnCrear.setText("Crear Torneo...");
						btnCrear.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								System.out.println("btnCrear.actionPerformed, event="+evt);
								CrearTorneoAmigosFrame frame = new CrearTorneoAmigosFrame();
								frame.setVisible(true);
								desktopPane.add(frame);							}
						});
					}
					{
						btnInscribir = new JMenuItem();
						jMenu2.add(btnInscribir);
						btnInscribir.setText("Inscribir usuario en torneo");
						btnInscribir.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								System.out.println("btnInscribir.actionPerformed, event="+evt);
								InscribirTorneoAmigosFrame frame = new InscribirTorneoAmigosFrame();
								frame.setVisible(true);
								desktopPane.add(frame);							}
						});
					}
					{
						btnAceptar = new JMenuItem();
						jMenu2.add(btnAceptar);
						btnAceptar.setText("Aceptar usuario en torneo");
						btnAceptar.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								System.out.println("btnAceptar.actionPerformed, event="+evt);
								AdministrarTorneoAmigosFrame frame = new AdministrarTorneoAmigosFrame();
								frame.setVisible(true);
								desktopPane.add(frame);							}
						});
					}
				}
			}
			{
				desktopPane = new JDesktopPane();
			}
			thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
					.addComponent(desktopPane, 0, 249, Short.MAX_VALUE));
			thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
					.addComponent(desktopPane, 0, 394, Short.MAX_VALUE));
			pack();
			this.setSize(800, 600);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void btnArmarEquipoActionPerformed(ActionEvent evt) {
		System.out.println("btnArmarEquipo.actionPerformed, event="+evt);
		//TODO Ver de llamarlos como corresponde
		ArmarEquipoFrame frame = new ArmarEquipoFrame();
		frame.setVisible(true);
		desktopPane.add(frame);
	}

}
