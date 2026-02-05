public class maxConsecutiveOnes {
  public static void main(String[] args) {
    int[] nums = { 1, 1, 0, 1, 1, 1 };
    int result = findMaxConsecutiveOnes(nums);
    System.out.println("The maximum number of consecutive 1s is: " + result); // Output: 3
  }

  public static int findMaxConsecutiveOnes(int[] nums) {
    int maxCount = 0;
    int currentCount = 0;

    for (int num : nums) {
      if (num == 1) {
        currentCount++;
      } else {
        maxCount = Math.max(maxCount, currentCount);
        currentCount = 0;
      }
    }

    return Math.max(maxCount, currentCount);
  }
}
