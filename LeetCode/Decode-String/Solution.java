class Solution {
    public String decodeString(String s) {
        int num = 0,times = 0;
        String prev = "";
        String curr = "";

        Stack<Integer> st = new Stack<>();
        Stack<String> ct = new Stack<>();
        
        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                num = (num * 10) + (ch - '0');
            }
            else if(ch == '['){
                st.push(num);
                ct.push(curr);

                num = 0;
                curr = "";
            }
            else if(ch == ']'){
                times = st.pop();
                prev = ct.pop();
                StringBuilder temp = new StringBuilder(prev);
                for(int i = 1; i <= times; i++){
                    temp.append(curr);
                }
                curr = temp.toString();
            }
            else{
                curr += ch;
            }
        }
        return curr;
    }
}