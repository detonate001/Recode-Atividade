package ClientePack;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import dao.ConnectionFactory;

public class ClienteDAO {
	
	private Connection connection;
	
	public ClienteDAO() {
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public void save (Cliente cliente) {
		String sql = "INSERT INTO cliente VALUES (?,?,?,?,?)";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, cliente.getId_cliente());
			stmt.setInt(2, cliente.getCpf());
			stmt.setString(3, cliente.getEmail());
			stmt.setString(4, cliente.getSenha());
			stmt.setInt(5, cliente.getData_nascimento());
			stmt.execute();
			stmt.close();	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void removeById(int id_cliente) {
		String sql = "DELETE FROM cliente WHERE id_cliente = ?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, id_cliente);
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void update(Cliente cliente) {
		String sql = "UPDATE cliente WHERE id_cliente = ?, cpf = ?, SET email = ?, senha = ?, data_nascimento = ?";
		
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, cliente.getId_cliente());
			stmt.setInt(2, cliente.getCpf());
			stmt.setString(3, cliente.getEmail());
			stmt.setString(4, cliente.getSenha());
			stmt.setInt(5, cliente.getData_nascimento());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public ResultSet getClientes() throws SQLException {
		String sql = "SELECT * FROM cliente";
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

	