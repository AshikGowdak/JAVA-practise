public class insertionSort {
  public static void main(String[] args) {
    int[] arr = {5, 2, -9, 1, 5, 6};
    sort(arr);
    System.out.println("Sorted array: " + java.util.Arrays.toString(arr));
  }

  public static void sort(int[] arr) {
    int n = arr.length;
    for (int i = 1; i < n; i++) {
      int curr = arr[i];
      int prev = i - 1;

      // Move elements of arr[0..i-1], that are greater than curr,
      // to one position ahead of their current position
      while (prev >= 0 && arr[prev] > curr) {
        arr[prev + 1] = arr[prev];
        prev = prev - 1;
      }
      arr[prev + 1] = curr; // Place the curr in its correct position
    }
  }
}
