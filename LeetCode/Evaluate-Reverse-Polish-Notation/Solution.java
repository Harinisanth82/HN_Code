1class Solution {
2    public int evalRPN(String[] t) {
3        int opt_1,opt_2;
4        Stack<Integer> st = new Stack<>();
5        for(String ch : t){
6            switch(ch){
7                case "+":
8                    st.push(st.pop()+st.pop());
9                    break;
10                case "-":
11                    opt_1 = st.pop();
12                    opt_2 = st.pop();
13                    st.push(opt_2 - opt_1);
14                    break;
15                case "*":
16                    st.push(st.pop() * st.pop());
17                    break;
18                case "/":
19                    opt_1 = st.pop();
20                    opt_2 = st.pop();
21                    st.push((int)(opt_2 / opt_1));
22                    break;
23                default:
24                    st.push(Integer.parseInt(ch));
25                    break;
26            }
27        }
28        return st.size() > 0 ? st.peek() : 0;
29    }
30}