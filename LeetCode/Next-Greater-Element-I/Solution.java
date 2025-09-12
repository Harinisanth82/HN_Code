class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        for(int i = nums2.length-1;i >= 0; i--){
            int inp = nums2[i];
            while(!st.isEmpty() && st.peek()<=inp){
                st.pop();
            }
            if(st.isEmpty()){
                map.put(inp,-1);
            }
            else{
                map.put(inp,st.peek());
            }
            st.push(inp);
        }
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = map.get(nums1[i]);
        }
        return result;
    }
}