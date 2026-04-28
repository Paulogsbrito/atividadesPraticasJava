package praticasCollections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class ExercicioPilha {

	public static void main(String[] args) {

		Deque<String> pilha = new ArrayDeque<String>();

		Scanner leia = new Scanner(System.in);
		
		int opcao;

		System.out.println("======= Sistema de Pilha de Livros =======");

		System.out.println("======= MENU =======");

		System.out.println("Opção - 1: Adicionar Livro na Pilha");

		System.out.println("Opção - 2: Listar Todos os Livros");

		System.out.println("Opção - 3: Retirar o Livro da Pilha");

		System.out.println("Opção - 0: Sair");

		do {

			System.out.println("Selecione a Opção desejada: ");
			opcao = leia.nextInt();
			leia.nextLine();

			switch (opcao) {

			case 1:
				System.out.println("Digite o nome do Livro: ");
				String livro = leia.nextLine();
				pilha.push(livro);
				System.out.println("Livro " + livro + " foi adicionado!");
				break;

			case 2:
				if (pilha.isEmpty()) {
					System.out.println("A pilha está vazia!");
				} else { 
					System.out.println("Lista de Livros disponiveis!");
					pilha.forEach(System.out::println);
				}
				break;

			case 3:
				if (pilha.isEmpty()) {
					System.out.println("A pilha esta vazia!");

				} else {
                    String removido = pilha.pop();
                    System.out.println("Pilha: " + pilha);
                    System.out.println("O Livro " + removido + " foi retirado!");					
					
				}
				break;

			case 0:
				System.out.println("O programa foi encerrado, até breve!");
				break;

			default:
				System.out.println("Opção invalida, tente outra!");
			}

		} while (opcao != 0);

	}
}
