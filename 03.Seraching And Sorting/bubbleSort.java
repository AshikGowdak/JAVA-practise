import java.util.Arrays;

public class bubbleSort {
  public static void main(String[] args) {
    int[] arr = {5, 2, -9, 1, 5, 6};
    sort(arr);
    System.out.println("Sorted array: " + Arrays.toString(arr));
  }

  public static void sort(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
      boolean swapped = false; // To optimize the sorting process
      for (int j = 0; j < n - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          // Swap arr[j] and arr[j+1]
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
          swapped = true; // Set swapped to true if a swap occurred
        }
      }
      if (!swapped) {
          break; // If no swaps were made, the array is already sorted
        }
    }
  }
}
