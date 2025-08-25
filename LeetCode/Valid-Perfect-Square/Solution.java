class Solution {
    public boolean isPerfectSquare(int num) {
        if (num == 1) return true;
        
        int l = 1, r = num / 2;
        while (l <= r) {
            int mid = l + (r - l) / 2;   // safe mid calculation
            long sq = (long) mid * mid;  // prevent overflow

            if (sq == num) {
                return true;
            } else if (sq < num) {
                l = mid + 1;   // ✅ move right
            } else {
                r = mid - 1;   // ✅ move left
            }
        }
        return false;
    }
}
