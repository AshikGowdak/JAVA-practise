// LeetCode Problem 136: Single Number

public class singleNumber {
  public static void main(String[] args) {
    int[] nums = { 4, 1, 2, 1, 2 };
    int result = uniqueNumber(nums);
    System.out.println("The single number is: " + result); // Output: 4
  }
  public static int uniqueNumber(int[] nums) {
    int single = 0;
    for (int num : nums) {
      single ^= num; // XOR operation
    }
    return single;
  }
}


// output:
// The single number is: 4