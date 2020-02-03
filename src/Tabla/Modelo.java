/**
 * 
 */
package Tabla;

import javax.swing.JCheckBox;
import javax.swing.table.AbstractTableModel;
import Persona.Persona;

/**
 * @author CYBER-SERVER
 *
 */
@SuppressWarnings("serial")
public class Modelo extends AbstractTableModel {
	/**
	 * 
	 */
	private int rowM=10;
	private int colM=5;
	private static Modelo instance = null;
	@SuppressWarnings("rawtypes")
	private Class[] types;
	/**
	 * 
	 */
	public Modelo() {
		types = new Class[]{
				java.lang.Object.class,
				java.lang.Object.class,
				java.lang.Object.class,
				java.lang.Object.class,
				java.lang.Object.class,
				java.lang.Object.class
		};
	}
	
	public static Modelo getInstance() {
		if(instance==null){
			instance = new Modelo();   
		}
		return instance;
	}
	@Override
	public int getColumnCount() {
		return colM;
	}

	@Override
	public int getRowCount() {
		return Persona.getInstance().size();
	}

	@Override
	public Object getValueAt(int col, int row) {
		if(isCellEditable(row, col)==true) {
			JCheckBox estado = new JCheckBox(" ",true);
			return estado;			
		}
		
		return "HOLA";
	}
	public String getColumnName(int c) {
		String[] title = {"Nombre","Apellido","Edad","Direccion","Estado"};
		return title[c];
	}
	/**
	 * 
	 */
	public Class<?> getColumnClass(int columnIndex) {
        return types[columnIndex];
    }
	/**
	 * 
	 * @param row
	 * @param column
	 * @return
	 */
    public boolean isCellEditable(int row, int col){
    	boolean[] editable={false,false,false,false,true};
        return editable[row];
    }
	/**
	 * @return the rowM
	 */
	public int getRowM() {
		return rowM;
	}

	/**
	 * @param rowM the rowM to set
	 */
	public void setRowM(int rowM) {
		this.rowM = rowM;
	}

	/**
	 * @return the colM
	 */
	public int getColM() {
		return colM;
	}

	/**
	 * @param colM the colM to set
	 */
	public void setColM(int colM) {
		this.colM = colM;
	}

	/**
	 * @return the types
	 */
	@SuppressWarnings("rawtypes")
	public Class[] getTypes() {
		return types;
	}

	/**
	 * @param types the types to set
	 */
	@SuppressWarnings("rawtypes")
	public void setTypes(Class[] types) {
		this.types = types;
	}

	/**
	 * @param instance the instance to set
	 */
	public static void setInstance(Modelo instance) {
		Modelo.instance = instance;
	}
}
