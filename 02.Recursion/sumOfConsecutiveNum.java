class sumOfConsecutiveNumbers {
  public static void main(String[] args) {
    int n = 5;
    int result = sumOfConsecutiveNum(n);
    System.out.println("The sum of the first " + n + " natural numbers is: " + result); // Output: 15
  }

  // This method calculates the sum of the first n natural numbers using recursion
  public static int sumOfConsecutiveNum(int n) {
    if (n == 0) {
      return 0;
    }
    return n + sumOfConsecutiveNum(n - 1);
  }
}
