//Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The relative order of the elements may be changed.

public class removeElements {
  public static void main(String[] args) {
    int[] nums = {3,2,2,3};
    int val = 3;
    int k = removeElement(nums, val);          // k is the new length of the array after removing val
    System.out.println("Length after removing elements: " + k);
    System.out.print("Array after removing elements: ");
    for (int i = 0; i < k; i++) {
      System.out.print(nums[i] + " ");
    }
  }

  public static int removeElement(int[] nums, int val) {
    int x = 0;                                  // pointer for the position of the next non-val element
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != val) {
        nums[x] = nums[i];                      // update the position with the non-val element
        x++;                                    // move to the next position for non-val element
      }
    }
    return x;                                   // return the length of the array without val elements
  }
}



//Time Complexity: O(n) - We traverse the array once.
//Space Complexity: O(1) - We use constant extra space.
//output:
//Length after removing elements: 2
//Array after removing elements: 2 2