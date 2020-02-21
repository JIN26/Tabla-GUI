/**
 * 
 */
package Tabla;

import java.awt.event.MouseEvent;

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
		TableModel modelo = new Modelo();
		instance = new JTable(modelo);  
		instance.setDefaultRenderer(instance.getColumnClass(0), new Render());
		scrollTabla = new JScrollPane();
		scrollTabla.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollTabla.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollTabla.setSize(100, 200);
		
		instance .addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mousePressed(MouseEvent me) {
		       int row = instance.getSelectedRow();
		       if (me.getClickCount() == 2) {
		    	   System.out.println(instance.getValueAt(row, 0).toString());
		       }
		    }
		});
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
