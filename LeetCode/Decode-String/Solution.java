1class Solution {
2    public String decodeString(String s) {
3        int num = 0,times = 0;
4        String prev = "";
5        String curr = "";
6
7        Stack<Integer> st = new Stack<>();
8        Stack<String> ct = new Stack<>();
9        
10        for(char ch : s.toCharArray()){
11            if(Character.isDigit(ch)){
12                num = (num * 10) + (ch - '0');
13            }
14            else if(ch == '['){
15                st.push(num);
16                ct.push(curr);
17
18                num = 0;
19                curr = "";
20            }
21            else if(ch == ']'){
22                times = st.pop();
23                prev = ct.pop();
24                StringBuilder temp = new StringBuilder(prev);
25                for(int i = 1; i <= times; i++){
26                    temp.append(curr);
27                }
28                curr = temp.toString();
29            }
30            else{
31                curr += ch;
32            }
33        }
34        return curr;
35    }
36}