Monotonic Stack
LeetCode Problme No. 739 Medium

Problem Statemnt:

Given an array of integers temperatures represents the daily temperatures, return an array answer such that answer[i] is the number of days you have to wait after the ith day to 
get a warmer temperature. If there is no future day for which this is possible, keep answer[i] == 0 instead.

Example 1:

Input: temperatures = [73,74,75,71,69,72,76,73]
Output: [1,1,4,2,1,1,0,0]

leetcode Solution:

      class Solution {
          public int[] dailyTemperatures(int[] temps) {
              int[] results = new int[temps.length];
              Stack<Integer> stack = new Stack<>();
              for (int i = 0; i < temps.length; i++) {
                  while (!stack.isEmpty() && temps[stack.peek()] < temps[i]) {
                      results[stack.peek()] = i - stack.pop();
                  }
                  stack.push(i);
              }
      
              return results;
          }
      }

Explanation:  

Initialize an array results to store the number of days until a warmer day for each day's temperature.
Initialize an empty stack to keep track of indices.
Iterate through each temperature in the array.
  While the stack is not empty and the current temperature is greater than the temperature at the index on the top of the stack:
    Update the result for the index at the top of the stack with the difference between the current index and the index on the top of the stack.
    Pop the index from the stack.
    Push the current index onto the stack.
After the iteration, the results array contains the number of days until a warmer day for each given day.
