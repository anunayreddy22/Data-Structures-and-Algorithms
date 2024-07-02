//LeetCode 540

Approach for this Problem:
Initialize two pointers, left and right, to the first and last indices of the input array, respectively.
While the left pointer is less than the right pointer:
a. Compute the index of the middle element by adding left and right and dividing by 2.
b. If the index of the middle element is odd, subtract 1 to make it even.
c. Compare the middle element with its adjacent element on the right:
      i. If the middle element is not equal to its right neighbor, the single element must be on the left side of the array, so update the right pointer to be
         the current middle index.
      ii. Otherwise, the single element must be on the right side of the array, so update the left pointer to be the middle index plus 2.
      When the left and right pointers converge to a single element, return that element.

class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low=0, high = nums.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if (mid % 2 == 1) {
                mid--;
            }
            if (nums[mid] != nums[mid + 1]) {
                right = mid;
            } else {
                left = mid + 2;
            }
        } 
    }
}
