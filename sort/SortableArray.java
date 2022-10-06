package sort;

import java.util.Arrays;

public class SortableArray {
  private int[] array;

  public SortableArray(int[] array) {
    this.array = array;
  }

  public int[] getArray() {
    return this.array;
  }

  public void selectionSort() {

    for (int i = 0; i < this.array.length; i++) {
      int smallestNumberIndex = i;

      for (int j = i + 1; j < this.array.length; j++) {
        if (this.array[j] < this.array[smallestNumberIndex]) {
          smallestNumberIndex = j;
        }
      }
      this.swap(i, smallestNumberIndex);
    }

  }

  private void swap(int sourceIndex, int targetIndex) {
    int aux = this.array[targetIndex];
    this.array[targetIndex] = this.array[sourceIndex];
    this.array[sourceIndex] = aux;
  }

  public String toString() {
    return Arrays.toString(this.array);
  }
}