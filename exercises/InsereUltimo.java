import java.util.Arrays;
import java.util.Scanner;

class InsereUltimo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] stringArray = sc.nextLine().split(" ");
    int[] array = new int[stringArray.length];

    for (int i = 0; i < stringArray.length; i++) {
      array[i] = Integer.parseInt(stringArray[i]);
    }

    for (int i = array.length - 1; i > 0; i--) {
      if (array[i] > array[i - 1]) {
        break;
      }
      swap(array, i, i - 1);
    }

    System.out.println(Arrays.toString(array));

  }

  private static void swap(int[] array, int sourceIndex, int targetIndex) {
    int aux = array[sourceIndex];
    array[sourceIndex] = array[targetIndex];
    array[targetIndex] = aux;
  }
}
