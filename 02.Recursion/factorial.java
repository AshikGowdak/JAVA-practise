class factorial {
  public static void main(String[] args) {
    int n = 5;
    int result = factorials(n);
    System.out.println("The factorial of " + n + " is: " + result); // Output: 120
  }

  public static int factorials(int n) {
    if (n == 1) {
      return 1; // Base case: factorial of 0 or 1 is 1
    }
    return n * factorials(n - 1); // Recursive case: n! = n * (n-1)!
  }
}


//output: The factorial of 5 is: 120