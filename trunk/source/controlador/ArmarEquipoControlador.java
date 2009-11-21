package controlador;

import java.util.Vector;

import logica.Arquero;
import logica.Defensor;
import logica.Delantero;
import logica.Jugador;
import logica.SistemaGranDT;
import logica.Volante;
import vistas.ArmarEquipoFrame;
import vistas.JugadorTableModel;

public class ArmarEquipoControlador {
	private ArmarEquipoFrame frame;
	private SistemaGranDT logica;

	private Vector<Jugador> disponibles;
	//	private EquipoTitular titulares;
	//	private EquipoSuplente suplentes;
	private Vector<Jugador> titulares;
	private Vector<Jugador> suplentes;
	private float montoGastado;
	private float montoDisponible;

	public ArmarEquipoControlador() {
		super();

		//obtenemos referencia al sistema
		this.logica = SistemaGranDT.getInstance();

		//levantamos todos los jugadores para llenar la pantalla
		//levantamos todos los jugadores de la BD
		logica.cargarJugadores();
		//pasasrselos al table model y luego a la ventana
		this.disponibles = logica.getJugadores();

		//DESCOMENTAR ESTO cuando se carge el equipo
		//this.titulares = logica.getUsuarioActual().getEquipo().getEquipoTitular().toVector();

		//this.suplentes = logica.getUsuarioActual().getEquipo().getEquipoSuplente().toVector();

		//TODO Descomentar lo siguiente, solo fue para testear
		//levantamos el equipo titular del usuario logueado
		//this.titulares=this.logica.getUsuarioActual().getEquipo().getEquipoTitular();

		//levantamos el equipo suplente del usuario logueado
		//this.suplentes=this.logica.getUsuarioActual().getEquipo().getEquipoSuplente();

		//obtenemos los demas datos relevantes para la ventana
		this.montoDisponible = this.logica.getUsuarioActual().getMontoDisponible();
		this.montoGastado = this.logica.getUsuarioActual().getMontoGastado();

		//Creamos los tables models para completar las vistas
		JugadorTableModel jug = new JugadorTableModel(this.disponibles);
		JugadorTableModel et = null;
		JugadorTableModel es = null;
		if(this.titulares != null)
			et = new JugadorTableModel(this.titulares);
		else
			et = new JugadorTableModel();
		if(this.suplentes != null)
			es = new JugadorTableModel(this.suplentes);
		else
			es = new JugadorTableModel();

		//Creamos la ventana y la ponemos visible
		this.frame = new ArmarEquipoFrame(jug, et, es);
		//le seteamos esta misma clase como controlador
		this.frame.setControlador(this);
		//seteamos los montos iniciales
		this.frame.getLblMD().setText(this.getMontoDisponibleString());
		this.frame.getLblMG().setText(this.getMontoGastadoString());
		this.frame.setVisible(true);
	}

	public Vector<Jugador> getDisponibles() {
		return disponibles;
	}

	public void setDisponibles(Vector<Jugador> disponibles) {
		this.disponibles = disponibles;
	}

	public Vector<Jugador> getTitulares() {
		return titulares;
	}

	public void setTitulares(Vector<Jugador> titulares) {
		//TODO validar que sea la cantidad correcta
		this.titulares = titulares;
	}

	public Vector<Jugador> getSuplentes() {
		return suplentes;
	}

	public void setSuplentes(Vector<Jugador> suplentes) {
		this.suplentes = suplentes;
	}

	public String getMontoGastadoString() {
		return Float.toString(montoGastado);
	}

	public float getMontoGastado() {
		return montoGastado;
	}

	public void setMontoGastado(float montoGastado) {
		this.montoGastado = montoGastado;
	}


	public String getMontoDisponibleString() {
		return Float.toString(montoDisponible);
	}
	public float getMontoDisponible() {
		return montoDisponible;
	}

	public void setMontoDisponible(float montoDisponible) {
		this.montoDisponible = montoDisponible;
	}

	public ArmarEquipoFrame getFrame() {
		// TODO Auto-generated method stub
		return frame;
	}

	public String validarJugadorTitular(Jugador j, Vector<Jugador> titulares){
		//Validamos que el equipo no este completo
		if(titulares.size() == 11){
			return "Equipo titular completo!";
		}
		//validamos que si el jugador a ingresar es arquero, no exista ningun otro arquero en el equipo
		else if(j instanceof Arquero){
			for(Jugador j1 : titulares){
				if(j1 instanceof Arquero) 
					return "Ya existe un arquero titular!";
			}
			return null;
		}
		//validamos que si el jugador a ingresar es defensor, no existan mas de 4 defensores en el equipo actual
		else if(j instanceof Defensor){
			int cant = 0;
			for(Jugador j1 : titulares){
				if(j1 instanceof Defensor){
					cant++;
					if(cant == 4)
						return "Ya existen 4 Defensores titulares";
				}
			}
			return null;
		}
		//validamos que si el jugador a ingresar es volante, no existan mas de 4 volantes en el equipo actual
		else if (j instanceof Volante){
			int cant = 0;
			for(Jugador j1 : titulares){
				if(j1 instanceof Volante){
					cant++;
					if(cant == 4)
						return "Ya existen 4 Volantes titulares";
				}
			}
			return null;
		}
		//validamos que si el jugador a ingresar es Delantero, no existan mas de 2 delanteros en el equipo actual
		else if(j instanceof Delantero){
			int cant = 0;
			for(Jugador j1 : titulares){
				if (j1 instanceof Delantero){
					cant++;
					if(cant==2)
						return "Ya existen 2 Delanteros titulares";
				}
			}
			return null;
		}
		return null;
	}

	public String validarJugadorSuplente(Jugador j, Vector<Jugador> titulares){
		//Validamos que el equipo no este completo
		if(titulares.size() == 5){
			return "Equipo suplente completo!";
		}
		//validamos que si el jugador a ingresar es arquero, no exista ningun otro arquero en el equipo
		else if(j instanceof Arquero){
			for(Jugador j1 : titulares){
				if(j1 instanceof Arquero) 
					return "Ya existe un arquero suplente!";
			}
			return null;
		}
		//validamos que si el jugador a ingresar es defensor, no existan mas de 4 defensores en el equipo actual
		else if(j instanceof Defensor){
			for(Jugador j1 : titulares){
				if(j1 instanceof Defensor){
					return "Ya existen un Defensor. Solo puedes tener un Defensor suplente";
				}
			}
			return null;
		}
		//validamos que si el jugador a ingresar es volante, no existan mas de 4 volantes en el equipo actual
		else if (j instanceof Volante){
			for(Jugador j1 : titulares){
				if(j1 instanceof Volante){
					return "Ya existe un Volante. Solo puedes tener un Volante suplente";
				}
			}
			return null;
		}
		//validamos que si el jugador a ingresar es Delantero, no existan mas de 2 delanteros en el equipo actual
		else if(j instanceof Delantero){
			int cant = 0;
			for(Jugador j1 : titulares){
				if (j1 instanceof Delantero){
					cant++;
					if(cant==2)
						return "Ya existen 2 Delanteros. Solo puedes tener dos Delanteros suplentes";
				}
			}
			return null;
		}
		return null;
	}



}
