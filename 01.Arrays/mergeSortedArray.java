// Merge Sorted Array - LeetCode #88

public class mergeSortedArray {

  public static void main(String[] args) {
    int[] nums1 = { 1, 2, 3, 0, 0, 0 };
    int m = 3;
    int[] nums2 = { 2, 5, 6 };
    int n = 3;

    merge(nums1, m, nums2, n);

    // Print merged array
    for (int num : nums1) {
      System.out.print(num + " ");
    }
  }

  public static void merge(int[] nums1, int m, int[] nums2, int n) {
    int p1 = m - 1; // pointer for nums1
    int p2 = n - 1; // pointer for nums2

    for (int i = m + n - 1; i >= 0; i--) {
      if (p2 < 0)
        break; // nums2 fully merged

      if (p1 >= 0 && nums1[p1] > nums2[p2]) { // take element from nums1 if it's larger
        nums1[i] = nums1[p1];
        p1--;
      } else {
        nums1[i] = nums2[p2]; // take element from nums2
        p2--;
      }
    }
  }
}
