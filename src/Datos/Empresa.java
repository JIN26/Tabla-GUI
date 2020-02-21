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
	private List<Cliente> lstCliente;
	private List<Empleado> lstEmpleado;
	private List<Empresa> lstEmpresa;
	private int contEmpresa;
	private int contEmpleado;
	private int contCliente;
	private String nombre;
	/**
	 * 
	 */
	public Empresa() {
		this.nombre= " ";
		setContEmpleado(0);
		setContCliente(0);
		contEmpresa=1;
		lstEmpleado = new ArrayList<Empleado>();
		lstCliente = new ArrayList<Cliente>();
		lstEmpresa = new ArrayList<Empresa>();
		lstEmpresa.add(this);
	}
	/**
	 * 
	 * @param nombre
	 */
	public Empresa(String nombre) {
		this.nombre=nombre;
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
	public List<Empleado> getLstEmpleado() {
		return lstEmpleado;
	}
	public void setLstEmpleado(List<Empleado> lstEmpleado) {
		this.lstEmpleado = lstEmpleado;
	}
	public List<Cliente> getLstCliente() {
		return lstCliente;
	}
	public void setLstCliente(List<Cliente> lstCliente) {
		this.lstCliente = lstCliente;
	}
	/**
	 * @return the contCliente
	 */
	public int getContCliente() {
		return contCliente;
	}
	/**
	 * @param contCliente the contCliente to set
	 */
	public void setContCliente(int contCliente) {
		this.contCliente = contCliente;
	}
	/**
	 * @return the contEmpleado
	 */
	public int getContEmpleado() {
		return contEmpleado;
	}
	/**
	 * @param contEmpleado the contEmpleado to set
	 */
	public void setContEmpleado(int contEmpleado) {
		this.contEmpleado = contEmpleado;
	}
	/**
	 * @return the lstEmpresa
	 */
	public List<Empresa> getLstEmpresa() {
		return lstEmpresa;
	}
	/**
	 * @param lstEmpresa the lstEmpresa to set
	 */
	public void setLstEmpresa(List<Empresa> lstEmpresa) {
		this.lstEmpresa = lstEmpresa;
	}
	/**
	 * @return the contEmpresa
	 */
	public int getContEmpresa() {
		return contEmpresa;
	}
	/**
	 * @param contEmpresa the contEmpresa to set
	 */
	public void setContEmpresa(int contEmpresa) {
		this.contEmpresa = contEmpresa;
	}
}
