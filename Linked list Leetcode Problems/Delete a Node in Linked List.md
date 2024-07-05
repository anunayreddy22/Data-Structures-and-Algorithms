LeetCode Problem 237 Medium

Problem Statement:

Input: head = [4,5,1,9], node = 5
Output: [4,1,9]

LeetCode Solution:

    class Solution {
        public void deleteNode(ListNode node) {
            node.val = node.next.val;
            node.next = node.next.next;
        }
    }

Explanation : We have already discuseed how to traverse, insert,delete you can refer Readme.md for clear explanantion and code.
