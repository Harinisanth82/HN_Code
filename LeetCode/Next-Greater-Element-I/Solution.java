1class Solution {
2    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
3        Map<Integer,Integer> map = new HashMap<>();
4        Stack<Integer> st = new Stack<>();
5        for(int i = nums2.length-1;i >= 0; i--){
6            int inp = nums2[i];
7            while(!st.isEmpty() && st.peek()<=inp){
8                st.pop();
9            }
10            if(st.isEmpty()){
11                map.put(inp,-1);
12            }
13            else{
14                map.put(inp,st.peek());
15            }
16            st.push(inp);
17        }
18        int[] result = new int[nums1.length];
19        for (int i = 0; i < nums1.length; i++) {
20            result[i] = map.get(nums1[i]);
21        }
22        return result;
23    }
24}