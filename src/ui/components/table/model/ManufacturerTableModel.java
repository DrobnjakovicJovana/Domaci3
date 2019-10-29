/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.components.table.model;

import controller.Controller;
import domain.Manufacturer;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Drobnjakovic
 */
public class ManufacturerTableModel extends AbstractTableModel{
List<Manufacturer> manufacturers = Controller.getInstance().getAllManufacturers();
String [] names = new String[]{"ID", "Name"};
    @Override
    public int getRowCount() {
        if(manufacturers ==null)
            return 0;
        return manufacturers.size();
    }

    @Override
    public int getColumnCount() {
        return names.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Manufacturer manuf = manufacturers.get(rowIndex);
        switch(columnIndex){
            case 0: return manuf.getId();
            case 1: return manuf.getName();
            default: return "N/A";
        }
    }

    @Override
    public String getColumnName(int column) {
        return names[column];
    }
    
    
}
