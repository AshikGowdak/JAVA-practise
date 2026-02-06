// Count positive, negative, and zero elements

public class countTypeOfNum {
  public static void main(String[] args) {
    int[] nums = { -1, 0, 1, 2, -2, 3, 0 };
    int[] result = countTypes(nums);
    System.out.println("Positive: " + result[0] + ", Negative: " + result[1] + ", Zero: " + result[2]);
    // Output: Positive: 3, Negative: 2, Zero: 2
  }
  public static int[] countTypes(int[] nums) {
    int positiveCount = 0;
    int negativeCount = 0;
    int zeroCount = 0;

    for (int num : nums) {
      if (num > 0) {
        positiveCount++;
      } else if (num < 0) {
        negativeCount++;
      } else {
        zeroCount++;
      }
    }

    return new int[]{positiveCount, negativeCount, zeroCount};
  }
}


//output: Positive: 3, Negative: 2, Zero: 2