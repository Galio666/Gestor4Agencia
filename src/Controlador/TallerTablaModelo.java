/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author TOM
 */
public class TallerTablaModelo extends  AbstractTableModel implements TableModelListener {

     ArrayList<Taller> lista;
    String[] encabezados;
    
    public TallerTablaModelo()
    {
        lista  = new ArrayList<Taller>();
        encabezados = new String[5];
        encabezados[0] = "IDTALLER";
        encabezados[1] = "NOMBRE";
        encabezados[2] = "DESCRIPCION";
        encabezados[3] = "NOMBRE PROFESOR";
        encabezados[4] = "NUM AULA";
        
    }
    
    public TallerTablaModelo(ArrayList<Taller> lista)
    {
        this();
        this.lista = lista;
    }
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return encabezados.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex >= 0 && columnIndex < encabezados.length)
            return encabezados[columnIndex];
        
        return "Sin Nombre";
    }

    

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        Taller tall = lista.get(rowIndex);
        
        switch(columnIndex)
        {
            case 0: return tall.idTaller;
            case 1: return  tall.nombre;
            case 2: return  tall.descripcion;
            case 3: return  tall.nombreProfesor;
            case 4: return  tall.noAula;
            
            default: return "Non emplementar";
        }
        
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        if (rowIndex<0 && columnIndex< 0)
        {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
        Taller tall = lista.get(rowIndex);
        
        switch(columnIndex)
        {
            case 0:  tall.idTaller = (String)aValue;
                     break;
            case 1: tall.nombre = (String)aValue;
                     break;
            case 2: tall.descripcion  = (String)aValue;
                     break;
            case 3: tall.nombreProfesor = (String)aValue;
                     break;
            case 4: tall.noAula = (String)aValue;
                     break;
            
        }
        
    }

           @Override
    public void tableChanged(TableModelEvent e) {
       
    }
}
