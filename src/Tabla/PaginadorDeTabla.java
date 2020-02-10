/**
 * ORDEN CREACION DE METODOS
 * 1- crearListadoDeFilasPermitidas().
 */

package Tabla;

import javax.swing.*;
import javax.swing.table.TableModel;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class PaginadorDeTabla {
    
    //Creamos el contenedor que alojará los botones paginadores.     
    private JPanel panelPaginacionBotones;
    
    
    //Creamos una lista desplegable(JComboBox) de tipo entero para listar el numero de filas que se visualizaran 
    //en el JTable.    
    private JComboBox<Integer> listaLimiteDeFilas;    
    
    //Creamos un array el cual tendra el listado de filas permitidas a mostrar en el JTable.
    private final int[] numeroDeFilasPermitidas;
    
    //creamos una variable tipo entero el cual tendra el numero de filas a mostrar en el JTable.
    private int filasPermitidasPorDefecto=10;
    
    private int paginaActual = 1;
    
    //Creamos un objeto de tipo ObjectTableModel el cual sera el modelo de nuestra Tabla.
    private Modelo modeloDeTabla;
    
    //Limite permitido de botones a mostrar en la paginación.
    private final int limiteBotonesPaginadores = 12;
    
    
    public PaginadorDeTabla(int[] numeroDeFilasPermitidas, int filasPermitidasPorDefecto) {
        this.numeroDeFilasPermitidas = numeroDeFilasPermitidas;
        this.filasPermitidasPorDefecto = filasPermitidasPorDefecto;
        init();
        
    }    

    private void init() {        
        inicializarModeloDeTabla();
        paginar();
    }
    
    private void inicializarModeloDeTabla() {
        TableModel model = Tabla.getInstance().getModel();
             
        modeloDeTabla = (Modelo) model;
    }

    /**
     * Metodo para agregar la lista desplegable referente al numero de filas permitidas en el JTable
     * @param panelPaginador recibe como argumento el contenedor donde agregaremos los componentes referente a la 
     * paginación.
     */
    public void crearListadoDeFilasPermitidas(JPanel panelPaginador){
        
        panelPaginacionBotones = new JPanel(new GridLayout(1, limiteBotonesPaginadores, 3, 3));
        panelPaginador.add(panelPaginacionBotones);        

        if (numeroDeFilasPermitidas != null) {
            
            Integer array[] = new Integer[numeroDeFilasPermitidas.length];
            for(int i=0; i<numeroDeFilasPermitidas.length; i++){
                array[i] = numeroDeFilasPermitidas[i];
            }
            listaLimiteDeFilas = new JComboBox<>(array);
                        
            panelPaginador.add(Box.createHorizontalStrut(15));
            panelPaginador.add(new JLabel("Número de Filas: "));
            panelPaginador.add(listaLimiteDeFilas);
            
        }
        
        
    }    
    
    public void eventCombobBox(JComboBox<Integer> pageComboBox){

        int currentPageStartRow = ((paginaActual - 1) * filasPermitidasPorDefecto) + 1;
        filasPermitidasPorDefecto = (Integer) pageComboBox.getSelectedItem();
        paginaActual = ((currentPageStartRow - 1) / filasPermitidasPorDefecto) + 1;
        paginar();        
    
    }
    
    

    public void refreshPageButtonPanel() {
        
        //Eliminamos los compononentes del contenedor(JPnael)
        panelPaginacionBotones.removeAll();
        
        //Obtenemos numero total de filas del JTable
       // int totalRows = dataProvider.getTotalRowCount();
        
        //Calculamos el numero de paginas que tendrá la paginación teniendo en cuenta el numero de filas a mostrar.
        /*int pages = (int) Math.ceil((double) totalRows / filasPermitidasPorDefecto);
        
        //Creamos un objeto de tipo ButtonGroup.
        ButtonGroup buttonGroup = new ButtonGroup();
        
        //Verificamos si el numero de paginas es mayor al limite de componentes a mostrar en el paginador(9).
        if (pages > limiteBotonesPaginadores) {
            
            addPageButton(panelPaginacionBotones, buttonGroup, 1);
            if (paginaActual > (pages - ((limiteBotonesPaginadores + 1) / 2))) {
                panelPaginacionBotones.add(createEllipsesComponent());
                addPageButtonRange(panelPaginacionBotones, buttonGroup, pages - limiteBotonesPaginadores + 3, pages);
            } else if (paginaActual <= (limiteBotonesPaginadores + 1) / 2) {
                addPageButtonRange(panelPaginacionBotones, buttonGroup, 2, limiteBotonesPaginadores - 2);
                panelPaginacionBotones.add(createEllipsesComponent());
                addPageButton(panelPaginacionBotones, buttonGroup, pages);
            } else {
                panelPaginacionBotones.add(createEllipsesComponent());
                int start = paginaActual - (limiteBotonesPaginadores - 4) / 2;
                int end = start + limiteBotonesPaginadores - 5;
                addPageButtonRange(panelPaginacionBotones, buttonGroup, start, end);
                panelPaginacionBotones.add(createEllipsesComponent());
                addPageButton(panelPaginacionBotones, buttonGroup, pages);
            }
        } else {
            addPageButtonRange(panelPaginacionBotones, buttonGroup, 1, pages);
        }
        panelPaginacionBotones.getParent().validate();
        panelPaginacionBotones.getParent().repaint();*/
    }    
    
    private Component createEllipsesComponent() {
        return new JLabel("...", SwingConstants.CENTER);
    }

    private void addPageButtonRange(JPanel parentPanel, ButtonGroup buttonGroup, int start, int end) {
        //Hacemos un recorrido con el bucle FOR y agregamos los componentes(Botones) que correspondan.
        int init = start;
        for (start=init; start <= end; start++) {
            addPageButton(parentPanel, buttonGroup, start);
        }
    }

    private void addPageButton(JPanel parentPanel, ButtonGroup buttonGroup, int pageNumber) {
        
        //Creamos un boton de tipo JToggleButton pasamos como texto el numero de pagina que este tendrá
        JToggleButton toggleButton = new JToggleButton(Integer.toString(pageNumber));
        
        //Aplicamos margenes al boton.
        toggleButton.setMargin(new Insets(1, 3, 1, 3));
        
        //Agrupamos el boton al ButtonGroup.
        buttonGroup.add(toggleButton);
        
        //Agregamos al contenedor paginador el boton creado
        parentPanel.add(toggleButton);
        
        //Verificamos si estamos posicionados en el numero actual de pagina, si este es el caso seleccionamos dicho boton
        if (pageNumber == paginaActual) {
            toggleButton.setSelected(true);
        }
        
        //Agregamos un evento de tipo actionListener al boton
        toggleButton.addActionListener(ae -> {
            //Agregamos la pagina actual la cual a referencia al boton seleccionado.
            paginaActual = Integer.parseInt(ae.getActionCommand());
            paginar();
        });
    }

    
    
    private void paginar() {
        //int startIndex = (paginaActual - 1) * filasPermitidasPorDefecto;
        //int endIndex = startIndex + filasPermitidasPorDefecto;
        /*if (endIndex > Persona.getCont()){
            endIndex =Persona.getCont();
        }*/
        Modelo.getInstance().fireTableDataChanged();
    }
    
    
    public JComboBox<Integer> getComboBoxPage() {
        return listaLimiteDeFilas;
    }

    public void setComboBoxPage(JComboBox<Integer> comboBoxPage) {
        this.listaLimiteDeFilas = comboBoxPage;
    }
    
    
    
}