LeetCode Problem No. 1614. Maximum Nesting Depth of the Parentheses  EASY

Problem Statement:

Input: s = "(1+(2*3)+((8)/4))+1"
Output: 3

Prob Explanation:
Digit 8 is inside of 3 nested parentheses in the string.

Leetcode Solution:

    class Solution {
        public int maxDepth(String s) {
            int depth = 0;
            int open = 0;
    
            for(char ch : s.toCharArray()) {
                if(ch=='(') {
                    open++;
                }
                else if(ch==')') {
                    open--;
                }
                depth = Math.max(open, depth);
            }
            return depth;
        }
    }

Explanantion:

Initialize two variables, depth and open, both set to 0.
Iterate through each character of the input string s using a for-each loop.

If the current character is an opening parenthesis '(', increment the open count.
If the current character is a closing parenthesis ')', decrement the open count.
Update Depth: Update the depth variable using Math.max(open, depth). This ensures that depth holds the maximum value of open encountered during the iteration.

Return Depth: After iterating through the entire string, return the final value of depth, which represents the maximum depth of nested parentheses in the input string.
