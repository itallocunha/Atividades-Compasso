package trabalhoProdutos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class ValidandoConexao {

	public static void main(String[] args) throws SQLException{
		
		InserindoProdutos inseri = new InserindoProdutos();
		RemovendoProdutos remove = new RemovendoProdutos();
		AtualizandoProduto atualizando = new AtualizandoProduto();
		
		
		Connection conexao = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/loja?useTimezone=true&serverTimezone=UTC"
						,"root"
						,"senha");
		
		Scanner scanner = new Scanner (System.in);
		
		while(true) {
			
			System.out.println("Escolha a op��o que delejar: ");
			System.out.println("Op��o 1 - Cadastrar 3 produtos aleatorios.");
			System.out.println("Op��o 2 - Atualizar o primeiro produto que foi cadastrado.");
			System.out.println("Op��o 3 - Excluir o segundo produto cadastrado.");
			System.out.println("Op��o 4 - Exclui todos os produtos do banco de dados.");
			System.out.println("Op��o 0 - Encerra a aplica��o.");
			
			
			Integer i = scanner.nextInt();
			if(i == 1) {
				inseri.inserindo();
			}
			if(i == 2) {
				atualizando.atualizando();
			}
			if(i == 3) {
				remove.remove();
			}
			if(i == 4) {
				remove.removeTudo();
			}
			if(i == 0) {
			System.out.println(" Finalizando o programa!!");
			scanner.close();
			break;
			}
		}conexao.close();
	}
}
