package vistas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;
import javax.swing.filechooser.FileFilter;


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
public class CargaMasivaJugadoresFrame extends javax.swing.JInternalFrame {
	private JLabel lblSeleccione;
	private JTextField txtPath;
	private JButton btnCargar;
	private JButton btnExaminar;
	private JFileChooser fc;

	/**
	 * Auto-generated main method to display this JFrame
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				CargaMasivaJugadoresFrame inst = new CargaMasivaJugadoresFrame();
				//		inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}

	public CargaMasivaJugadoresFrame() {
		super("Carga masiva de jugadores", true, true, true, true);
		initGUI();
	}

	private void initGUI() {
		try {
			GroupLayout thisLayout = new GroupLayout(getContentPane());
			getContentPane().setLayout(thisLayout);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			{
				lblSeleccione = new JLabel();
				lblSeleccione.setText("Seleccione el archivo de jugadores (*.csv)");
			}
			{
				fc = new JFileChooser();
				fc.setFileFilter(new FileFilter() {

					@Override
					public String getDescription() {
						return ".csv (Comma separated files)";
					}

					@Override
					public boolean accept(File f) {
						//muestra solo directorios y archivos csv
						return f.isDirectory() || f.getName().toLowerCase().endsWith(".csv");
					}
				});
				fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
			}
			{
				txtPath = new JTextField();
			}
			{
				btnExaminar = new JButton();
				btnExaminar.setText("Examinar");
				btnExaminar.setSize(110, 25);
				btnExaminar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						btnExaminarActionPerformed(evt);
					}
				});
			}
			{
				btnCargar = new JButton();
				btnCargar.setEnabled(false);
				btnCargar.setText("Cargar");
				btnCargar.setSize(110, 25);
				btnCargar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						btnCargarActionPerformed(evt);
					}
				});
			}
			thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
					.addContainerGap(19, 19)
					.addComponent(lblSeleccione, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
					.addComponent(txtPath, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(btnExaminar, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnCargar, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
							.addContainerGap());
			thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(thisLayout.createParallelGroup()
							.addComponent(lblSeleccione, GroupLayout.Alignment.LEADING, 0, 376, Short.MAX_VALUE)
							.addComponent(txtPath, GroupLayout.Alignment.LEADING, 0, 376, Short.MAX_VALUE)
							.addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
									.addGap(0, 145, Short.MAX_VALUE)
									.addComponent(btnCargar, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED, 1, GroupLayout.PREFERRED_SIZE)
									.addComponent(btnExaminar, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)))
									.addContainerGap());
			pack();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void btnExaminarActionPerformed(ActionEvent evt) {
		System.out.println("btnExaminar.actionPerformed, event="+evt);
		int returnVal = fc.showOpenDialog(CargaMasivaJugadoresFrame.this);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			File file = fc.getSelectedFile();
			btnCargar.setEnabled(true);
			System.out.println("Abriendo el archivo: " + file.getName());
			txtPath.setText(file.getAbsolutePath());
		} else {
			System.out.println("File Chooser cerrado por el usuario");
		}
	}

	private void btnCargarActionPerformed(ActionEvent evt) {
		System.out.println("btnCargar.actionPerformed, event="+evt);
		//TODO add your code for btnCargar.actionPerformed
		System.out.println("Parseando el csv");
	}

}
