package destinopack;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TesteDestinoDAO {

	public static void main(String[] args) {
		// Testando a execução do Contato DAO
		Destino destino = new Destino();
		
		destino.setId_destino(18);
		destino.setCidade("Recife");
		destino.setDesconto(300);
		destino.setEstado("Pernambuco");
		
		DestinoDAO dao = new DestinoDAO();
		
		dao.save(destino);
		System.out.println("Destino salvo!");
		
		DestinoDAO dao2 = new DestinoDAO();
		dao2.removeById(9);
		System.out.println("Destino removido!");
		
		destino.setId_destino(18);
		destino.setCidade("Olinda");
		destino.setDesconto(900);
		destino.setEstado("Pernambuco");
		dao.update(destino);
		System.out.println("Destino alterado");
		
		try {
			ResultSet resultado= dao.getDestinos();
			while (resultado.next()) {
		    	System.out.println(resultado.getInt(1));
		    	System.out.println(resultado.getString(2));
		    	System.out.println(resultado.getInt(3));
		    	System.out.println(resultado.getString(4));
		    }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

}