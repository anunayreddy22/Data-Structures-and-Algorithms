// Leetcode  374

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int first =1;
        int last = n;
        while(first<=last){
            int mid = first + (last-first)/2;
            if(guess(mid)==-1){
                last = mid-1;
            }
            if(guess(mid)==1){
                first = mid+1;
            }
            if(guess(mid)==0){
                return mid;
            }
        }
        return 0;
    }
}
