class sumOfArray {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    int sum = 0;

    for (int num : arr) {
      sum += num;
    }

    System.out.println("Sum of array elements: " + sum);
  }
}


//output:
//int[] arr = {1, 2, 3, 4, 5};
//Sum of array elements: 15