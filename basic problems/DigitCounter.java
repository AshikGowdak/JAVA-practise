public class DigitCounter {

    static int countDigits(int n) {
        if (n == 0) return 1;   // edge case

        n = Math.abs(n);        // handle negative numbers
        int count = 0;

        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        int input = -1265545;
        System.out.println(countDigits(input)); // Output: 5
    }
}
