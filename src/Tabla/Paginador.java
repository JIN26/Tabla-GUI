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
		paginados = new  JToggleButton[10];
		for (int i = 0; i < 10; i++) {
			paginados[i] = new  JToggleButton(Integer.toString(i+1));
			paginados[i].setMargin(new Insets(1, 5, 1, 5));
			this.add(paginados[i]);
		}
		this.add(new JLabel("..."));
		this.add(paginados[paginados.length-1]);
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
}
