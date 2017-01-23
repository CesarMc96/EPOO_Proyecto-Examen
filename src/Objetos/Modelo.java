
package Objetos;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class Modelo extends AbstractTableModel {

    private final ArrayList<Persona> coleccion;

    public Modelo(ArrayList<Persona> arreglo) {
        coleccion = arreglo;
    }

    @Override
    public int getRowCount() {
        return coleccion.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Persona temporal = coleccion.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return temporal.getNombre();
            case 1:
                return temporal.getUsuario();
            case 2:
                return temporal.getContrasena();
            case 3: 
                return temporal.getRol();
            case 4:
                return temporal.getPermitido();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Nombre";
            case 1:
                return "Usuario";
            case 2:
                return "Contraseña";
            case 3:
                return "Rol";
            case 4:
                return "Acceso";
            default:
                throw new AssertionError();
        }
    }

}
