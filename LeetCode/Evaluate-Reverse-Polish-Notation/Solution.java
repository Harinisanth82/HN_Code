class Solution {
    public int evalRPN(String[] t) {
        int opt_1,opt_2;
        Stack<Integer> st = new Stack<>();
        for(String ch : t){
            switch(ch){
                case "+":
                    st.push(st.pop()+st.pop());
                    break;
                case "-":
                    opt_1 = st.pop();
                    opt_2 = st.pop();
                    st.push(opt_2 - opt_1);
                    break;
                case "*":
                    st.push(st.pop() * st.pop());
                    break;
                case "/":
                    opt_1 = st.pop();
                    opt_2 = st.pop();
                    st.push((int)(opt_2 / opt_1));
                    break;
                default:
                    st.push(Integer.parseInt(ch));
                    break;
            }
        }
        return st.size() > 0 ? st.peek() : 0;
    }
}