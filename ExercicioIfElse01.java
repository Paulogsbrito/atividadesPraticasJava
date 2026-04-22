package praticasLacosCondicionais;

import java.util.Scanner;

public class ExercicioIfElse01 {

	public static void main(String[] args) {
		int A, B, C, resultado;
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite por gentileza os Valores Abaixo!!!");


		System.out.println("Digite o número A: ");
		A = leia.nextInt();

		System.out.println("Digite o número B: ");
		B = leia.nextInt();

		System.out.println("Digite o número C: ");
		C = leia.nextInt();

		resultado = (A + B);

		if(resultado > C) {
			System.out.println("o resultado é maior do que C");
			
		} else if(resultado < C) {
			System.out.println("O resultado é menor que C");
			
		}else{
			System.out.println("O resultado é igual a C");

		}
	}
}




