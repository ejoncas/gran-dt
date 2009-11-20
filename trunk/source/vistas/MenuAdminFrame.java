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
public class MenuAdminFrame extends javax.swing.JFrame {
	private JDesktopPane desktopPane;
	private JMenuItem btnCMEquipos;
	private JMenuItem btnCMJugadores;
	private JMenu jMenu2;
	private JMenuItem btnGenerarTabla;
	private JMenuItem btnPuntajesJug;
	private JMenu jMenu1;
	private JMenuBar barMenu;

	/**
	 * Auto-generated main method to display this JFrame
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				MenuAdminFrame inst = new MenuAdminFrame();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}

	public MenuAdminFrame() {
		super();
		initGUI();
	}

	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			GroupLayout thisLayout = new GroupLayout(getContentPane());
			getContentPane().setLayout(thisLayout);
			this.setTitle("Menu ADMINISTRADOR");
			{
				barMenu = new JMenuBar();
				setJMenuBar(barMenu);
				{
					jMenu1 = new JMenu();
					barMenu.add(jMenu1);
					jMenu1.setText("Cargar");
					{
						btnPuntajesJug = new JMenuItem();
						jMenu1.add(btnPuntajesJug);
						btnPuntajesJug.setText("Cargar Puntajes Jugadores...");
						btnPuntajesJug.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								System.out.println("btnPuntajesJug.actionPerformed, event="+evt);
								RegistrarPuntajesJugadoresFrame frame = new RegistrarPuntajesJugadoresFrame();
								frame.setVisible(true);
								desktopPane.add(frame);							}
						});
					}
					{
						btnGenerarTabla = new JMenuItem();
						jMenu1.add(btnGenerarTabla);
						btnGenerarTabla.setText("Generar Tabla de Posiciones...");
						btnGenerarTabla.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								System.out.println("btnGenerarTabla.actionPerformed, event="+evt);
								TablasPosicionesFrame frame = new TablasPosicionesFrame();
								frame.setVisible(true);
								desktopPane.add(frame);							}
						});
					}
				}
				{
					jMenu2 = new JMenu();
					barMenu.add(jMenu2);
					jMenu2.setText("Carga Masiva");
					{
						btnCMJugadores = new JMenuItem();
						jMenu2.add(btnCMJugadores);
						btnCMJugadores.setText("...de Jugadores");
						btnCMJugadores.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								System.out.println("btnCMJugadores.actionPerformed, event="+evt);
								CargaMasivaJugadoresFrame frame = new CargaMasivaJugadoresFrame();
								frame.setVisible(true);
								desktopPane.add(frame);							}
						});
					}
					{
						btnCMEquipos = new JMenuItem();
						jMenu2.add(btnCMEquipos);
						btnCMEquipos.setText("...de Equipos");
						btnCMEquipos.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								System.out.println("btnCMEquipos.actionPerformed, event="+evt);
								CargaMasivaEquiposFrame frame = new CargaMasivaEquiposFrame();
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
					.addComponent(desktopPane, 0, 549, Short.MAX_VALUE));
			thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
					.addComponent(desktopPane, 0, 794, Short.MAX_VALUE));
			pack();
			this.setSize(800, 600);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
