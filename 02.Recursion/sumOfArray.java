public class sumOfArray {
  public static void main(String[] args){
    int[] arr = {1, 2, 3, 4, 5,6,10};
    int result = sum(arr,arr.length -1);
    System.out.println("The sum of the array is: " + result); // Output: 15
  }

  public static int sum(int[] arr, int n){
    if(n == 0){
      return arr[n]; // Base case: sum of an empty array is 0
    }
    return arr[n] + sum(arr, n - 1); // Recursive case: add last element to sum of the rest of the array
  }
}


// output: The sum of the array is: 31
