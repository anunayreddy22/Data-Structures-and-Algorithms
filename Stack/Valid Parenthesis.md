LeetCode Problem NO. 20 Valid Parenthesis EASY

Problem Statement:

Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false

LeetCode Solution:

      class Solution {
          public boolean isValid(String s) {
              if (s.length() == 0) {
                  return false;
              }
              Stack<Character> st = new Stack<>();
              for (int i = 0; i < s.length(); i++) {
                  char c = s.charAt(i);
                  if (c == '(' || c == '{' || c == '[') {
                      st.push(c);
                  } else {
                      if (st.isEmpty()) {
                          return false;
                      }
                      char ch = st.pop();
                      if ((c == ')' && ch != '(') || (c == '}' && ch != '{') || (c == ']' && ch != '[')) {
                          return false;
                      }
                  }
              }
              return st.isEmpty();
          }
      }

Explanation:

Firstly if it an open parenthesis i.e ( '(','{','[' ) Then push them into Stack. else pop the charcter from stack and comapre it with the charcter we are presently traversing
if(present charact is ')' an dthe poped charcter from stack id '('  or same for{},[]) based on that go onlike this if it valid parenthesis the stack will eventually get empty otherwise not.
