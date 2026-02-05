// Finding the one missing number in an array containing n distinct numbers taken from 0, 1, 2, ..., n.

public class missingNumber {
  public static void main(String[] args) {
    int[] nums = { 3, 0, 1 };
    int missing = findMissingNumber(nums);
    System.out.println("The missing number is: " + missing); // Output: 2
  }

  public static int findMissingNumber(int[] nums) {
    int n = nums.length;
    int expectedSum = n * (n + 1) / 2;
    int actualSum = 0;

    for (int num : nums) {
      actualSum += num;
    }

    return expectedSum - actualSum;
  }
}


// output:
// The missing number is: 2