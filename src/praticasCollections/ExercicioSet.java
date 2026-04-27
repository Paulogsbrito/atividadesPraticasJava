package praticasCollections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ExercicioSet {

	public static void main(String[] args) {

		Set<Integer> setNumero = new HashSet<>();

		Scanner leia = new Scanner(System.in);

		System.out.println("Por gentileza Digite 10 numeros não repetidos: ");

		setNumero.add(leia.nextInt());
		setNumero.add(leia.nextInt());
		setNumero.add(leia.nextInt());
		setNumero.add(leia.nextInt());
		setNumero.add(leia.nextInt());
		setNumero.add(leia.nextInt());
		setNumero.add(leia.nextInt());
		setNumero.add(leia.nextInt());
		setNumero.add(leia.nextInt());
		setNumero.add(leia.nextInt());

		Iterator<Integer> isetNumero = setNumero.iterator();

		System.out.println("Mostre todos os numeros: ");

		isetNumero.forEachRemaining(System.out::println);

	}

}
