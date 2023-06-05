package org.example.modelo;

        import org.example.persistencia.BicicletaDAO;

        import javax.swing.event.TableModelListener;
        import javax.swing.table.TableModel;
        import java.sql.SQLException;
        import java.util.ArrayList;

public class ModeloTablaBici implements TableModel {
    public static final int COLUMNS = 6;
    private ArrayList<Bicicleta> datos;
    private BicicletaDAO bdao;

    public ModeloTablaBici() {
        bdao = new BicicletaDAO();
        datos = new ArrayList<>();
    }

    public ModeloTablaBici(ArrayList<Bicicleta> datos) {
        this.datos = datos;
        bdao = new BicicletaDAO();
    }


    @Override
    public int getRowCount() {

        return datos.size();
    }

    @Override
    public int getColumnCount() {

        return COLUMNS;
    }

    @Override
    public String getColumnName(int rowIndex) {
        switch (rowIndex){
            case 0:
                return "ID";
            case 1:
                return "Tipo";
            case 2:
                return "Marca";
            case 3:
                return "Color";
            case 4:
                return "Medida de rueda";
            case 5:
                return "Foto";
        }
        return null;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex){
            case 0:
                return Integer.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return String.class;
            case 4:
                return Integer.class;
            case 5:
                return String.class;
        }
        return null;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Bicicleta tmp = datos.get(rowIndex);
        switch (columnIndex){
            case 0:
                return tmp.getId();
            case 1:
                return tmp.getTipo();
            case 2:
                return tmp.getMarca();
            case 3:
                return tmp.getColor();
            case 4:
                return tmp.getRueda();
            case 5:
                return tmp.getUrl();
        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0:
                //datos.get(rowIndex).setId(0);
                break;
            case 1:
                datos.get(rowIndex).setTipo((String) aValue);
                break;
            case 2:
                datos.get(rowIndex).setMarca((String) aValue);
                break;
            case 3:
                datos.get(rowIndex).setColor((String) aValue);
                break;
            case 4:
                datos.get(rowIndex).setRueda((Integer) aValue);
                break;
            case 5:
                datos.get(rowIndex).setUrl((String) aValue);
                break;
            default:
                System.out.println("No se modifica nada");
        }
    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }

    public void cargarDatos() {
        try {
            datos = bdao.obtenerTodo();
        } catch (SQLException sqle) {
            System.out.println(sqle.getMessage());
        }
    }

    public boolean agregarBici(Bicicleta bicicleta){
        boolean resul = false;
        try {
            if(bdao.insertar(bicicleta)){
                datos.add(bicicleta);
                resul = true;
            } else {
                resul = false;
            }
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }

        return resul;
    }
    public boolean actualizarBici(Bicicleta bicicleta){
        boolean resul = false;
        try {
            if(bdao.update(bicicleta)){
                resul = true;
            } else {
                resul = false;
            }
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }
        return resul;
    }
    public Bicicleta getBiciIndex(int idx){
        return datos.get(idx);
    }
}
