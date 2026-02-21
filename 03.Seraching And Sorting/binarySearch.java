public class binarySearch {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5 };// The array must be sorted for binary search to work
    int target = 3;
    int result = search(arr, target);
    if (result == -1) {
      System.out.println("Element not found in the array.");
    } else {
      System.out.println("Element found at index: " + result);
    }
  }

  public static int search(int[] arr, int target) {
    int left = 0;
    int right = arr.length - 1;
    while (left <= right) {
      int mid = left + (right - left) / 2; // Calculate the middle index
      if (arr[mid] == target) {
        return mid; // Target found at the middle index
      } else if (arr[mid] < target) {
        left = mid + 1; // Search in the right half
      } else {
        right = mid - 1; // Search in the left half
      }
    }
    return -1; // Target not found in the array
  }
}


//output:
//Element found at index: 2