/**
 * 
 */
package Persona;
import java.util.ArrayList;


/**
 * @author CYBER-SERVER
 *
 */
public class Persona {
	/**
	 * 
	 */
	private static ArrayList<Persona> instance = null;
	/**
	 * @atrib
	 */
	private String nombre;
	private String apellido;
	private int edad;
	private String direccion;
	private boolean estado;
	private static int cont=0;
	/**
	 * @Constructor 
	 */
	public Persona() {
		// TODO Auto-generated constructor stub
		setCont(getCont() + 1);
		this.nombre=" ";
		this.apellido=" ";
		this.direccion="";
		this.edad=0;
		this.estado=true;
	}
	/**
	 * 
	 * @Constructor 
	 */
	public Persona(String nombre,String apellido,int edad, String direccion, boolean estado){
		this.nombre=nombre;
		this.apellido=apellido;
		this.direccion=direccion;
		this.edad=edad;
		this.estado=estado;
	}
	/**
	 * 
	 * @return the Array from persona
	 */
	 public static ArrayList<Persona> getInstance(){
		 if(instance==null){
			 instance = new ArrayList<Persona>();
		 }
		 return instance;
	 }
	 /**
	  * @param instance the instance to set
	  */
	 public static void setInstance(ArrayList<Persona> instance) {
		 Persona.instance = instance;
	 }
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}
	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}
	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	/**
	 * @return the estado
	 */
	public boolean isEstado() {
		return estado;
	}
	/**
	 * @param estado the estado to set
	 */
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	/**
	 * 
	 */
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", direccion=" + direccion
				+ ", estado=" + estado + "]";
	}
	public static int getCont() {
		return cont;
	}
	public static void setCont(int cont) {
		Persona.cont = cont;
	}
}
