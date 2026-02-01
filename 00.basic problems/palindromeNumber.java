import java.util.*;

public class palindromeNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num = sc.nextInt();
    int originalNumber = num;
    int reversedNumber = 0;

    if (num < 0) {
      System.out.println("The number is not a palindrome.");
      sc.close();
      return;
    }
    while (num > 0) {
      int digit = num % 10; // get last digit
      reversedNumber = reversedNumber * 10 + digit; // append digit
      num = num / 10; // remove last digit
    }
    if (originalNumber == reversedNumber) {
      System.out.println("The number is a palindrome.");
    } else {
      System.out.println("The number is not a palindrome.");
    }
    sc.close();
  }
}

// output
// Enter a number: 121
// The number is a palindrome.

// Enter a number: 123
// The number is not a palindrome.