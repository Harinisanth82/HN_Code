class Solution {
    public int[] mostCompetitive(int[] nums, int k) {
        int lgt = nums.length;
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < lgt ; i++){
            while(!st.isEmpty() && st.peek() > nums[i] &&((st.size() - 1) + (lgt - i)) >= k){
                st.pop();
            }
            if(st.size() < k){
                st.push(nums[i]);
            }
        }
        int[] res = new int[k];
        for(int i = k-1; i >= 0 ; i--){
            res[i] = st.pop();
        }
        return res;
    }
}