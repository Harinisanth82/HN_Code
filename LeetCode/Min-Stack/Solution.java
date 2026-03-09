1class MinStack {
2    Stack<int[]> st;
3    public MinStack() {
4        st = new Stack();
5    }
6    
7    public void push(int val) {
8        if(st.isEmpty()){
9            st.push(new int[]{val,val});
10            return;
11        }
12        int min = st.peek()[1];
13        st.push(new int[]{val,Math.min(val,min)});
14    }
15    
16    public void pop() {
17        st.pop();
18    }
19    
20    public int top() {
21        return st.peek()[0];
22    }
23    
24    public int getMin() {
25        return st.peek()[1];   
26    }
27}
28
29/**
30 * Your MinStack object will be instantiated and called as such:
31 * MinStack obj = new MinStack();
32 * obj.push(val);
33 * obj.pop();
34 * int param_3 = obj.top();
35 * int param_4 = obj.getMin();
36 */