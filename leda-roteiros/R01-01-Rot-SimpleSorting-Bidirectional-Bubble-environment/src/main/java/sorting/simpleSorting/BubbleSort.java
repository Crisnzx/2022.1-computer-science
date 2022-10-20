package sorting.simpleSorting;

import sorting.AbstractSorting;
import util.Util;

/**
 * The bubble sort algorithm iterates over the array multiple times, pushing big
 * elements to the right by swapping adjacent elements, until the array is
 * sorted.
 */
public class BubbleSort<T extends Comparable<T>> extends AbstractSorting<T> {

	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		
		while (true) {
			boolean swapped = false;
			for (int i = leftIndex; i < rightIndex - i; i++) {
				boolean isCurrentElementGreaterThanNextElement = array[i].compareTo(array[i+1]) > 0;
				if (isCurrentElementGreaterThanNextElement) {
					Util.swap(array, i, i+1);
					swapped = true;
				}
			}
			if (!swapped) {
				break;
			}
		}
	}

}
