// The input string is given as an array of characters char[] s.Reverse the array in-place.

public class reverseStrings {
  public static void main(String[] args) {
    char[] s = {'h','e','l','l','o'};
    reverseString(s);
    System.out.print("Reversed string: ");
    for (char c : s) {
      System.out.print(c + " ");
    }
  }
  public static void reverseString(char[] s) {
    int left = 0;                              // pointer for the start of the array
    int right = s.length - 1;                 // pointer for the end of the array
    while (left < right) {
      char temp = s[left];                    // store the left character temporarily
      s[left] = s[right];                     // swap the left and right characters
      s[right] = temp;                        // assign the stored character to the right position
      left++;                                 // move the left pointer to the right
      right--;                                // move the right pointer to the left
    }
  }
}



//Time Complexity: O(n) - We traverse half of the array to reverse it.
//Space Complexity: O(1) - We use constant extra space.
//output:
//Reversed string: o l l e h