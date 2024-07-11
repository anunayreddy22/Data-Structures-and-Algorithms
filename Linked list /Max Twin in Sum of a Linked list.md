LeetCode Problem No. 2130 Medium

Problem Statement:

Input: head = [5,4,2,1]
Output: 6
Explanation:
Nodes 0 and 1 are the twins of nodes 3 and 2, respectively. All have twin sum = 6.
There are no other nodes with twins in the linked list.
Thus, the maximum twin sum of the linked list is 6. 


leetcode Solution:

        class Solution {
            public int pairSum(ListNode head) {
                ListNode mid = getMid(head);
                ListNode rev = reverse(mid);
                int ans = 0;
                while(rev != null){
                    ans = Math.max((head.val + rev.val), ans);
                    head = head.next;
                    rev = rev.next;
                }
                return ans;
                
            }
        
            public ListNode getMid(ListNode head){
                ListNode slow = head;
                ListNode fast = head;
                while(fast != null){
                    if(fast.next == null){
                        break;
                    }
                    slow = slow.next;
                    fast = fast.next.next;
                }
                return slow;
            }
            public ListNode reverse(ListNode head){
                if (head== null || head.next==null){
                    return head;
                }
        
                ListNode prev = head;
                ListNode cur = head.next;
        
                while(cur != null){
                    ListNode next = cur.next;
                    cur.next = prev;
        
                    prev = cur;
                    cur = next;
                }
        
                head.next = null;
                head = prev;
                return prev;
            } 
        }


Explanation : Self Explanatory --> Find Mid reverse second half of linked list or Else we can also use Two Pointers approach.
