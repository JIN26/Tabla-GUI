package Datos;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author MARIO LUZARDO
 * @author MICHAEL CRUZ
 *
 */
public class Empresa {
	private static Empresa instance = null;
	private List<Cliente> Cliente;
	private String nombre;
	/**
	 * 
	 */
	public Empresa() {
		this.nombre= " ";
		setCliente(new ArrayList<Cliente>());
	}
	/**
	 * 
	 * @param nombre
	 */
	public Empresa(String nombre) {
		this.nombre=nombre;
		setCliente(new ArrayList<Cliente>());
	}
	/**
	 * 
	 * @return
	 */
	public String getNombre() {
		return this.nombre;
	}
	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	/**
	 * 
	 * @return
	 */
	public List<Cliente> getCliente() {
		return Cliente;
	}
	/**
	 * 
	 * @param cliente
	 */
	public void setCliente(List<Cliente> cliente) {
		Cliente = cliente;
	}
	/**
	 * @return the instance
	 */
	public static Empresa getInstance() {
		if(instance==null){
			instance = new Empresa();
		}
		return instance;
	}
	/**
	 * @param instance the instance to set
	 */
	public static void setInstance(Empresa instance) {
		Empresa.instance = instance;
	}
}
