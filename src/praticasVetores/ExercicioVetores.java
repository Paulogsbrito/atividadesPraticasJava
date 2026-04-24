package praticasVetores;

import java.util.Scanner;

public class ExercicioVetores {

	public static void main(String[] args) {

		// vetor com meus dados
		int vetorNumeros[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o numero que você deseja encontrar: ");
		int numero = leia.nextInt();

		boolean encontrado = false;

		for (int indice = 0; indice < vetorNumeros.length; indice++) {

			if (vetorNumeros[indice] == numero) {
				System.out.println("O numero " + numero + " está na posição: " + indice);
				encontrado = true;
				break;
			}

		}
		if (!encontrado) {
			System.out.println("O numero " + numero + " não foi encontrado!");

		}

	}
}
