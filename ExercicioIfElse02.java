package praticasLacosCondicionais;

import java.util.Scanner;

public class ExercicioIfElse02 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int numero;

		System.out.print("Por Gentileza digite um número: ");
		numero = leia.nextInt();

		if (numero % 2 == 0 && numero >= 0) {
			System.out.println("O Número " + numero + " é par e positivo!");
		} 
		else if (numero % 2 == 0 && numero < 0) {
			System.out.println("O Número " + numero + " é par e negativo!");
		} 
		else if (numero % 2 != 0 && numero > 0) {
			System.out.println("O Número " + numero + " é ímpar e positivo!");
		} 
		else {
			System.out.println("O Número " + numero + " é ímpar e negativo!");
		}
		
		
	}
	

}
