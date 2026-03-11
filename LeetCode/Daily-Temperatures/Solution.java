1class Solution {
2    public int[] dailyTemperatures(int[] t) {
3        int lgt = t.length;
4        int[] res = new int[lgt];
5        Stack<Integer> st = new Stack<>();
6        for(int i = lgt-1;i >= 0; i--){
7            int digit = t[i];
8            while(!st.isEmpty() && digit >= t[st.peek()]){
9                st.pop();
10            }
11            if(st.isEmpty()){
12                res[i] = 0;
13            }
14            else{
15                res[i] = st.peek()-i;
16            }
17            st.push(i);
18        }
19        return res;
20    }
21}