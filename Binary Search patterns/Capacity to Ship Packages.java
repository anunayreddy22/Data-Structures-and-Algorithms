// Leetcode 1011
class Solution {
    private int possible (int capacity, int[] weights) {
        int sum = 0, days = 1;
        for (int w : weights) {
            sum += w;
            if (sum > capacity) {
                days++;
                sum = w;
            }
        }
        return days;
    }
	
    public int shipWithinDays(int[] weights, int D) {
        int min = 0, max = 0;
        for (int w : weights) {
            max += w;
            min = Math.max(w, min);
        }
        while (min <= max) {
            int mid = min + (max - min)/2;
            if (possible(mid, weights) > D) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }
        return min;
    }
}
