public class reverseInteger {

  public static void main(String[] args) {
    int input = 151655;
    int output = reverseInt(input);
    System.out.println(output);
  }

  public static int reverseInt(int num) {
    int rev = 0;

    while (num != 0) {
      int digit = num % 10;// get last digit
      num /= 10;// remove last digit

      // Check for overflow/underflow before multiplying and adding
      if (rev > Integer.MAX_VALUE / 10 ||
          (rev == Integer.MAX_VALUE / 10 && digit > 7)) {
        return 0;
      }
      if (rev < Integer.MIN_VALUE / 10 ||
          (rev == Integer.MIN_VALUE / 10 && digit < -8)) {// underflow
        return 0;
      }

      rev = rev * 10 + digit;// append digit from last to first
    }
    return rev;// return reversed integer
  }

}