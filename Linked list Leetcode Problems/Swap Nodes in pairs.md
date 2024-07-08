Leetcode Problem No. 24 Medium

Problem Statement:
head = [1,2,3,4]
output = [2,1,4,3]

Solution:

    class Solution {
        public ListNode swapPairs(ListNode head) {
    
            ListNode dummy = new ListNode(-1);
            ListNode prev = dummy;
    
            if(head == null || head.next == null) return head;
    
            while (head != null && head.next != null) {
    
                ListNode firstNode = head;
                ListNode secondNode = head.next;
    
                prev.next = secondNode;
                firstNode.next = secondNode.next;
                secondNode.next = firstNode;
    
                prev = firstNode;
                head = firstNode.next;
            }
    
            return dummy.next;
        }
    }

Explanation:

Create a dummy node and set its next pointer to the head of the linked list. This dummy node simplifies the code and handles edge cases when swapping the first pair.

Initialize a pointer cur to the dummy node to traverse the linked list.

Use a while loop to iterate through the list as long as there are at least two nodes remaining to swap (cur.next != null && cur.next.next != null).

Inside the loop, identify the first and second nodes in the pair to be swapped (first and sec).

Swap the nodes by adjusting the next pointers. Update the cur.next to point to the second node in the pair, and adjust the next pointers of first and sec accordingly.

Move the cur pointer to the next pair by setting it to the original first node.

Continue the loop until all pairs have been swapped.

Return the dummy.next as the new head of the modified linked list.

    
