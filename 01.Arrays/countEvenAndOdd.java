public class countEvenAndOdd {
  public static void main(String[] args) {
    int[] arr = {10, 21, 0, -44, 54, 65};
    count(arr);
  }
  public static void count(int[] arr) {
    int evenCount = 0;
    int oddCount = 0;
    for (int num : arr) {
      if (num % 2 == 0) {
        evenCount++;
      } else {
        oddCount++;
      }
    }
    System.out.println("Even elements count: " + evenCount);
    System.out.println("Odd elements count: " + oddCount);
  }
}


//output:
//int[] arr = {10, 21, 0, -44, 54, 65};
//Even elements count: 4
//Odd elements count: 2