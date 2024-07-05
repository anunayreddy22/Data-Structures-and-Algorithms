Leet Code problem No. 234 Easy

Problem Statement :-
Input: head = [1,2,2,1]
Output: true

Leetcode Solution:

      class Solution {
        public ListNode reverse(ListNode head){
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
        public boolean isPalindrome(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;
            while(fast!= null && fast.next!= null){
                slow = slow.next;
                fast = fast.next.next;
            }
            slow = reverse(slow);
            while(slow !=null && (slow.val==head.val)){
                head = head.next;
                slow = slow.next;
            }
            return slow==null;
        }
     }

Explanantion:

First we will get the mid so, that we can divide a linked list into two.

![d900da38-310b-40af-8cdf-eafcc7768718_1645850784 1322682](https://github.com/anunayreddy22/Data-Structures-and-Algorithms/assets/156383908/c3ac81b4-72c8-4f52-a95d-03d70191ed98)


After that, we will reverse the half of the linked list

![75975b60-1c6a-4f9e-8e13-09ec822cfee8_1645851418 353353](https://github.com/anunayreddy22/Data-Structures-and-Algorithms/assets/156383908/0da72c58-81a5-4a6e-8517-86589bc33b78)



then we have our slow pointer on new head & we will compare the value with old head i.e. head
We will check these value & move both the pointer's slow & head until slow reaches null.
If slow reaches null we will return true, otherwise false.

![c22253a9-cb43-43f4-8289-f30e22c403ae_1645851397 8816433](https://github.com/anunayreddy22/Data-Structures-and-Algorithms/assets/156383908/909333d3-8745-441b-ae35-07995e705295)







