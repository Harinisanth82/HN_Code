class Solution {
    public int[] find_pse(int[] arr,int lgt){
        int[] pse = new int[lgt];
        Stack<Integer> st = new Stack<>();
        for(int i = 0 ; i < lgt ; i++){
            while(!st.isEmpty() && arr[st.peek()] > arr[i]){
                st.pop();
            }
            pse[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return pse;
    }
    public int[] find_nse(int[] arr,int lgt){
        int[] nse = new int[lgt];
        Stack<Integer> st = new Stack<>();
        for(int i = lgt-1 ; i >= 0 ; i--){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }
            nse[i] = st.isEmpty() ? lgt : st.peek();
            st.push(i);
        }
        return nse;
    }
    public int sumSubarrayMins(int[] arr) {
        int lgt,pse[],nse[];
        long total=0,mod,contribution;
        mod = (long)(Math.pow(10,9)+7);
        lgt = arr.length;
        pse = find_pse(arr,lgt);
        nse = find_nse(arr,lgt);
        
        for(int i = 0; i < lgt ; i++){
            long left = i - pse[i];
            long right = nse[i] - i;
            contribution = (arr[i] * left % mod)*right % mod;
            total = (total + contribution) % mod;
        }
        return (int)total;
    }
}