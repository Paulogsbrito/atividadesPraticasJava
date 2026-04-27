package praticasJava;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		// abertura e criação do scanner de leitura + declaração das variaveis
		Scanner leia = new Scanner(System.in);
		// tipo de variavel abaixo que será lida
		float salario;
		float abono;
		float novoSalario;

		// Digite seu salario (Recebimento de dados)
		System.out.println("Por gentileza digite seu salario: ");

		// acão de leitura do salario digitado
		salario = leia.nextFloat();

		System.out.println("Por gentileza digite seu Abono: ");

		abono = leia.nextFloat();

		novoSalario = salario + abono;

		System.out.printf("Seu novo Salario é: " + novoSalario + " Reais");

	}

}
