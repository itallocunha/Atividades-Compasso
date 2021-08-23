package trabalhoProdutos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AtualizandoProduto {

	public void atualizando() throws SQLException {
		
		Connection conexao = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/loja?useTimezone=true&serverTimezone=UTC"
						,"root"
						,"senha");
		
		Statement stm = conexao.createStatement();
		stm.execute("UPDATE PRODUTO SET NOME = 'CELULAR', DESCRICAO = 'SAMSUNG GALAXY', QUANTIDADE = '2', PRICE = '10000', DATASRIACAO = '2021-03-24', DATAALTERACAO = '2021-07-20' WHERE ID = 1");
		
		System.out.println("O produto foi atualizado!!");
		
	}
}