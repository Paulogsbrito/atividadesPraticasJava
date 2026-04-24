package praticasJava;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float n1, n2, n3, n4, diferenca1, n3Negativo, diferenca2;
		String nome;
		
		
		
		System.out.println("Olá Seja Muito Bem Vindo, como você se chama?");
		
		System.out.println("Digite o Seu Nome: ");
		
		nome = leia.next();
		
		
		
		System.out.println("Olá " + nome + " Iremos te ajudar a calcular a diferença entre os Produtos!!!");
		
		System.out.println("Digite o Primeiro Produto: ");
		n1 = leia.nextFloat();
		
		System.out.println("Digite o Segundo Produto: ");
		n2 = leia.nextFloat();
		
		System.out.println("Digite o Terceiro Produto: ");
		n3 = leia.nextFloat();
		
		System.out.println("Digite o Quarto Produto: ");
		n4 = leia.nextFloat();
		
		diferenca1 = (n1 * n2) - (n3 * n4);
		
		
		System.out.println("A diferença entre os produtos é de: " + diferenca1);
		
			
		System.out.println("Agora Vamos verificar a Segunda diferença entre Produtos!!!");


		
		System.out.println("Digite o Primeiro Produto: ");
		
		n1 = leia.nextFloat();
		
		System.out.println("Digite o Segundo Produto: ");
		
		n2 = leia.nextFloat();
		
		System.out.println("Digite o Terceiro Produto: ");
		
		n3Negativo = leia.nextFloat();
		
		System.out.println("Digite o Quarto Produto: ");
		
		n4 = leia.nextFloat();
		
		diferenca2 = (n1 * n2) - (n3Negativo * n4);
		
		System.out.println("A diferença entre os produtos é de: " + diferenca2);
		
	}
}

