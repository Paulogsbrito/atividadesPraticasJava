package praticasLacosDeRepeticao;

import java.util.Scanner;

public class ExercicioFor {

	public static void main(String[] args) {

		int n1, n2;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o primeiro numero: ");
		n1 = leia.nextInt();

		System.out.println("Digite o segundo numero: ");
		n2 = leia.nextInt();

		if (n1 >= n2) {
			System.out.println("O intervalo é invalido!!!");
		} else {

			for (int intervalo = n1; intervalo <= n2; intervalo++) {

				if (intervalo % 3 == 0 && intervalo % 5 == 0) {
					System.out.println(intervalo + " É multiplo de 3 e 5");
				}
			}

		}

	}
}