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
	//private List<Empleado> lstEmpleado;
	private List<Cliente> lstCliente;
	private String nombre;
	public Empresa(String nombre) {
		super();
		this.nombre=nombre;
		//lstEmpleado = new ArrayList<Empleado>();
		lstCliente = new ArrayList<Cliente>();
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	/*public List<Empleado> getLstEmpleado() {
		return lstEmpleado;
	}
	public void setLstEmpleado(List<Empleado> lstEmpleado) {
		this.lstEmpleado = lstEmpleado;
	}*/
	public List<Cliente> getLstCliente() {
		return lstCliente;
	}
	public void setLstCliente(List<Cliente> lstCliente) {
		this.lstCliente = lstCliente;
	}
}
