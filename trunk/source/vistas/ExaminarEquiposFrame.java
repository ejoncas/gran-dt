package vistas;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileFilter;

import javax.swing.JFileChooser;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;


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
public class ExaminarEquiposFrame extends javax.swing.JInternalFrame {
	private JFileChooser examinar;
	private CargaMasivaEquiposFrame frame;
	
	private FileFilter filter;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				ExaminarEquiposFrame inst = new ExaminarEquiposFrame();
//				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public ExaminarEquiposFrame() {
		super("Seleccione el archivo deseado", true, true, true, true);
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			{

				examinar = new JFileChooser();
				getContentPane().add(examinar, BorderLayout.CENTER);
		        examinar.setDialogType(1);
		        examinar.setDialogTitle("Save Result");
		        examinar.setFileFilter((javax.swing.filechooser.FileFilter) filter);
		        int seleccion = examinar.showOpenDialog(frame);

		        switch( seleccion )
		        {
		            case JFileChooser.CANCEL_OPTION:
		                System.out.println( "Cancelado" );
		                break;
		            case JFileChooser.APPROVE_OPTION:
		                System.out.println( "Aceptado" );
		                System.out.println( "El nombre del archivo seleccionado es: " + examinar.getSelectedFile().getName() );
		                break;
		        }

			}
			pack();
			setSize(400, 300);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	

}
