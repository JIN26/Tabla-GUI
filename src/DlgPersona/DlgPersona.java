/**
 * 
 */
package DlgPersona;


import java.awt.BorderLayout;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Tabla.Modelo;


/**
 * @author CYBER-SERVER
 *
 */
@SuppressWarnings("serial")
public class DlgPersona extends JDialog {
	private static DlgPersona instance = null;
	private JPanel capa[];
	private JTextField tex[];
	/**
	 * 
	 */
	public DlgPersona() {
		// TODO Auto-generated constructor stub
		this.setSize(500,400);
		setCapa(new JPanel[5]);
		setTex(new JTextField[5]);
		capa[0]= new JPanel(new BorderLayout());
		for (int i = 0; i < capa.length; i++) {
			capa[i+1]= new JPanel();
			tex[i] = new JTextField();
			tex[i].setColumns(20);
			capa[i].add(new JLabel(Modelo.getInstance().getColumnName(i)+": "));
			capa[i+1].add(tex[i]);
		}
	}
	public static DlgPersona getInstance() {
		if(instance==null){
			instance = new DlgPersona();
		}
		return instance;
	}
	public static void setInstance(DlgPersona instance) {
		DlgPersona.instance = instance;
	}
	public JPanel[] getCapa() {
		return capa;
	}
	public void setCapa(JPanel capa[]) {
		this.capa = capa;
	}
	public JTextField[] getTex() {
		return tex;
	}
	public void setTex(JTextField tex[]) {
		this.tex = tex;
	}

}
