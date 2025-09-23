class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for(int i : asteroids){
            while(!st.isEmpty() && i < 0 && st.peek() > 0){
                if(Math.abs(st.peek()) > Math.abs(i)){
                    i = 0;
                }
                else if(Math.abs(st.peek()) < Math.abs(i)){
                    st.pop();
                }
                else{
                    i = 0;
                    st.pop();
                }
            }
            if(i != 0){
                st.push(i);
            }
        }
        int[] result = new int[st.size()];
        int i=st.size()-1;
        while(!st.isEmpty()){
            result[i--] = st.pop();
        }
        return result;
    }
}