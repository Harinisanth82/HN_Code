class Solution {
    public int[] dailyTemperatures(int[] t) {
        int lgt = t.length;
        int[] res = new int[lgt];
        Stack<Integer> st = new Stack<>();
        for(int i = lgt-1;i >= 0; i--){
            int digit = t[i];
            while(!st.isEmpty() && digit >= t[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                res[i] = 0;
            }
            else{
                res[i] = st.peek()-i;
            }
            st.push(i);
        }
        return res;
    }
}