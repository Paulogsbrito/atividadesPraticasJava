package praticasCollections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExercicioQueue {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<String>();
		Scanner leia = new Scanner(System.in);

		System.out.println("======= Sistema de Fila Por Ordem de Chegada =======");

		System.out.println("======= MENU =======");

		System.out.println("Opção - 1: Adicionar Cliente na Fila");

		System.out.println("Opção - 2: Listar Todos os Clientes");

		System.out.println("Opção - 3: Chamar e Retirar Cliente na Fila");

		System.out.println("Opção - 0: Sair");

		int opcao = -1;

		do {

			System.out.println("Selecione a Opção desejada: ");
			opcao = leia.nextInt();
			leia.nextLine();

			switch (opcao) {

			case 1:
				System.out.println("Digite o Nome do Cliente: ");
				String nome = leia.next();
				fila.add(nome);
				System.out.println("Cliente " + nome + " Adicionado!");
				break;

			case 2:
				System.out.println("Todos os Clientes que ainda estão na Fila: " + fila);
				if (fila.isEmpty()) {
					System.out.println("A fila esta Vazia!");
				} else {

					Iterator<String> iterator = fila.iterator();
					while (iterator.hasNext()) {
						System.out.println(iterator.next());
						break;
					}
				}

			case 3:
				System.out.println("Proximo da Fila: " + fila.poll());
				System.out.println("Ainda na Fila: " + fila.poll());
				break;

			case 0:
				System.out.println("Programa Encerrado, Até Breve!");
				fila.clear();
				break;

			default:
				System.out.println("Opção Invalida! Tente Novamente!");
				break;
			}

		} while (opcao != 0);

	}
}
