package praticasLacosDeRepeticao;

import java.util.Scanner;

public class ExercicioDoWhile {

	public static void main(String[] args) {

		int numero;
		int soma = 0;

		Scanner leia = new Scanner(System.in);

		do {
			System.out.println("Por gentileza digite o numero: ");
			numero = leia.nextInt();

			if (numero >= 0) {
				soma += numero;
			}

		} while (numero != 0);
		{
			System.out.println("A soma dos numeros é: " + soma);

		}

	}
}
