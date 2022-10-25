package br.com.unit.associacao;
import java.lang.invoke.SwitchPoint;
import java.util.ArrayList;
import java.util.Scanner;

public class AppLivraria {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int opcaoEscolhida;
		
		ArrayList<Editora> listaEditoras = new ArrayList<Editora>();
		ArrayList<Livro> listaLivros = new ArrayList<Livro>();
		ArrayList<Genero> listaGeneros = new ArrayList<Genero>();
		
		
		System.out.println("=== Livraria ===");
		
		do {
			System.out.println("== Op��es ==\n"
					+ "[1] - Adicionar Editora\n"
					+ "[2] - Adicionar G�nero\n"
					+ "[3] - Adicionar Livro\n"
					+ "[0] - Sair");
			opcaoEscolhida = input.nextInt();
			switch (opcaoEscolhida) {
			case 1:
				System.out.println("== Cadastro de Editora ==\n");
				System.out.println("Raz�o Social:");
				input.nextLine();
				String razaoSocial = input.next();
				
				System.out.println("Contato:");
				input.nextLine();
				String contato = input.next();
				
				System.out.println("Cidade:");
				input.nextLine();
				String cidade = input.next();
				
				System.out.println("UF:");
				input.nextLine();
				String UF = input.next();
				break;
			case 2:
				System.out.println("== Cadastro de G�nero ==");
				System.out.println("Nome:");
				input.hasNextLine();
				String nome = input.next();
				break;
			case 3:
				System.out.println("== Cadastro de Livro ==");
				System.out.println("T�tulo:");
				input.nextLine();
				String titulo = input.next();
				
				System.out.println("ISBN:");
				input.nextLine();
				String ISBN = input.next();
				
				System.out.println("N�mero de p�ginas:");
				input.nextLine();
				String numeroPaginas = input.next();
				
				System.out.println("Editora: ");
				input.nextLine();
				String editora = input.next();
				
				System.out.println("G�nero:");
				input.nextLine();
				String genero = input.next();
				break;
			default:
				break;
			}
		}
		while(opcaoEscolhida != 0);
	}	

}
