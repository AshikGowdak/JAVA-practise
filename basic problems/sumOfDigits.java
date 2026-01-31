// This program calculates the sum of digits of a given integer number.

import java.util.Scanner;
public class sumOfDigits {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num = sc.nextInt();
    int sum = 0;
    num = Math.abs(num);                    // to handle negative numbers
    while (num > 0) {                       // extracting digits one by one
      int digit = num % 10;
      sum = sum + digit;
      num = num / 10;
    }
    System.out.println("The Sum of Digits is: "+sum);
    sc.close();
  }
}



// Example Output:
// Input: 1234
// Output: The Sum of Digits is: 10