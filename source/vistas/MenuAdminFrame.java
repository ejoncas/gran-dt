package vistas;
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
					}
					{
						btnGenerarTabla = new JMenuItem();
						jMenu1.add(btnGenerarTabla);
						btnGenerarTabla.setText("Generar Tabla de Posiciones...");
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
					}
					{
						btnCMEquipos = new JMenuItem();
						jMenu2.add(btnCMEquipos);
						btnCMEquipos.setText("...de Equipos");
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
