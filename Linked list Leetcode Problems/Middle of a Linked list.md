LeetCode Problem No. 876 Easy

Problem Statement :-
Input: head = [1,2,3,4,5]
Output: [3,4,5]


Leetcode Solution:

      class Solution {
        public ListNode middleNode(ListNode head) {
           // base Condition
            if(head.next == null){
              return head;
            }
            ListNode slow = head;
            ListNode fast = head;
            while(fast != null && fast.next!=null){
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
         }
      }

Explanation

![453dd992-47d2-4c8c-a323-812aa349f47b_1645847501 6568627](https://github.com/anunayreddy22/Data-Structures-and-Algorithms/assets/156383908/50079113-37eb-4e4b-bb65-793f788f9973)


Fast pointer will move at the speed of 2X
Slow pointer will move at the speed of 1X
If fast pointer reaches null or fast.next is null we will return our slow pointer which mean's our slow pointer is pointing at mid of linked list as the fast pointer
moves at double the speed of slow pointer while the fast pointer reaches end the slow pointer will be at the middle of the linked list
