Leetcode Problem 1021 EASY

Problem Statemnt:

Input: s = "(()())(())"
Output: "()()()"
Explanation: 
The input string is "(()())(())", with primitive decomposition "(()())" + "(())".
After removing outer parentheses of each part, this is "()()" + "()" = "()()()".


Leetcode Solution:

    class Solution {
        public String removeOuterParentheses(String s) {
            Stack<Character> bracket = new Stack<>();
            StringBuilder sb = new StringBuilder("");
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='('){
                    if(bracket.size()>0){
                        sb.append(s.charAt(i));
                    }
                    bracket.push(s.charAt(i));
                }else{
                    bracket.pop();
                    if(bracket.size()>0){
                        sb.append(s.charAt(i));
                    }
                }
            }
            return sb.toString();
        }
    }


Explanation:

The approach used is to keep track of the parentheses using a stack. Whenever an opening parenthesis is encountered, it is pushed onto the stack. Whenever a closing parenthesis is encountered, 
the last opening parenthesis is popped from the stack. If the stack size is greater than zero after pushing or popping, it means that the parenthesis is not an outer parenthesis, 
and it is added to the result string. If the stack size is zero, it means that the parenthesis is an outer parenthesis and it is not added to the result string.
