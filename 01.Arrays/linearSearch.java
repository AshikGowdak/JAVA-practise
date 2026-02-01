public class linearSearch {
  public static void main(String[] args) {
    int[] arr = {10, 21, 0, -44, 54, 65};
    int target = 54;
    int index = search(arr, target);
    if (index != -1) {
      System.out.println("Element found at index: " + index);
    } else {
      System.out.println("Element not found");
    }
  }
  public static int search(int[] arr, int target) { // Linear search implementation
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == target) {     // Check if current element matches target
        return i;     // Return index if found
      }
    }
    return -1;
  }
}


//output:
//int[] arr = {10, 21, 0, -44, 54, 65};
//Element found at index: 4