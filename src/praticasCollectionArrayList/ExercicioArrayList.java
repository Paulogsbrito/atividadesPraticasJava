package praticasCollectionArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ExercicioArrayList {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		ArrayList<String> cores = new ArrayList<String>();

		System.out.println("Digite por gentileza as cores: ");
		for (int indice = 0; indice < 5; indice++) {
			System.out.println("Cor " + (indice + 1) + ": ");
			String cor = leia.next();
			cores.add(cor);
		}

		System.out.println("Lista de cores: ");
		for (String cor : cores) {
			System.out.println(cor);
		}

		cores.sort(null);

		System.out.println();
		for (String cor : cores)
			System.out.println(cor);


	}

}
