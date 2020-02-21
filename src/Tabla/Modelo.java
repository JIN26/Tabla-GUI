/**
 * 
 */
package Tabla;

import javax.swing.JCheckBox;
import javax.swing.table.AbstractTableModel;

import Datos.Empresa;

/**
 * @author CYBER-SERVER
 *
 */
@SuppressWarnings("serial")
public class Modelo extends AbstractTableModel {
	/**
	 * 
	 */
	private int colM=5;
	private static Modelo instance = null;
	private int tipo;
	private int cont;
	@SuppressWarnings("rawtypes")
	private Class[] types;
	/**
	 * 
	 */
	public Modelo() {
		setCont(Empresa.getInstance().getContEmpresa());
		tipo=0;
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
		if(tipo==2) {
			return 4;
		}else if(tipo==1) {
			return 3;
		}else {
			return 1;
			
		}
	}

	@Override
	public int getRowCount() {
		return cont;
	}

	@Override
	public Object getValueAt(int col, int row) {
		if(isCellEditable(row, col)==true) {
			JCheckBox estado = new JCheckBox(" ",true);
			return estado;			
		}
		if(getColumnName(row)=="Nombre") {
			return Empresa.getInstance().getNombre();
		}
		
		return "HOLA";
	}
	public String getColumnName(int c) {
		String[] title = new String [5];
		if(tipo==2){
						
		}else if(tipo==1) {
			
		}else {
			title[0] = "Nombre";
		}
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

	/**
	 * @return the cont
	 */
	public int getCont() {
		return cont;
	}

	/**
	 * @param cont the cont to set
	 */
	public void setCont(int cont) {
		this.cont = cont;
	}
}
