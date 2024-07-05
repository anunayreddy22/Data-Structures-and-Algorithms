LeetCode Problem No. 206 - Easy 

Problem Statement :-
Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]

Code :

            class Solution {
                public ListNode reverseList(ListNode head) {
                    ListNode prev = null;
                    ListNode curr = head;
                    ListNode forw = null;
                    while(curr!=null){
                        forw = curr.next;
                        curr.next = prev;
                        prev = curr;
                        curr = forw;
                    }
                    return prev;
                }
            }

Explanation:  

We use 3 pointer's prev = previous, curr = current, forw = forward. Where prev will point to the previous pointer, curr will point to the current pointer & forw will point to the next pointer.

Prev will hold the previous value becuase, if we break the link. So, we will not lose our linked list
Similarly forw will point to the next pointer after curr. So, that once link is broken we will not lose our remaining linked list.
Once curr reaches null our prev will be on our new head. So, we will return our prev as the answer.


![453dd992-47d2-4c8c-a323-812aa349f47b_1645847501 6568627](https://github.com/anunayreddy22/Data-Structures-and-Algorithms/assets/156383908/eab3a0e6-c305-4eb4-80d5-593d87a286e6)


















