1class Solution {
2    public boolean isValid(String s) {
3        int lgt = s.length();
4        Stack<Character> st = new Stack();
5        for(char ch : s.toCharArray()){
6            if(ch=='(' || ch=='{' || ch=='['){
7                st.push(ch);
8            }
9            else{
10                if(st.isEmpty()){
11                    return false;
12                }
13                else if(ch==')' && st.pop()!='('){
14                    return false;
15                }
16                else if(ch=='}' && st.pop()!='{'){
17                    return false;
18                }
19                else if(ch==']' && st.pop()!='['){
20                    return false;
21                }
22            } 
23        }   
24        return st.isEmpty();
25    }
26}