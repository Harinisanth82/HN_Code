class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int lgt = nums.length;
        int[] res = new int[lgt];
        Stack<Integer> st = new Stack<>();
        for(int i = (2*lgt)-1;i >=0; i--){
            int val = nums[i%lgt];
            while(!st.isEmpty() && val >= st.peek()){
                st.pop();
            }
            if(i<lgt){
                res[i] = st.isEmpty() ? -1 : st.peek(); 
            }
            st.push(val);
        }
        return res;
    }
}