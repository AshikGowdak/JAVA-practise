
// This program performs basic arithmetic operations based on user input.
import java.util.Scanner;

public class simplecalculator {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the first number:");
    int input1 = sc.nextInt();

    System.out.println("Enter the second number:");
    int input2 = sc.nextInt();

    System.out.println("Enter the operation symbol (+, -, *, /):");
    String operator = sc.next();

    int output = 0;

    if (operator.equals("+")) {
      output = input1 + input2;
    } else if (operator.equals("-")) {
      output = input1 - input2;
    } else if (operator.equals("*")) {
      output = input1 * input2;
    } else if (operator.equals("/")) {
      // Optional: handle division by zero
      if (input2 != 0) {
        output = input1 / input2;
      } else {
        System.out.println("Error: Division by zero!");
        sc.close();
        return;
      }
    } else {
      System.out.println("Invalid operator!");
      sc.close();
      return;
    }

    System.out.println("Result: " + output);
    sc.close();
  }
}







// to avoid the small error in vs code  sc.close() is written before every return statement you can ignore it
// Example Output:

// Input: 10, 5, +
// Output: Result: 15

// Input: 10, 0, /
// Output: Error: Division by zero!