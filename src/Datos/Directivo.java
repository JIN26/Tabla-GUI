package Datos;

import java.util.ArrayList;

/**
 * 
 * @author MARIO LUZARDO
 * @author MICHAEL CRUZ
 *
 */
public class Directivo extends Empleado{
	private String categoria;
	private ArrayList<Directivo> instance;
	public Directivo() {
	
	}
	public Directivo(String categoria) {
		this.categoria=categoria;
	}
	public String getCategoria() {
		return this.categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria=categoria;
	}
	@Override
	public void mostrar() {
		System.out.println("Nombre: "+getNombre()
						  +"\nEdad: "+getEdad()
						  +"\nSueldo Bruto: "+getSueldo_bruto()
						  +"\nCategoria: "+this.categoria);
	}
}
