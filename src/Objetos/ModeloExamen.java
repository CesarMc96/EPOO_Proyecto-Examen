
package Objetos;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class ModeloExamen extends AbstractTableModel {

    private final ArrayList<Examen> coleccion;

    public ModeloExamen(ArrayList<Examen> arreglo) {
        coleccion = arreglo;
    }

    @Override
    public int getRowCount() {
        return coleccion.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Examen temporal = coleccion.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return temporal.getMateria();
            case 1:
                return temporal.getParcial();
            case 2:
                return temporal.getTema();
            case 3: 
                return temporal.getNumPReguntas();
            case 4:
                return temporal.getPregRealizar();
            case 5:
                return temporal.getFecha();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Materia";
            case 1:
                return "Parcial";
            case 2: 
                return "Tema";
            case 3:
                return "Total de Preguntas";
            case 4:
                return "Preguntas de Examen";
            case 5:
                return "Fecha";
            default:
                throw new AssertionError();
        }
    }

}

