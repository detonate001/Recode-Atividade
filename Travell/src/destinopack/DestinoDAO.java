package destinopack;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import dao.ConnectionFactory;

public class DestinoDAO {
	
	private Connection connection;
	
	public DestinoDAO() {
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public void save (Destino destino) {
		String sql = "INSERT INTO destino VALUES (?,?,?,?)";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, destino.getId_destino());
			stmt.setString(2, destino.getCidade());
			stmt.setInt(3, destino.getDesconto());
			stmt.setString(4, destino.getEstado());
			stmt.execute();
			stmt.close();	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void removeById(int id_destino) {
		String sql = "DELETE FROM destino WHERE id_destino= ?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, id_destino);
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void update(Destino destino) {
		String sql = "UPDATE destino WHERE id_destino = ?, cidade = ?, SET desconto = ?, estado = ?";
		
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, destino.getId_destino());
			stmt.setString(2, destino.getCidade());
			stmt.setInt(3, destino.getDesconto());
			stmt.setString(4, destino.getEstado());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public ResultSet getDestinos() throws SQLException {
		String sql = "SELECT * FROM destino";
		Statement stmt = null;
		ResultSet resultado = null;
		try {
			stmt = connection.createStatement();
			resultado =  stmt.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultado;
		
	}
	

}

	