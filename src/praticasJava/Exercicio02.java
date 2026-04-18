package praticasJava;

import java.util.Scanner;

public class Exercicio02 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float nota1;
		float nota2;
		float nota3;
		float nota4;
		float mediaFinal;
		
		
		System.out.println("Por Gentileza Digite sua Nota aqui: ");
		
		nota1 = leia.nextFloat();
		
		
		System.out.println("Por Gentileza Digite sua Nota aqui: ");
		
		nota2 = leia.nextFloat();
		
		
		System.out.println("Por Gentileza Digite sua Nota aqui: ");
		
		nota3 = leia.nextFloat();
		
		
		System.out.println("Por Gentileza Digite sua Nota aqui: ");
		
		nota4 = leia.nextFloat();
		
		
		mediaFinal = (nota1 + nota2 + nota3 + nota4 )/ 4;
		
		
		System.out.println("Sua média final é: " + mediaFinal);
		
		
		
	}
	

}
