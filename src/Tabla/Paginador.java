/**
 * 
 */
package Tabla;

import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

/**
 * @author CYBER-SERVER
 *
 */
@SuppressWarnings("serial")
public class Paginador extends JPanel{
	/**
	 * 
	 */
	private static Paginador instance = null;
	private int cantidad;
	private JToggleButton[] paginados;
	/**
	 * 
	 */
	public Paginador() {
		initComponent();
	}
	/**
	 * 
	 */
	public void initComponent() {
		this.cantidad =1;
		actualizarPage();
	}
	public static Paginador getInstance() {
		if(instance==null){
			instance = new Paginador();   
		}
		return instance;
	}
	public static void setInstance(Paginador instance) {
		Paginador.instance = instance;
	}
	/**
	 * @return the cantidad
	 */
	public int getCantidad() {
		return cantidad;
	}
	/**
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public void actualizarPage() {
		this.removeAll();
		int pages = (int) Math.ceil((double) Modelo.getInstance().getCont() / 2);
		System.out.println(cantidad);
		paginados = new  JToggleButton[pages];
		for (int i = 0; i < pages; i++) {
			paginados[i] = new  JToggleButton(Integer.toString(i+1));
			paginados[i].setMargin(new Insets(1, 5, 1, 5));
			this.add(paginados[i]);
		}
		this.add(new JLabel("..."));
		//this.add(paginados[paginados.length-1]);
	}
}
