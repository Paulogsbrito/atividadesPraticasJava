package praticasLacosDeRepeticao;

import java.util.Scanner;

public class ExercicioWhile {

	public static void main(String[] args) {

		int idade;
		int menores = 0, maiores = 0;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite a idade: ");
		idade = leia.nextInt();

		while (idade >= 0) {

			if (idade <= 21 && idade >= 0) {
				menores++;
			} else if (idade > 50) {
				maiores++;

			}
			System.out.println("Digite a idade: ");
			idade = leia.nextInt();
		}

		System.out.println("Total de pessoas com idade menor de 21 anos: " + menores);
		System.out.println("Total de pessoas com idade maior de 50 anos: " + maiores);

	}

}
