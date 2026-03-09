1class MinStack {
2    Stack<int[]> s;
3    public MinStack() {
4        s = new Stack();      
5    }
6    
7    public void push(int val) {
8        if(s.isEmpty()){
9            s.push(new int[]{val,val});
10            return;
11        }
12        int minimum = s.peek()[1];
13        s.push(new int[]{val,Math.min(val,minimum)});
14    }
15    
16    public void pop() {
17        s.pop();
18    }
19    
20    public int top() {
21        return s.peek()[0];
22    }
23    
24    public int getMin() {
25        return s.peek()[1];
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