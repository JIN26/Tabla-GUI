/**
 * 
 */
package Tabla;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.TableModel;

/**
 * @author CYBER-SERVER
 *
 */
public class Tabla{
	/**
	 * 
	 */
	private static JTable instance = null;
	private JScrollPane scrollTabla;
	/**
	 * 
	 */
	public Tabla(){
		// TODO Auto-generated constructor stub
		
		TableModel modelo = new Modelo();
		instance = new JTable(modelo);  
		//instance.setDefaultRenderer(columnClass, renderer);
		scrollTabla = new JScrollPane();
		scrollTabla.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollTabla.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollTabla.setSize(100, 200);
	}
	public static JTable getInstance() {
		return instance;
	}
	public static void setInstance(JTable instance) {
		Tabla.instance = instance;
	}
	/**
	 * @return the scrollTabla
	 */
	public JScrollPane getScrollTabla() {
		return scrollTabla;
	}
	/**
	 * @param scrollTabla the scrollTabla to set
	 */
	public void setScrollTabla(JScrollPane scrollTabla) {
		this.scrollTabla = scrollTabla;
	}
	
}
