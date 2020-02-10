package Datos;
/**
 * 
 * @author MARIO LUZARDO
 * @author MICHAEL CRUZ
 *
 */
public class Empleado extends Persona{
	/**
	 * 
	 */
	private double sueldo_bruto;
	private Empresa miEmpresa;
	/**
	 * 
	 */
	public Empleado() {
		super();
		sueldo_bruto = 0;
	}
	/**
	 * 
	 * @param nombre
	 * @param edad
	 * @param sueldo_bruto
	 */
	public Empleado(String nombre,int edad, double sueldo_bruto) {
		super(nombre,edad);
		this.sueldo_bruto=sueldo_bruto;
	}
	/**
	 * 
	 * @return
	 */
	public Empresa getMiEmpresa() {
		return miEmpresa;
	}
	/**
	 * 
	 * @param miEmpresa
	 */
	public void setoEmpresa(Empresa miEmpresa) {
		this.miEmpresa = miEmpresa;
	}
	/**
	 * 
	 * @return
	 */
	public double getSueldo_bruto() {
		return sueldo_bruto;
	}
	/**
	 * 
	 * @param sueldo_bruto
	 */
	public void setSueldo_bruto(double sueldo_bruto) {
		this.sueldo_bruto = sueldo_bruto;
	}
	@Override
	public void mostrar() {
		System.out.println("Nombre: "+getNombre()+
				           "\nEdad: "+getEdad()+
				           "\nSueldo Bruto: "+this.sueldo_bruto);
	}
	/**
	 * 
	 * @return
	 */
	public double calcular_salario_neto() {
		return 0;
	}
}
