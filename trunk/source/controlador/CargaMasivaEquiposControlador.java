package controlador;

import logica.SistemaGranDT;
import vistas.ExaminarEquiposFrame;
import vistas.MenuAdminFrame;

public class CargaMasivaEquiposControlador {
	private MenuAdminFrame menu;
	private SistemaGranDT logica;
	
	// al presionar el boton examinar
	public CargaMasivaEquiposControlador() {
		super();
		this.menu = MenuAdminFrame.getInstance();
		this.logica = SistemaGranDT.getInstance();
	}



	public void procesarExaminar(){
		ExaminarEquiposFrame examinar = new ExaminarEquiposFrame();
		menu.getDesktopPane().add(examinar);
	}

}


