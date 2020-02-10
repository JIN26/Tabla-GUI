/**
 * 
 */
package Menu;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 * @author CYBER-SERVER
 *
 */
@SuppressWarnings("serial")
public class Menu extends JMenuBar{
	private static Menu instance = null;
	/**
	 * 
	 */
	private JMenu archivo;
	private JMenuItem empleado;
	private JMenuItem cliente;
	private JMenuItem salir;
	/**
	 * 
	 */
	public Menu() {
		archivo = new JMenu("Archivo");
		empleado = new JMenuItem("Empleado");
		cliente = new JMenuItem("Cliente");
		salir = new JMenuItem("Salir");
		
		this.add(archivo);
    	archivo.add(empleado);
    	archivo.add(cliente);
    	archivo.add(salir);
    	
    	//nuevo.addActionListener( new Evento());
    	//listar.addActionListener(new Evento());
	}
	/**
	 * 
	 * @return
	 */
	public static Menu getInstance(){
        if(instance==null){
            instance = new Menu();
        }
        return instance;
    }
	/**
	 * @return the archivo
	 */
	public JMenu getArchivo() {
		return archivo;
	}
	/**
	 * @param archivo the archivo to set
	 */
	public void setArchivo(JMenu archivo) {
		this.archivo = archivo;
	}
	/**
	 * @return the empleado
	 */
	public JMenuItem getEmpleado() {
		return empleado;
	}
	/**
	 * @param empleado the empleado to set
	 */
	public void setEmpleado(JMenuItem empleado) {
		this.empleado = empleado;
	}
	/**
	 * @return the cliente
	 */
	public JMenuItem getCliente() {
		return cliente;
	}
	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(JMenuItem cliente) {
		this.cliente = cliente;
	}
	/**
	 * @return the salir
	 */
	public JMenuItem getSalir() {
		return salir;
	}
	/**
	 * @param salir the salir to set
	 */
	public void setSalir(JMenuItem salir) {
		this.salir = salir;
	}
	/**
	 * @param instance the instance to set
	 */
	public static void setInstance(Menu instance) {
		Menu.instance = instance;
	}
}
