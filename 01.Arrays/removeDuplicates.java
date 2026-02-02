//Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.

class removeDuplicates {
  public static void main(String[] args) {
    int[] nums = {0,0,1,1,1,2,2,3,3,4};
    int k = removeDuplicate(nums);              // k is the new length of the array after removing duplicates
    System.out.println("Length after removing duplicates: " + k);
    System.out.print("Array after removing duplicates: ");
    for (int i = 0; i < k; i++) {
      System.out.print(nums[i] + " ");
    }
  }

  public static int removeDuplicate(int[] nums) {
    if (nums.length == 0) return 0;
    int x = 0;                                  // pointer for the position of the last unique element
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] != nums[x]) {
        x++;                                    // move to the next position for unique element
        nums[x] = nums[i];                      // update the position with the new unique element
      }
    }
    return x + 1;                               // return the length of the array with unique elements
  }
}



//Time Complexity: O(n) - We traverse the array once.
//Space Complexity: O(1) - We use constant extra space.
//output:
//Length after removing duplicates: 5
//Array after removing duplicates: 0 1 2 3 4