public class printNumbers {
  public static void main(String[] args) {
    int n = 5;
    printNumber(n);
  }
  public static void printNumber(int n) {
    if (n == 0) {
      return;
    }
    printNumber(n - 1);
    System.out.print(n + " ");
  }
}
