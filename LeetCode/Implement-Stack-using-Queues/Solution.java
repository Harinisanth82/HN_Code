1class MyStack {
2    Deque<Integer> q;
3    public MyStack() {
4        q = new ArrayDeque();
5    }
6    
7    public void push(int x) {
8        q.addLast(x);
9    }
10    
11    public int pop() {
12        return q.removeLast();
13    }
14    
15    public int top() {
16        return q.peekLast();
17    }
18    
19    public boolean empty() {
20        return q.isEmpty();
21    }
22}
23
24/**
25 * Your MyStack object will be instantiated and called as such:
26 * MyStack obj = new MyStack();
27 * obj.push(x);
28 * int param_2 = obj.pop();
29 * int param_3 = obj.top();
30 * boolean param_4 = obj.empty();
31 */