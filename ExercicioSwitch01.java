package praticasLacosCondicionais;

import java.util.Scanner;

public class ExercicioSwitch01 {

	public static void main(String[] args) {
		
		int codigo;
		int quantidade;
		double precoUnitario = 0.0;
		String produto = " ";


		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o código do produto: ");
		codigo = leia.nextInt();
		
		System.out.println("Digite a quantidade que deseja comprar do produto: ");
		quantidade = leia.nextInt();
			
		
		
		switch (codigo) {
		
		case 1:
			produto = "Cachorro-Quente";
			precoUnitario = 10.00;
			break;
			
		case 2:
			produto = "X-Salada";
			precoUnitario = 15.00;
			break;
			
		case 3:
			produto = "X-Bacon";
			precoUnitario = 18.00;
			break;
			
		case 4:
			produto = "Bauru";
			precoUnitario = 12.00;
			break;
			
		case 5:
			produto = "Refrigerante";
			precoUnitario = 8.00;
			break;
			
		case 6:
			produto = "Suco de Laranja";
			precoUnitario = 13.00;
			break;
			
			default:
				System.out.println("O código digitado é invalido!!!");
				
				return;
		}
		
		
		        double valorTotal = precoUnitario * quantidade;		
		        
				System.out.println(" Produto: " + produto);
				System.out.printf(" Valor total do pedido:R$ " + valorTotal);
				

	}

}
