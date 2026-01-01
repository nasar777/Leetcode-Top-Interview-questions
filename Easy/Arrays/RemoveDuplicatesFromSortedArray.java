/*
Problem: Remove Duplicates from Sorted Array
Link: https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/727/

Category: Arrays / Two Pointers
Difficulty: Easy

Core Idea:
Use two pointers to track unique elements. One pointer (i) points to the last unique element, another (j) iterates through the array.

Step-by-Step Logic:
- Handle empty array → return 0 if length is 0
- Initialize i = 0 (last unique element index)
- Iterate j from 1 to end of array:
  - If nums[j] != nums[i], increment i and assign nums[i] = nums[j]
- After loop, i + 1 gives the length of the array without duplicates

Time & Space Complexity:
- Time: O(n) – single pass through the array
- Space: O(1) – in-place modification

Key Edge Cases:
- Empty array → return 0
- All duplicates → returns 1
- All unique → returns original length
- Single element → returns 1
*/

class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0; // last unique element index
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1; // length of unique elements
    }
}
