LeetCode Problem No. 141 Easy

Problem Statement :-
Input: head = [3,2,0,-4], pos = 1
Output: true

Leetcode Solution;

    public class Solution {
        public boolean hasCycle(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;
    
            while(fast!=null && fast.next!=null){
                slow = slow.next;
                fast = fast.next.next;
                if(slow==fast){
                    return true;
                }
            }
            return false;
        }
    }


Explanation:

![325b2c52-e0e0-4f7b-961b-a9d2750b3e44_1645848331 7793062](https://github.com/anunayreddy22/Data-Structures-and-Algorithms/assets/156383908/d55d6b4c-2810-4673-b03a-b93582734476)

***Just Remember this point if at any point slow and fast pointer equals then there will be cycle for sure

