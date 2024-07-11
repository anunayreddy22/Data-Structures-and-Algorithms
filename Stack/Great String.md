Leetcode Problem No. 1544  Make The String Great EASY

Problem Statement:

Input: s = "abBAcC"
Output: ""
Explanation: We have many possible scenarios, and all lead to the same answer. For example:
"abBAcC" --> "aAcC" --> "cC" --> ""
"abBAcC" --> "abBA" --> "aA" --> ""

LeetCode Solution:

      class Solution {
          public String makeGood(String s) {
              int endPosition = 0; // Represents the end position of the modified string
              char[] charArray = s.toCharArray(); // Convert the string to a character array
              
              // Loop through each character in the string
              for (int currentPosition = 0; currentPosition < s.length(); currentPosition++) {
                  // Check if the current character can be removed
                  if (endPosition > 0 && Math.abs(charArray[currentPosition] - charArray[endPosition - 1]) == 32){
                      endPosition--; // Decrement the end position if the current character can be removed
                  }else {
                      // Otherwise, keep the current character and increment the end position
                      charArray[endPosition] = charArray[currentPosition];
                      endPosition++;
                  }
              }
      
              // Convert the modified character array to a string and return only the valid portion
              return new String(charArray).substring(0, endPosition);
          }
      }


Explanation:

We'll start by setting up a tracker, endPosition, to indicate the end position of the modified string.
Convert the input string s into an array of characters charArray. Think of charArray as a board where we'll put characters after checking them.

Now, we'll go through each character in the original string s.
For each character, we'll check if it can be removed.
If the character can be removed, it means it's adjacent to another character with the same letter but different cases.
To check this, we'll compare the current character with the character at endPosition - 1. If they are the same letter but different cases, we'll remove them.
If they can't be removed, we'll keep the current character by placing it in the charArray at endPosition and then move endPosition to the next position.
3. Return the Modified String:

Finally, we'll convert the modified charArray back to a string, keeping only the valid portion up to endPosition.
