package praticasJava;

import java.util.Scanner;

public class Exercicio03 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float salarioBruto;
		float adicionalNoturno;
		float horasExtras;
		float descontos;
		float salarioLiquido;
		
		System.out.println("Digite o valor do seu Salario: ");
		
		salarioBruto = leia.nextFloat();
		
		
		System.out.println("Digite o valor do seu Adicional Noturno: ");
		
		adicionalNoturno = leia.nextFloat();
		
		
		System.out.println("Digite o valor das suas Horas Extras: ");
		
		 horasExtras = leia.nextFloat();
		
		
		System.out.println("Digite o valor do seus Descontos: ");
		
		descontos = leia.nextFloat();
		
		salarioLiquido = (salarioBruto + adicionalNoturno + (horasExtras * 5)) - descontos;
		
		
		System.out.println("Seu salário liquido é: " + salarioLiquido + " Reais");
		
		
	}
	
	

}
