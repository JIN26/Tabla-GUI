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
			//new DlgPersona(base).setVisible(true);
			return;
		}/*
		if(e.getSource() == base.getListar()){
			base.getModeloTabla().setRowCount(0);
			base.imprimirLista();
		}
		if(e.getSource()==dialogo.getOk()){
            String nombre=dialogo.getText1().getText();
            String apellido=dialogo.getText2().getText();
            int edad =Integer.valueOf(dialogo.getText3().getSelectedItem().toString());
            String direccion = dialogo.getText4().getText();
            boolean estado=dialogo.getEstado().isSelected();
            
            Persona p=new Persona(nombre,apellido,edad,direccion,estado);

            dialogo.getFrame().addPersona(p);    
            dialogo.getText1().setText(" ");
            dialogo.getText1().requestFocus();
            dialogo.getText2().setText(" ");
            dialogo.getText2().requestFocus();
            dialogo.getText3().setSelectedItem(0);;
            dialogo.getText3().requestFocus();
            dialogo.getText4().setText(" ");
            dialogo.getText4().requestFocus();
            dialogo.getEstado().setSelected(false);
            dialogo.getEstado().requestFocus();
        }
        if(e.getSource()==dialogo.getCancel()){
            dialogo.setVisible(false);
            dialogo.dispose();
            return;
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
