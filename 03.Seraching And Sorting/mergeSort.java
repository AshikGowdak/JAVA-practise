public class mergeSort {
  public static void main(String[] args) {
    int[] arr = {38, 27, 43, 3, 9, 82, 10};
    sort(arr);
    System.out.println("Sorted array: " + java.util.Arrays.toString(arr));
  }

  public static void sort(int[] arr) {
    if (arr.length < 2) {
      return; // Base case: arrays with less than 2 elements are already sorted
    }

    int mid = arr.length / 2;
    int[] left = new int[mid];
    int[] right = new int[arr.length - mid];

    // Split the array into two halves
    for (int i = 0; i < mid; i++) {
      left[i] = arr[i];
    }
    for (int i = mid; i < arr.length; i++) {
      right[i - mid] = arr[i];
    }

    // Recursively sort both halves
    sort(left);
    sort(right);

    // Merge the sorted halves
    merge(arr, left, right);
  }

  public static void merge(int[] arr, int[] left, int[] right) {
    int i = 0, j = 0, k = 0;

    // Merge elements from left and right arrays
    while (i < left.length && j < right.length) {
      if (left[i] <= right[j]) {
        arr[k++] = left[i++];
      } else {
        arr[k++] = right[j++];
      }
    }

    // Copy remaining elements of left array, if any
    while (i < left.length) {
      arr[k++] = left[i++];
    }

    // Copy remaining elements of right array, if any
    while (j < right.length) {
      arr[k++] = right[j++];
    }
  }
}
