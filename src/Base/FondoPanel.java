/**
 * 
 */
package Base;

import java.awt.BorderLayout;
import java.io.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import Tabla.Tabla;

/**
 * @author CYBER-SERVER
 *
 */
@SuppressWarnings("serial")
public class FondoPanel extends JPanel {
	
	private static FondoPanel instance = null; 

	/**
	 * 
	 */
	public FondoPanel() {
		// TODO Auto-generated constructor stub
		setOpaque(true);
		setBorder(new EmptyBorder(5,5,5,5));
    	setLayout(new BorderLayout(0,0));
    	Tabla tabla =new Tabla();
    	tabla.getScrollTabla().setViewportView(Tabla.getInstance());
    	this.add(tabla.getScrollTabla());
	}
	/**
	 * 
	 * @return
	 * @throws IOException
	 */
	public static FondoPanel getInstance(){
		if(instance==null){
			instance = new FondoPanel();   
		}
		return instance;    
	}
	
	/*@Override
	public void paint(Graphics g){
		this.setBounds(0,0, winWidth, winHeight);        
		ImageIcon foto = ImageLoader.getInstance().getVentana(0);
		Image image= new ImageIcon(foto.getImage().getScaledInstance(getWidth(),getHeight(), Image.SCALE_SMOOTH)).getImage();
		g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
	}*/
	    
}
