package trabalhoProdutos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class RemovendoProdutos {

	public void remove() throws SQLException {
		
		Connection conexao = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/loja?useTimezone=true&serverTimezone=UTC"
						,"root"
						,"senha");
		
		Statement stm = conexao.createStatement();
		
		stm.execute("DELETE FROM PRODUTO WHERE ID = 2");
		
		Integer linhasModificadas = stm.getUpdateCount();
		System.out.println("Quantidade de linhas que foram removidas: " + linhasModificadas);
		
	}
	
	public void removeTudo() throws SQLException{
		
		Connection conexao = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/loja?useTimezone=true&serverTimezone=UTC"
						,"root"
						,"senha");
		
		Statement stm = conexao.createStatement();
		
		stm.execute("DELETE FROM PRODUTO WHERE ID >= 1");
		
		Integer linhasModificadas = stm.getUpdateCount();
		System.out.println("Quantidade de linhas que foram removidas: " + linhasModificadas);
		
	}

}
