class Solution {
    public int calculate(String s) {
        int sign = 1,curr_num = 0,res = 0,lgt = s.length();
        Stack<Integer> st = new Stack<>();
        for(int i = 0 ; i < lgt ; i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                curr_num = ch - '0';
                while(i+1<lgt && Character.isDigit(s.charAt(i+1))){
                    curr_num = (curr_num * 10) + (s.charAt(i+1)-'0');
                    i++;
                }
                curr_num *= sign;
                res += curr_num;
                curr_num = 0;
                sign = 1;
            }
            else if(ch=='+'){
                sign = 1;
            }
            else if(ch=='-'){
                sign = -1;
            }
            else if(ch=='('){
                st.push(res);
                st.push(sign);
                res = 0;
                sign = 1;
                curr_num = 0;
            }
            else if(ch==')'){
                int prev_sign = st.pop();
                res *= prev_sign;
                int prev_ans = st.pop();
                res += prev_ans;
            }
        }
        return res;
    }
}