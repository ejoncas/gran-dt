package controlador;

import logica.SistemaGranDT;
import logica.Usuario;

public class LoginControlador {
	private final SistemaGranDT logica;

	// constructor del controlador
	public LoginControlador (){
		this.logica = SistemaGranDT.getInstance(); // referencia al sistema
		System.out.println(this.logica);
	}

	// devuelve true si es entero, false si no
	public boolean isInteger(String i){
		boolean es;
		try {
			Integer.parseInt(i);
			es = true;
		} catch(NumberFormatException e) {
			es = false;
		}
		return es;
	}

	public String validarLogin(String tipo, String nro, String pass){
		if (nro.isEmpty())
			return "Debe ingresar su numero de documento";
		if (pass.isEmpty())
			return "Debe ingresar su contrasena";	
		if (!isInteger(nro))
			return "El documento debe ser numerico";
		return null;
	}

	// tiene acceso al DAO de usuario
	public String loguearUsuario(String tipo, String nro, String pass){
		String resultado = validarLogin(tipo, nro, pass);

		if (resultado==null){ // si todos los datos son correctos
			//Usuario u = udao.getUsuarioPorDoc(tipo, Integer.parseInt(nro));
			Usuario u = logica.getAdminDAO().getUsuarioPorDoc(tipo, Integer.parseInt(nro));
			if (u!=null){
				if (pass.equals(u.getPassword())){ // contrasenia ok
					//Usuario logueado correctamente - guardamos todos sus datos
					logica.setUsuarioActual(u); // setea el usuario
					logica.getUsuarioActual().setEquipo(logica.getAdminDAO().getEquipoPorDoc(tipo, Integer.parseInt(nro)));
					//cargamos el equipo actual del usuario;
					//logica.getUsuarioActual().getEquipo().setEquipoTitular(logica.getAdminDAO().obtenerEquipoTitular(logica.getUsuarioActual()));
					//Equipo titular cargado en memoria OK!!!
					return null; // porque todo salio bien
				}
				else
					return "Error en la contrasena";				
			}
			else // si no existe
				return "El documento ingresado no se encuentra registrado en el sistema. Debe registrarse para poder ingresar.";			
		}

		return resultado;
	}

	public boolean isAdmin(){
		//TODO ... si queda tiempo hacer algo mas copado. Por ahora con el insert en la base de un usuario que se llame admin funciona		
		return logica.getUsuarioActual().getNombre().equals("admin"); 
	}

	// version anterior: si los usuarios estuvieran cargados en memoria
	//	public String loguearUsuario(String tipo, String nro, String pass){
	//		String resultado = validarLogin(tipo, nro, pass);
	//
	//		if (resultado==null){ // si todos los datos son correctos
	//			boolean existeDoc =logica.validarDNI(tipo, Integer.parseInt(nro));	// validar que existe el tipo y nro de documento
	//			if (existeDoc){ // si existe el dni ingresado en el sistema
	//				Usuario u = logica.getUsuarioByDoc(tipo, Integer.parseInt(nro));
	//				if (pass.equals(u.getPassword())){ // contrasenia ok
	//					logica.setUsuarioActual(u); // setea el usuario
	//					return null; // porque todo salio bien
	//				}
	//				else
	//					return "Error en la contrasena";				
	//			}
	//			else // si no existe
	//				return "El documento ingresado no se encuentra registrado en el sistema. Debe registrarse para poder ingresar.";			
	//		}
	//
	//		return resultado;
	//	}

}
