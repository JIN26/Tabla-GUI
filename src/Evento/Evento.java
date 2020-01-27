/**
 * 
 */
package Evento;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Base.Base;
import Menu.Menu;
/**
 * @author CYBER-SERVER
 *
 */
public class Evento  implements ActionListener{
	/**
	 * @atrib
	 */
	private Base base;
	/**
	 * @constructor
	 */
	public Evento() {
		// TODO Auto-generated constructor stub
		this.setBase(Base.getInstance());
	}
	/**
	 * 
	 * @param frame
	 */
	public Evento(Base base) {
		this.base=base;
	}
	/**
	 * 
	 * @param e
	 */
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==Menu.getInstance().getNuevo()) {
			System.out.println("hola");
			//new DlgPersona(base).setVisible(true);
			return;
		}/*
		if(e.getSource() == base.getListar()){
			base.getModeloTabla().setRowCount(0);
			base.imprimirLista();
		}*/
	}
	/**
	 * 
	 * @return
	 */
	public Base getBase() {
		return base;
	}
	/**
	 * 
	 * @param base
	 */
	public void setBase(Base base) {
		this.base = base;
	}

}
