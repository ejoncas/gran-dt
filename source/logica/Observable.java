package logica;
public interface Observable {

	public void addObserver(Object aObserver_o);

	public void removeObserver(Object aObserver_o);

	public void notifyObservers();
}