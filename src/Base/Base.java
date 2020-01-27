/**
 * 
 */
package Base;


import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import Menu.Menu;
import static Base.WinDimensions.*;

/**
 * @author CYBER-SERVER
 *
 */
@SuppressWarnings("serial")
public class Base extends JFrame{
	private static Base instance = null;
	/**
	 * 
	 */
	public Base() {
		// TODO Auto-generated constructor stub
		initUI(); 
	}
	/**
	 * 
	 */
	private void initUI() {
		// TODO Auto-generated method stub
		//this.setUndecorated(true);
        this.pack();
        this.setSize(winWidth,winHeight);
        setResizable(false);     
        setLocationRelativeTo(null);
	}
	/**
	 * 
	 */
	public static Base getInstance(){
        if(instance==null){
            instance = new Base();
            instance.initComponents();
			instance.defineEvents();
        }
        return instance;
    }
	/**
	 * 
	 */
	private void initComponents() {
		this.setJMenuBar(Menu.getInstance());
        this.getContentPane().add(FondoPanel.getInstance());
    }
	/**
	 * 
	 */
	private void defineEvents() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //addWindowListener(new WindowsEvents());
        //addKeyListener(new KeyEvents());
    	addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e){
              System.out.println("X= "+e.getX()+" Y= "+e.getY());
            }
        });
    }
}
