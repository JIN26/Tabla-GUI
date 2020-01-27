/**
 * 
 */
package Tabla;

import javax.swing.JCheckBox;
import javax.swing.table.AbstractTableModel;

/**
 * @author CYBER-SERVER
 *
 */
@SuppressWarnings("serial")
public class Modelo extends AbstractTableModel {
	/**
	 * 
	 */
	private static Modelo instance = null;

	/**
	 * 
	 */
	public Modelo() {
		// TODO Auto-generated constructor stub
	}
	
	public static Modelo getInstance() {
		if(instance==null){
			instance = new Modelo();   
		}
		return instance;
	}
	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return 30;
	}

	@Override
	public Object getValueAt(int col, int row) {
		// TODO Auto-generated method stub
		JCheckBox estado = new JCheckBox(" ",true);
		//getC.setCellEditor(new DefaultCellEditor(comboBox));
		return (JCheckBox)estado;
	}
	public String getColumnName(int c) {
		String[] title = {"Nombre","Apellido","Edad","Direccion","Estado"};
		
		return title[c];
	}
}
