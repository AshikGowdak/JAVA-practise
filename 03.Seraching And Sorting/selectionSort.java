public class selectionSort {
  public static void main(String[] args) {
    int[] arr = {5, 2, -9, 1, 5, 6};
    sort(arr);
    System.out.println("Sorted array: " + java.util.Arrays.toString(arr));
  }

  public static void sort(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
      int minIndex = i; // Assume the minimum is the first element
      for (int j = i + 1; j < n; j++) {
        if (arr[j] < arr[minIndex]) {
          minIndex = j; // Update minIndex if a smaller element is found
        }
      }
      // Swap the found minimum element with the first element
      int temp = arr[minIndex];
      arr[minIndex] = arr[i];
      arr[i] = temp;
    }
  }
}
