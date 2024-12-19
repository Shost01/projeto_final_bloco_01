package loja;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import loja.controller.JogosController;
import loja.model.JogosTabuleiro;
import loja.model.JogosVideoGame;
import loja.util.Cores;

public class Menu {

	public static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		JogosController jogos = new JogosController();
		
		int opcao, tipo, id, genero = 0;
		String nome, plataforma, duracao;
		JogosVideoGame gen = new JogosVideoGame(0, 0, 0, "", "");

		JogosTabuleiro jt = new JogosTabuleiro(jogos.geraId(), 2, 1, "Dungeons & Dragons", "Longa");
	    jogos.cadastrar(jt);;
	    
		JogosVideoGame jv = new JogosVideoGame(jogos.geraId(), 1, 5, "Spider-Man", "PS5 e PS4");
	    jogos.cadastrar(jv);

		while (true) {

			System.out.println(Cores.TEXT_BLUE + Cores.ANSI_BLACK_BACKGROUND
					+ "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                THE LEGEND OF GAMES                  ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Adicionar Jogo                       ");
			System.out.println("            2 - Listar Todos os Jogos                ");
			System.out.println("            3 - Buscar Jogo por ID (PS -1, Xbox-2)   ");
			System.out.println("            4   Buscar por gênero                    ");
			System.out.println("            5 - Atualizar Lista de Jogos             ");
			System.out.println("            6 - excluir Jogo                         ");
			System.out.println("            7 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     " + Cores.TEXT_RESET);

			try {
				opcao = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao = 0;
			}
			if (opcao == 7) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nTHE LEGEND OF GAMES - O mundo das Lendas!! ");

				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_WHITE + "Adicionar Jogo\n\n");
				
				System.out.println("Digite o nome do Jogo:");
				leia.skip("\\R?");
				nome = leia.nextLine();
				
				System.out.println("Qual o Gênero do jogo? ");
				gen.generos(); // 
				System.out.println("Digite o Gênero? ");
				genero = leia.nextInt();

				do {
					System.out.println("Digite o Tipo do Jogo (1-Video Game ou 2-Tabuleiro): ");
					tipo = leia.nextInt();
				} while (tipo < 1 && tipo > 2);


				switch (tipo) {
				case 1 -> {
					System.out.println("Digite a Plataforma: ");
					leia.nextLine();
					plataforma = leia.nextLine();
					jogos.cadastrar(new JogosVideoGame(jogos.geraId(), tipo, genero, nome, plataforma));
				}
				case 2 -> {
					System.out.println("Digite a Duração do jogo (Curta, Média, Longa): ");
					leia.nextLine();
					duracao = leia.nextLine();
					jogos.cadastrar(new JogosTabuleiro(jogos.geraId(), tipo, genero, nome, duracao));						
				}
				}

				KeyPress();
				break;
			case 2:
				System.out.println(Cores.TEXT_WHITE + "Listar todos os Jogos\n\n");
				jogos.listarTodas();
				
				KeyPress();
				break;
			case 3:
				System.out.println(Cores.TEXT_WHITE + "Buscar Jogo por Tipo\n\n");
				
				System.out.println("Digite o id do Jogo: ");
				id = leia.nextInt();
				
				jogos.procurarPorId(id);
				
				KeyPress();
				break;
			case 4:
				System.out.println(Cores.TEXT_WHITE + "Buscar Jogo por Gênero\n\n");
				
				gen.generos();
				System.out.println("Digite o Gênero: ");
				genero = leia.nextInt();
				
				jogos.buscarPorGenero(genero);
				
				KeyPress();
				break;
			case 5:
				System.out.println(Cores.TEXT_WHITE + "Atualizar lista de Jogos\n\n");

				System.out.println("Digite o id do Jogo: ");
				id = leia.nextInt();

				var buscaJogo = jogos.buscarNaCollection(id);

				if (buscaJogo != null) {

					tipo = buscaJogo.getTipo();

					System.out.println("Digite o nome do Jogo: ");
					leia.skip("\\R?");
					nome = leia.nextLine();

					switch (tipo) {
				    case 1 -> {
				        System.out.println("Digite a Plataforma: ");
				        plataforma = leia.nextLine();
				        jogos.cadastrar(new JogosVideoGame(jogos.geraId(), tipo, genero, nome, plataforma));
				    }
				    case 2 -> {
				        System.out.println("Digite a Duração do jogo (Curta, Média, Longa): ");
				        leia.nextLine();
				        duracao = leia.nextLine();
				        jogos.cadastrar(new JogosTabuleiro(jogos.geraId(), tipo, genero, nome, duracao));						
				    }
				}
				}
				else {
					System.out.println("O Jogo não foi encontrado!");
				}
				
				KeyPress();
				break;
			case 6:
				System.out.println(Cores.TEXT_WHITE + "Excluir jogo\n\n");

				System.out.println("Digite o ID do Jogo: ");
				id = leia.nextInt();
				
				jogos.deletar(id);
				
				KeyPress();
				break;
			default:
				System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n" + Cores.TEXT_RESET);

				KeyPress();
				break;
			}
		}
	}
	
	public static void KeyPress() {

		try {
			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
			System.in.read();
		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");
		}
	}
	
}
