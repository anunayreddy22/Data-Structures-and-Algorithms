Leetcode Problem No. 316 Medium

Problem Statemnt:

Input: s = "bcabc"
Output: "abc"

LeetCode Solution:

    public String smallestSubsequence(String S) {
        Stack<Integer> stack = new Stack<>();
        int[] last = new int[26], seen = new int[26];
        for (int i = 0; i < S.length(); ++i)
            last[S.charAt(i) - 'a'] = i;
        for (int i = 0; i < S.length(); ++i) {
            int c = S.charAt(i) - 'a';
            if (seen[c]++ > 0) continue;
            while (!stack.isEmpty() && stack.peek() > c && i < last[stack.peek()])
                seen[stack.pop()] = 0;
            stack.push(c);
        }
        StringBuilder sb = new StringBuilder();
        for (int i : stack) sb.append((char)('a' + i));
        return sb.toString();
    }

Explanation:

Find the index of last occurrence for each character. Use a stack to keep the characters for result. Loop on each character in the input string S,if the current character is smaller than 
the last character in the stack, and the last character exists in the following stream, we can pop the last character to get a smaller result. 
