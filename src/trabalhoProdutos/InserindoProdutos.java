package trabalhoProdutos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InserindoProdutos {

	
		
		 public void inserindo() throws SQLException {

			Connection conexao = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/loja?useTimezone=true&serverTimezone=UTC"
							,"root"
							,"senha");
			
			Statement stm = conexao.createStatement();
			
		 stm.execute("INSERT INTO PRODUTO (id, nome, descricao, quantidade, price, datasriacao,dataalteracao) VALUES (1,'CAMERA','CAMERA GO PRO', 10, 7000, '2021-10-08', '2021-12-08')", Statement.RETURN_GENERATED_KEYS);
		 stm.execute("INSERT INTO PRODUTO (id, nome, descricao, quantidade, price, datasriacao,dataalteracao) VALUES (2,'CAPACELULAR','MODELOS IPHONE E SAMSUNG', 100, 500, '2021-10-08', '2021-12-08')", Statement.RETURN_GENERATED_KEYS);
		 stm.execute("INSERT INTO PRODUTO (id, nome, descricao, quantidade, price, datasriacao,dataalteracao) VALUES (3,'CELULAR','SAMSUNG GALAXY', 2, 5000, '2021-10-08', '2021-12-08')", Statement.RETURN_GENERATED_KEYS);
		 stm.execute("SELECT ID, NOME, DESCRICAO, QUANTIDADE, PRICE, DATASRIACAO, DATAALTERACAO FROM PRODUTO");
			
			
			
			ResultSet rst = stm.getResultSet();
			
			//trazer os produtos do mysql 
			while(rst.next()) {
				
				Integer id = rst.getInt("ID");
				String nome = rst.getString("NOME");
				String descricao = rst.getNString("DESCRICAO");
				Integer qtd = rst.getInt("QUANTIDADE");
				Double preco = rst.getDouble("PRICE");
				Date dataC = rst.getDate("DATASRIACAO");
				Date dataA = rst.getDate("DATAALTERACAO");
				
				System.out.println(id);
				System.out.println("NOME DO PRODUTO: " + nome);
				System.out.println("DESCRIÇÃO: "+ descricao);
				System.out.println("QUANTIDADE: " + qtd);
				System.out.println("PREÇO: " + preco);
				System.out.println("DATA DE CRIAÇÃO: " + dataC);
				System.out.println("DATA DE ALTERAÇÃO" + dataA);
				
				
		}
			conexao.close();
		}
		
	}


