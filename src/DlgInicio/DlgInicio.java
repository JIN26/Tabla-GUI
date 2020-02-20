/**
 * 
 */
package DlgInicio;


import java.awt.BorderLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Evento.Evento;



/**
 * @author CYBER-SERVER
 *
 */
@SuppressWarnings("serial")
public class DlgInicio extends JDialog {
	private static DlgInicio instance = null;
	private JPanel centro;
	private JTextField tex1;
	private JTextField tex2;
	private JLabel tex3;
	private JButton but1;
	private JButton but2;
	/**
	 * 
	 */
	/**
	 * 
	 */
	public DlgInicio() {
		this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		this.setSize(200, 175);
		this.setLocationRelativeTo(null);
		this.setTitle("Crear Empresa");
		
		centro = new JPanel();
		tex1 = new JTextField();
		tex1.setColumns(10);
		centro.add(new JLabel("Nombre: "));
		centro.add(tex1);
		
		tex2 = new JTextField();
		tex2.setColumns(3);
		centro.add(new JLabel("Datos/Pagina: "));
		centro.add(tex2);
		
		tex3 = new JLabel();
		centro.add(tex3);
		
		JPanel sur = new JPanel();
		but1 = new JButton("Crear");
		but2 = new JButton("Cancelar");
		but1.addActionListener( new Evento());
		but2.addActionListener((ActionEvent ae) -> System.exit(0));
		sur.add(but1);
		sur.add(but2);
		getContentPane().add(centro, BorderLayout.CENTER);
		getContentPane().add(sur, BorderLayout.SOUTH);
	}
	/**
	 * @return the tex1
	 */
	public JTextField getTex1() {
		return tex1;
	}
	/**
	 * @param tex1 the tex1 to set
	 */
	public void setTex1(JTextField tex1) {
		this.tex1 = tex1;
	}
	/**
	 * @return the tex2
	 */
	public JTextField getTex2() {
		return tex2;
	}
	/**
	 * @param tex2 the tex2 to set
	 */
	public void setTex2(JTextField tex2) {
		this.tex2 = tex2;
	}
	/**
	 * @return the but1
	 */
	public JButton getBut1() {
		return but1;
	}
	/**
	 * @param but1 the but1 to set
	 */
	public void setBut1(JButton but1) {
		this.but1 = but1;
	}
	/**
	 * @return the but2
	 */
	public JButton getBut2() {
		return but2;
	}
	/**
	 * @param but2 the but2 to set
	 */
	public void setBut2(JButton but2) {
		this.but2 = but2;
	}
	/**
	 * 
	 * @return
	 */
	public static DlgInicio getInstance() {
		if(instance==null){
			instance = new DlgInicio();
		}
		return instance;
	}
	/**
	 * 
	 * @param instance
	 */
	public static void setInstance(DlgInicio instance) {
		DlgInicio.instance = instance;
	}
	/**
	 * @return the centro
	 */
	public JPanel getCentro() {
		return centro;
	}
	/**
	 * @param centro the centro to set
	 */
	public void setCentro(JPanel centro) {
		this.centro = centro;
	}
	/**
	 * 
	 * @param cadena
	 * @return
	 */
	public boolean isNumeric(String cadena){  
		try {  
			Integer.parseInt(cadena);   
			return true;  
		} 
		catch (NumberFormatException nfe){  
			System.out.println("erronea ingresé de nuevo"); 
			cadena = (" ");
			return false; 
		} 
	}
	/**
	 * @return the tex3
	 */
	public JLabel getTex3() {
		return tex3;
	}
	/**
	 * @param tex3 the tex3 to set
	 */
	public void setTex3(JLabel tex3) {
		this.tex3 = tex3;
	}
}
