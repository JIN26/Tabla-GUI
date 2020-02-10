package Datos;
/**
 * 
 * @author MARIO LUZARDO
 * @author MICHAEL CRUZ
 *
 */
public class Persona {
	/**
	 * 
	 */
	private String nombre;
	private int edad;
	/**
	 * 
	 */
	public Persona() {
		this.nombre = " ";
		this.edad = 0;
	}
	/**
	 * 
	 * @param nombre
	 * @param edad
	 */
	public Persona(String nombre, int edad) {
		this.edad=edad;
		this.nombre=nombre;
	}
	/**
	 * 
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * 
	 * @return
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * 
	 * @param edad
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	/**
	 * 
	 */
	public void mostrar() {
		System.out.println("Nombre: "+nombre+
						   "\nEdad: "+edad);
	}
}
