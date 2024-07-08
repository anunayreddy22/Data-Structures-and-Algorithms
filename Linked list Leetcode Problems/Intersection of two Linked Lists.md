LeetCode Problem 160 Easy

Problem Statement:
Input: intersectVal = 8, listA = [4,1,8,4,5], listB = [5,6,1,8,4,5], skipA = 2, skipB = 3
Output: Intersected at '8'

Solution:
          
              public class Solution {
                public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
                    if (headA == null || headB == null) {
                        return null;
                    }
            
                    ListNode temp1 = headA;
                    ListNode temp2 = headB;
            
                    while (temp1 != temp2) {
                        if (temp1 == null) {
                            temp1 = headB;
                        } else {
                            temp1 = temp1.next;
                        }
            
                        if (temp2 == null) {
                            temp2 = headA;
                        } else {
                            temp2 = temp2.next;
                        }
                    }
            
                    return temp1;
                }
            }

Explanation:

Initial Check:
If either headA or headB is null, the function returns null immediately because no intersection is possible.

Pointer Initialization:
Two pointers temp1 and temp2 are initialized to point to the heads of the two linked lists, headA and headB, respectively.

Main Loop:
The loop continues until temp1 equals temp2, meaning the intersection node is found, or both pointers reach the end of their respective lists.

Pointer Traversal and Switching:
If temp1 reaches the end of list A, it is reset to the head of list B. Otherwise, temp1 moves to the next node in list A.
If temp2 reaches the end of list B, it is reset to the head of list A. Otherwise, temp2 moves to the next node in list B.
By switching lists once they reach the end, the two pointers will eventually traverse the same number of nodes, ensuring they meet at the intersection point if there is one.

Return Result:
When temp1 equals temp2, it means either both pointers have reached the intersection node, or both have reached the end of the lists without finding an intersection.
The function returns temp1 (or temp2), which is either the intersection node or null if there is no intersection.

