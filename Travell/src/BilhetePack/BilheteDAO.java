package BilhetePack;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import dao.ConnectionFactory;

public class BilheteDAO {
	
	private Connection connection;
	
	public BilheteDAO() {
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public void save (Bilhete bilhete) {
		String sql = "INSERT INTO bilhete VALUES (?,?,?,?)";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, bilhete.getId_bilhete());
			stmt.setInt(2, bilhete.getData_bilhete());
			stmt.setInt(3, bilhete.getPromocao());
			stmt.setInt(4, bilhete.getHora());
			stmt.execute();
			stmt.close();	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void removeById(int id_bilhete) {
		String sql = "DELETE FROM bilhete WHERE id= ?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, id_bilhete);
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void update(Bilhete bilhete) {
		String sql = "UPDATE bilhete WHERE id_bilhete = ?, data_bilhete = ?, SET promocao = ?, SET hora = ?";
		
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, bilhete.getId_bilhete());
			stmt.setInt(2, bilhete.getData_bilhete());
			stmt.setInt(3, bilhete.getPromocao());
			stmt.setInt(4, bilhete.getHora());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public ResultSet getBilhetes() throws SQLException {
		String sql = "SELECT * FROM bilhete";
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