package sorting.linearSorting;

import java.util.Arrays;

import sorting.AbstractSorting;

/**
 * Classe que implementa do Counting Sort vista em sala. Desta vez este
 * algoritmo deve satisfazer os seguitnes requisitos:
 * - Alocar o tamanho minimo possivel para o array de contadores (C)
 * - Ser capaz de ordenar arrays contendo numeros negativos
 */
public class ExtendedCountingSort extends AbstractSorting<Integer> {

	@Override
	public void sort(Integer[] array, int leftIndex, int rightIndex) {
		
		Integer greatestElement = getGreatestElement(array);
		Integer smallestElement = getSmallestElement(array);

		Integer[] sumArray = createArrayFilledWith(0, greatestElement + 1 - smallestElement);
		Integer[] orderedArray = createArrayFilledWith(0, array.length);

		for (int i = 0; i < array.length; i++) {
			sumArray[array[i] - smallestElement] += 1;
		}

		for (int i = 1; i < sumArray.length; i++) {
			sumArray[i] = sumArray[i-1] + sumArray[i];
		}

		for (int i = array.length - 1; i >= 0; i--) {
			Integer amountOfNumbersBefore = sumArray[array[i] - smallestElement];
			orderedArray[amountOfNumbersBefore - 1] = array[i];
			sumArray[array[i] - smallestElement] -= 1;
		}

		System.out.println(Arrays.toString(orderedArray));

	}

	private static int getGreatestElement(Integer[] array) {
		Integer greatestElement = array[0];

		for (int i = 1; i < array.length; i++) {
			if (array[i].compareTo(greatestElement) > 0) {
				greatestElement = array[i];
			}
		}

		return greatestElement;

	}

	private static int getSmallestElement(Integer[] array) {
		Integer smallestElement = array[0];

		for (int i = 1; i < array.length; i++) {
			if (array[i].compareTo(smallestElement) < 0) {
				smallestElement = array[i];
			}
		}

		return smallestElement;
	}

	private static Integer[] createArrayFilledWith(int numberToFill, int length) {
		Integer[] array = new Integer[length];
		for (int i = 0; i < array.length; i++) {
			array[i] = numberToFill;	
		}
		return array;
	}

}
