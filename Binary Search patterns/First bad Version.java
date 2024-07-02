// Leetocde 278
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
            int lo = 0, hi = n;
            while (lo + 1 < hi) {
                int mid = lo + ((hi - lo) / 2);
                if (isBadVersion(mid)) {
                hi = mid;
                } else {
                lo = mid;
                }
            }

            return hi;
    }
}
