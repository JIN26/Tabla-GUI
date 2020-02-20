/**
 * 
 */
package Evento;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

import Base.Base;
import Datos.Empresa;
import DlgInicio.DlgInicio;
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
		if(e.getSource()==DlgInicio.getInstance().getBut1()) {
			/**
			 * si es un numero valido 
			 */
			if(DlgInicio.getInstance().isNumeric(DlgInicio.getInstance().getTex2().getText())==true) {
				Empresa em = new Empresa (DlgInicio.getInstance().getTex1().getText());
				Empresa.setInstance(em);
				System.out.println(em.getNombre());
				DlgInicio.getInstance().setVisible(false);
				Base.getInstance().setVisible(true);				
			}else {
				DlgInicio.getInstance().getTex3().setText("Dato erroneo intente de nuevo");
				DlgInicio.getInstance().getCentro().updateUI();
				DlgInicio.getInstance().getTex1().setText(" ");
				DlgInicio.getInstance().getTex2().setText(" ");
			}
			
		}
		/*
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
