package praticasLacosCondicionais;

import java.util.Scanner;

public class ExercicioSwitch02 {

	public static void main(String[] args) {
		
		String nome;
		String cargo = "";
		
		int codigoCargo = 0;
		
		float salario;
		float percentualReajuste = 0;
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o nome do Funcionario: ");
		nome = leia.nextLine();
		
		System.out.println("Por gentileza digite o código do Cargo(1 á 6): ");
		codigoCargo = leia.nextInt();
		
		System.out.println("Digite o Salário: R$ ");
		salario = leia.nextFloat();
		
		
		switch (codigoCargo) {
		
		case 1:
			cargo = "Gerente";
			percentualReajuste = 0.10f;
			break;
			
					
		case 2:
			cargo = "Vendedor";
			percentualReajuste = 0.07f;
			break;
		
		case 3:
			cargo = "Supervisor";
			percentualReajuste = 0.09f;
			break;
		
		case 4:
			cargo = "Motorista";
			percentualReajuste = 0.06f;
			break;
		
		case 5:
			cargo = "Estoquista";
			percentualReajuste = 0.05f;
			break;
		
		case 6:
			cargo = "Tecnico de TI";
			percentualReajuste = 0.08f;
			break;
			
		}
		
		float novoSalario = salario + (percentualReajuste * salario);
		
		System.out.println("Resultado da Consulta!!!");
		System.out.println("Nome do Funcionario: " + nome);
		System.out.println("Cargo: " + cargo);
		System.out.println("Novo Salario: R$" + novoSalario);
		

	}

}
