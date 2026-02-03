public class moveZeros {
  public static void main(String[] args) {
    int[] nums = { 0, 1, 0, 3, 12 };
    moveZeroes(nums);
    System.out.print("Array after moving zeros: ");
    for (int num : nums) {
      System.out.print(num + " ");
    }
  }

  public static void moveZeroes(int[] nums) {
    int lastNonZeroIndex = 0; // Pointer for the position of the last non-zero element
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != 0) {
        nums[lastNonZeroIndex] = nums[i]; // Move non-zero element to the last non-zero position
        lastNonZeroIndex++; // Increment the position for the next non-zero element
      }
    }
    for (int i = lastNonZeroIndex; i < nums.length; i++) {
        nums[i] = 0; // Fill the remaining positions with zeros
      }
  }
}




//Time Complexity: O(n) - We traverse the array twice.
//Space Complexity: O(1) - We use constant extra space.
//output:
//Array after moving zeros: 1 3 12 0 0