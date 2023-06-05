package org.example.persistencia;

        import org.example.modelo.Bicicleta;

        import java.sql.PreparedStatement;
        import java.sql.ResultSet;
        import java.sql.SQLException;
        import java.sql.Statement;
        import java.util.ArrayList;

public class BicicletaDAO implements InterfazDAO{


    public BicicletaDAO() {
    }

    @Override
    public boolean insertar(Object obj) throws SQLException {
        String sqlInsert = "INSERT INTO bicicleta(Tipo, Marca, Color, Rueda, Foto) VALUES(?,?,?,?,?)";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("bicicletaDB.db").getConnection().prepareStatement(sqlInsert);
        pstm.setString(1, ((Bicicleta) obj).getTipo());
        pstm.setString(2, ((Bicicleta) obj).getMarca());
        pstm.setString(3, ((Bicicleta) obj).getColor());
        pstm.setInt(4, ((Bicicleta) obj).getRueda());
        pstm.setString(5, ((Bicicleta) obj).getUrl());
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public boolean update(Object obj) throws SQLException {
        String sqlUpdate = "UPDATE bicicleta SET Tipo = ?, Marca = ?, Color = ?, Rueda = ?, Foto = ? WHERE ID = ? ; ";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("bicicletaDB.db").getConnection().prepareStatement(sqlUpdate);
        pstm.setString(1, ((Bicicleta) obj).getTipo());
        pstm.setString(2, ((Bicicleta) obj).getMarca());
        pstm.setString(3, ((Bicicleta) obj).getColor());
        pstm.setInt(4, ((Bicicleta) obj).getRueda());
        pstm.setString(5, ((Bicicleta) obj).getUrl());
        pstm.setInt(6,((Bicicleta) obj).getId());
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public boolean delete(String id) throws SQLException {
        String sqlDelete = "DELETE FROM bicicleta WHERE ID = ? ;";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("bicicletaDB.db").getConnection().prepareStatement(sqlDelete);
        pstm.setInt(1, Integer.parseInt(id));
        rowCount = pstm.executeUpdate();

        return rowCount > 0;
    }

    @Override
    public ArrayList obtenerTodo() throws SQLException {
        String sql = "SELECT * FROM bicicleta";
        ArrayList<Bicicleta> resultado = new ArrayList<>();
        Statement stm = ConexionSingleton.getInstance("bicicletaDB.db").getConnection().createStatement();
        ResultSet rst = stm.executeQuery(sql);
        while (rst.next()){
            resultado.add(new Bicicleta(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getInt(5), rst.getString(6)));
        }
        return resultado;
    }

    @Override
    public Object buscarPorID(String id) throws SQLException {
        String sql = "SELECT * FROM bicicleta WHERE id = ? ;";
        Bicicleta bicicleta = null;
        PreparedStatement pstm = ConexionSingleton.getInstance("bicicletaDB.db").getConnection().prepareStatement(sql);
        pstm.setInt(1, Integer.parseInt(id));
        ResultSet rst = pstm.executeQuery();
        if (rst.next()) {
            bicicleta = new Bicicleta(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getInt(5), rst.getString(6));
            return bicicleta;
        }
        return null;
    }
}

