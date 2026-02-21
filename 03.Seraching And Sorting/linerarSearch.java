public class linerarSearch {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    int target = 3;
    int result = search(arr, target);
    if (result == -1) {
      System.out.println("Element not found in the array.");
    } else {
      System.out.println("Element found at index: " + result);
    }
  }
  public static int search(int[] arr, int target) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == target) {
        return i; // Return the index of the target element
      }
    }
    return -1; // Return -1 if the target element is not found
  }
}


//output:
//Element found at index: 2