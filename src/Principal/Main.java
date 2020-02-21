/**
 * 
 */
package Principal;
import Base.Base;
import DlgInicio.DlgInicio;
/**
 * @author CYBER-SERVER
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Base.getInstance();	
		DlgInicio.getInstance().setVisible(true);
	}

}
