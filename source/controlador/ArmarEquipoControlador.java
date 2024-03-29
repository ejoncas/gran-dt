package controlador;

import java.util.Vector;

import javax.swing.DefaultComboBoxModel;

import logica.Arquero;
import logica.Defensor;
import logica.Delantero;
import logica.EquipoSuplente;
import logica.EquipoTitular;
import logica.Jugador;
import logica.SistemaGranDT;
import logica.Volante;
import vistas.ArmarEquipoFrame;

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
	private JugadorTableModel jug ;
	private JugadorTableModel et;
	private JugadorTableModel es;


	public ArmarEquipoControlador() {
		super();

		//obtenemos referencia al sistema
		this.logica = SistemaGranDT.getInstance();

		//levantamos todos los jugadores para llenar la pantalla
		//levantamos todos los jugadores de la BD
		logica.cargarJugadores();
		logica.cargarEquipoTitular();
		logica.cargarEquipoSuplente();


		//los seteamos a las vars locales
		this.disponibles = logica.getJugadores();
		this.titulares = logica.getUsuarioActual().getEquipo().getEquipoTitular().toVector();
		this.suplentes = logica.getUsuarioActual().getEquipo().getEquipoSuplente().toVector();


		//TODO Descomentar lo siguiente, solo fue para testear
		//levantamos el equipo titular del usuario logueado
		//this.titulares=this.logica.getUsuarioActual().getEquipo().getEquipoTitular();

		//levantamos el equipo suplente del usuario logueado
		//this.suplentes=this.logica.getUsuarioActual().getEquipo().getEquipoSuplente();

		//obtenemos los demas datos relevantes para la ventana
		this.montoDisponible = this.logica.getUsuarioActual().getMontoDisponible();
		this.montoGastado = this.logica.getUsuarioActual().getMontoGastado();

		//Creamos los tables models para completar las vistas
		//aca a disponibles habria que sacarle los que ya tiene
		//limpiamos los disponibles de los que el jugador ya tiene
		this.limpiarDisponibles();
		//creamos los disponibles
		jug = new JugadorTableModel(this.disponibles);
		et = null;
		es = null;
		if(!this.titulares.isEmpty())
			et = new JugadorTableModel(this.titulares);
		else
			et = new JugadorTableModel();
		if(!this.suplentes.isEmpty())
			es = new JugadorTableModel(this.suplentes);
		else
			es = new JugadorTableModel();

		//Creamos la ventana y la ponemos visible
		this.frame = new ArmarEquipoFrame(jug, et, es);
		//le seteamos esta misma clase como controlador
		this.frame.setControlador(this);

		//Seteamos el combo de los clubes
		Vector<String> clubes= this.logica.getAdminDAO().obtenerClubes();
		clubes.add(0, "Clubes");
		DefaultComboBoxModel cmb = new DefaultComboBoxModel(clubes);
		this.frame.getCmbClub().setModel(cmb);
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

	//se encarga de guardar el equipo
	public String guardarEquipoT(Vector<Jugador> datalist) {
		//lo unico que hay que verificar es que sean 11
		if(datalist.size()==11){
			EquipoTitular e = new EquipoTitular();
			//no necesito verificar porque se que si o si la ventana te deja armar el equipo bien
			for(Jugador j : datalist){
				if(j instanceof Arquero)
					e.addArquero((Arquero)j);
				else if (j instanceof Defensor)
					e.addDefensor((Defensor)j);
				else if (j instanceof Delantero)
					e.addDelantero((Delantero)j);
				else if (j instanceof Volante)
					e.addVolante((Volante)j);
			}
			//guardamos en el modelo
			this.logica.getUsuarioActual().getEquipo().setEquipoTitular(e);
			this.logica.getUsuarioActual().setMontoDisponible(montoDisponible);
			this.logica.getUsuarioActual().setMontoGastado(montoGastado);
			//TODO guardar en la base
			this.logica.getAdminDAO().updateMontosUsuario(this.logica.getUsuarioActual(),montoDisponible, montoGastado);
			this.logica.getAdminDAO().guardarEquipoTitular(this.logica.getUsuarioActual().getEquipo(), e);

			return null;
		}
		else{
			return "Equipo Titular incompleto. Por favor, complete el equipo antes de poder guardarlo";
		}


	}


	//se encarga de guardar el equipo suplente
	public String gaurdarEquipoS(Vector<Jugador> datalist) {
		//lo unico que hay que verificar es que sean 11
		if(datalist.size()==5){
			EquipoSuplente e = new EquipoSuplente();
			//no necesito verificar porque se que si o si la ventana te deja armar el equipo bien
			for(Jugador j : datalist){
				if(j instanceof Arquero)
					e.addArquero((Arquero)j);
				else if (j instanceof Defensor)
					e.addDefensor((Defensor)j);
				else if (j instanceof Delantero)
					e.addDelantero((Delantero)j);
				else if (j instanceof Volante)
					e.addVolante((Volante)j);
			}
			//guardamos en el modelo
			this.logica.getUsuarioActual().getEquipo().setEquipoSuplente(e);
			this.logica.getAdminDAO().guardarEquipoSuplente(this.logica.getUsuarioActual().getEquipo(), e);

			return null;
		}
		else{
			return "Equipo Suplente incompleto. Por favor, complete el equipo antes de poder guardarlo";
		}

	}

	private void limpiarDisponibles(){
		this.disponibles.removeAll(this.titulares);
		this.disponibles.removeAll(this.suplentes);
	}

	public void procesarFiltros(String pos, String club) {

		//limpiamos el modelo de tabla por los posibles filtros aplicados anteriormente
		jug.cleanDatalist();
		//ponemos todos los jugadores disponibles
		jug.addJugadorList(disponibles);

		Vector<Jugador> jugTable = jug.getDatalist();
		//los filtramos
		if(pos.equals("Arquero"))
			for(Jugador j : this.disponibles){
				if(!j.getPosicion().equals("ARQ"))
					jugTable.remove(j);
			}
		if(pos.equals("Volante"))
			for(Jugador j : this.disponibles){
				if(!j.getPosicion().equals("VOL"))
					jugTable.remove(j);
			}
		if(pos.equals("Defensor"))
			for(Jugador j : this.disponibles){
				if(!j.getPosicion().equals("DEF"))
					jugTable.remove(j);
			}
		if(pos.equals("Delantero"))
			for(Jugador j : this.disponibles){
				if(!j.getPosicion().equals("DEL"))
					jugTable.remove(j);
			}
		//Filtramos los clubes
		if(!club.equals("Clubes"))
			for(Jugador j : this.disponibles){
				if(!j.getEquipo().equals(club))
					jugTable.remove(j);
			}

		jug.fireTableDataChanged();

	}

}

