public class maxAndMin {
  public static void main(String[] args) {
    int[] arr = {3, 5, 1, -8, 2};
    findMaxAndMin(arr);
  }
  public static void findMaxAndMin(int[] arr) {
    int max = arr[0];
    int min = arr[0];

    for (int num : arr) {     // Enhanced for loop
      if (num > max) {
        max = num;            // Update max if current element is greater
      }
      if (num < min) {
        min = num;            // Update min if current element is smaller
      }
    }

    System.out.println("Maximum element: " + max);
    System.out.println("Minimum element: " + min);
  }
}





//output:
//int[] arr = {3, 5, 1, -8, 2};
//Maximum element: 5
//Minimum element: -8