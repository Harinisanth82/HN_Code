class Solution {
    public int calculate(String s) {
        int lgt,curr_num = 0,res = 0; 
        char sign = '+';
        lgt = s.length();
        Stack<Integer> st = new Stack<>();
        if(s == null || lgt == 0) return 0;

        for(int i = 0; i < lgt; i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                curr_num = curr_num * 10 + (ch - '0');
            }
            if(!Character.isDigit(ch) && ch != ' ' || i == s.length() - 1){
                if(sign == '+'){
                    st.push(curr_num);
                }
                else if(sign == '-'){
                    st.push(-curr_num);
                }
                else if(sign == '*'){
                    st.push(st.pop() * curr_num);
                }
                else if(sign == '/'){
                    st.push(st.pop() / curr_num);
                }
                sign = ch;
                curr_num = 0;
            }
        }
        while(!st.isEmpty()){
            res += st.pop();
        }
        return res;
    }
}