/**
 * 
 */
package Menu;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import Evento.Evento;

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
	private JMenuItem nuevo;
	private JMenuItem listar;
	/**
	 * 
	 */
	public Menu() {
		// TODO Auto-generated constructor stub
		archivo = new JMenu("Archivo");
		nuevo = new JMenuItem("Nuevo");
		listar = new JMenuItem("Listar");
    	
		this.add(archivo);
    	archivo.add(nuevo);
    	archivo.add(listar);
    	
    	nuevo.addActionListener( new Evento());
    	listar.addActionListener(new Evento());
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
	 * @return the nuevo
	 */
	public JMenuItem getNuevo() {
		return nuevo;
	}
	/**
	 * @param nuevo the nuevo to set
	 */
	public void setNuevo(JMenuItem nuevo) {
		this.nuevo = nuevo;
	}
	/**
	 * @return the listar
	 */
	public JMenuItem getListar() {
		return listar;
	}
	/**
	 * @param listar the listar to set
	 */
	public void setListar(JMenuItem listar) {
		this.listar = listar;
	}

}
