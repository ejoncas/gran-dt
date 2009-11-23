package vistas;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.WindowConstants;
import javax.swing.filechooser.FileFilter;

import controlador.CargaMasivasControlador;


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
public class CargaMasivaPuntajesFrame extends javax.swing.JInternalFrame {
	private JLabel lblSeleccione;
	private JTextField txtPath;
	private JButton btnCargar;
	private JButton btnExaminar;
	private JFileChooser fc;
	private File file=null; 
	private CargaMasivasControlador cmc;


	public CargaMasivaPuntajesFrame() {
		super("Carga masiva de equipos", true, true, true, true);
		cmc = new CargaMasivasControlador();
		initGUI();
	}

	private void initGUI() {
		try {
			GroupLayout thisLayout = new GroupLayout(getContentPane());
			getContentPane().setLayout(thisLayout);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			this.setTitle("Carga Masiva de Puntajes");
			{
				lblSeleccione = new JLabel();
				lblSeleccione.setText("Seleccione el archivo de Puntajes (*.csv)");
			}
			{
				fc = new JFileChooser();
				fc.setFileFilter(new FileFilter() {

					@Override
					public String getDescription() {
						return ".csv (Comma Separated Values)";
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
				btnCargar.setText("Cargar");
				btnCargar.setSize(110, 25);
				btnCargar.setEnabled(false);
				btnCargar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						btnCargarActionPerformed(evt);
					}
				});
			}
			thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblSeleccione, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
					.addComponent(txtPath, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(btnExaminar, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnCargar, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
							.addContainerGap());
			thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
					.addContainerGap(22, 22)
					.addGroup(thisLayout.createParallelGroup()
							.addComponent(lblSeleccione, GroupLayout.Alignment.LEADING, 0, 366, Short.MAX_VALUE)
							.addComponent(txtPath, GroupLayout.Alignment.LEADING, 0, 366, Short.MAX_VALUE)
							.addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
									.addGap(0, 125, Short.MAX_VALUE)
									.addComponent(btnCargar, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
									.addComponent(btnExaminar, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)))
									.addContainerGap());
			pack();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void btnExaminarActionPerformed(ActionEvent evt) {
		System.out.println("btnExaminar.actionPerformed, event="+evt);
		//we need to pass the parent window
		int returnVal = fc.showOpenDialog(CargaMasivaPuntajesFrame.this);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			file = fc.getSelectedFile();
			btnCargar.setEnabled(true);
			System.out.println("Abriendo el archivo: " + file.getName());
			System.out.println("Absolute Path: " + file.getAbsolutePath());
			txtPath.setText(file.getAbsolutePath());
		} else {
			System.out.println("File Chooser cerrado por el usuario");
		}
	}

	private void btnCargarActionPerformed(ActionEvent evt) {
		System.out.println("btnCargar.actionPerformed, event="+evt);
		System.out.println("btnCargar.actionPerformed, event="+evt);
		this.getContentPane().setCursor(new Cursor(Cursor.WAIT_CURSOR));
		JOptionPane.showMessageDialog(this, cmc.cargarPuntajes(file.getAbsolutePath()));
		this.getContentPane().setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		this.dispose();

	}

}
