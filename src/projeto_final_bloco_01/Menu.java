package projeto_final_bloco_01;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;


import loja.model.JogosTabuleiro;
import loja.model.JogosVideoGame;
import loja.util.Cores;

public class Menu {

	public static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int opcao, tipo, genero;
		String jogo;
	
		JogosTabuleiro jT = new JogosTabuleiro(1, 2, "Dungeons & Dragons", "Alta");
	    jT.visualizar();
	    
		JogosVideoGame jV = new JogosVideoGame(1, 2, "Spider-Man", "PS5 e PS4");
	    jV.visualizar();

		while (true) {

			System.out.println(Cores.TEXT_BLUE + Cores.ANSI_BLACK_BACKGROUND
					+ "**************************************************************");
			System.out.println("                                                     ");
			System.out.println("                THE LEGEND OF GAMES                  ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Adicionar Jogo                       ");
			System.out.println("            2 - Listar Todos os Jogos                ");
			System.out.println("            3 - Buscar Jogo por Tipo (PS -1, Xbox-2) ");
			System.out.println("            4 - Atualizar Lista de Jogos             ");
			System.out.println("            5 - excluir Jogo                         ");
			System.out.println("            6 - Sair                                 ");
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
			if (opcao == 9) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nTHE LEGEND OF CADERNOS  - Obtenha Seu Caderno LENDÀRIO!");

				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_WHITE + "Adicionar Jogo\n\n");

				KeyPress();
				break;
			case 2:
				System.out.println(Cores.TEXT_WHITE + "Listar todos os Jogos\n\n");

				KeyPress();
				break;
			case 3:
				System.out.println(Cores.TEXT_WHITE + "Buscar Jogo por Tipo\n\n");

				KeyPress();
				break;
			case 4:
				System.out.println(Cores.TEXT_WHITE + "Atualizar lista de Jogos\n\n");

				KeyPress();
				break;
			case 5:
				System.out.println(Cores.TEXT_WHITE + "Excluir jogo\n\n");

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
