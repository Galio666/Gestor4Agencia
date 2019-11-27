/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.util.ArrayList;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author TOM
 */
public class UsuariosTabla extends  AbstractTableModel implements TableModelListener {
    
      ArrayList<Usuario> lista;
    String[] encabezados;
    
    public UsuariosTabla()
    {
        lista  = new ArrayList<Usuario>();
        encabezados = new String[5];
        encabezados[0] = "FOLIO";
        encabezados[1] = "NOMBRE";
        encabezados[2] = "APELLPATERNO";
        encabezados[3] = "APMATERNO";
        encabezados[4] = "ESTADO";
        
    }
    
    public UsuariosTabla(ArrayList<Usuario> lista)
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
        
        Usuario user = lista.get(rowIndex);
        
        switch(columnIndex)
        {
            case 0: return user.folio;
            case 1: return  user.nombre;
            case 2: return  user.apPaterno;
            case 3: return  user.apMaterno;
            case 4: return  user.estado;
            
            default: return "Non emplementar";
        }
        
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        if (rowIndex<0 && columnIndex< 0)
        {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
        Usuario user = lista.get(rowIndex);
        
        switch(columnIndex)
        {
            case 0:  user.folio = (String)aValue;
                     break;
            case 1: user.nombre = (String)aValue;
                     break;
            case 2: user.apPaterno  = (String)aValue;
                     break;
            case 3: user.apMaterno = (String)aValue;
                     break;
            case 4: user.estado = (String)aValue;
                     break;
            
        }
        
    }

           @Override
    public void tableChanged(TableModelEvent e) {
       
    }
}
