public class powerOfTwo {
  public static void main(String[] args) {
    int n = 8;
    System.out.println(isPowerOfTwo(n));
  }

  public static boolean isPowerOfTwo(int n) {
    if (n == 1) {
      return true;
    } else if (n < 1 || (n % 2 != 0)) {
      return false;
    }
    return isPowerOfTwo(n / 2);
  }
}


// output: true