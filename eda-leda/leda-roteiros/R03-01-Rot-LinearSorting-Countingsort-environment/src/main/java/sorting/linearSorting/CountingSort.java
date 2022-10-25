package sorting.linearSorting;

import java.util.Arrays;

import sorting.AbstractSorting;

/**
 * Classe que implementa a estratégia de Counting Sort vista em sala.
 *
 * Procure evitar desperdício de memória: AO INVÉS de alocar o array de contadores
 * com um tamanho arbitrariamente grande (por exemplo, com o maior valor de entrada possível),
 * aloque este array com o tamanho sendo o máximo inteiro presente no array a ser ordenado.
 *
 * Seu algoritmo deve assumir que o array de entrada nao possui numeros negativos,
 * ou seja, possui apenas numeros inteiros positivos e o zero.
 *
 */
public class CountingSort extends AbstractSorting<Integer> {

	@Override
	public void sort(Integer[] array, int leftIndex, int rightIndex) {
		
		Integer greatestElement = getGreatestElement(array);

		Integer[] countArray = createArrayFilledWith(0, greatestElement + 1);
		Integer[] sumArray = createArrayFilledWith(0, greatestElement + 1);
		Integer[] orderedArray = createArrayFilledWith(0, array.length);

		for (int i = 0; i < array.length; i++) {
			countArray[array[i]] += 1;
		}

		sumArray[0] = countArray[0];
		for (int i = 1; i < sumArray.length; i++) {
			sumArray[i] = sumArray[i-1] + countArray[i];
		}

		for (int i = array.length - 1; i >= 0; i--) {
			Integer amountOfNumbersBefore = sumArray[array[i]];
			orderedArray[amountOfNumbersBefore - 1] = array[i];
			sumArray[array[i]] -= 1;
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

	private static Integer[] createArrayFilledWith(int numberToFill, int length) {
		Integer[] array = new Integer[length];
		for (int i = 0; i < array.length; i++) {
			array[i] = numberToFill;	
		}
		return array;
	}

}
