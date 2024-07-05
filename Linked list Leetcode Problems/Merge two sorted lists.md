LeetCode Problem No. 21 Easy

Problem Statement: Merge two Sorted lists
Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]


Leetocde Soluction:

      class Solution {
      public ListNode mergeTwoLists(ListNode l1, ListNode l2){
      		if(l1 == null) return l2;
      		if(l2 == null) return l1;
      		if(l1.val < l2.val){
      			l1.next = mergeTwoLists(l1.next, l2);
      			return l1;
      		} else{
      			l2.next = mergeTwoLists(l1, l2.next);
      			return l2;
      		}
      }
    }

Explanantion:

    Make a function where two pointers pointing to the linked list will be passed.
    Now, check which value is less from both the current nodes
    The one with less value makes a recursion call by moving ahead with that pointer and  append that recursion call with the node
    Also put two base cases to check whether one of the linked lists will reach the NULL, then append the rest of the linked list.

  ![merge-two-sorted-lists-recursion](https://github.com/anunayreddy22/Data-Structures-and-Algorithms/assets/156383908/521baf0d-ac84-4829-b246-3cc2ca1736c6)

