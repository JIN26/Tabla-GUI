/**
 * 
 */
package Tabla;

import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;

/**
 * @author CYBER-SERVER
 *
 */
@SuppressWarnings("serial")
public class Render extends DefaultTableCellRenderer{

	/**
	 * 
	 */
	public Render() {
	}
	
	@Override
	public Component getTableCellRendererComponent(JTable table, Object value, 
			boolean isSelected, boolean hasFocus, int row, int column) {
		
		if(value instanceof JButton){
			JButton btn = (JButton)value;
			if(isSelected){
				btn.setForeground(table.getSelectionForeground());
				btn.setBackground(table.getSelectionBackground());
			}else{
				btn.setForeground(table.getForeground());
				btn.setBackground(UIManager.getColor("Button.background"));
			}
			return btn;
		}
		
		if(value instanceof JCheckBox){
			JCheckBox ch = (JCheckBox)value;
			ch.setHorizontalAlignment(CENTER);
			return ch;
		}
		
		return super.getTableCellRendererComponent(table, value, isSelected, 
				hasFocus, row, column); //To change body of generated methods, choose Tools | Templates.
	}
}
