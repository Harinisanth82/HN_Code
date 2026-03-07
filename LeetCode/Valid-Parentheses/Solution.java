1class Solution {
2    public boolean isValid(String s) {
3      Stack<Character> game = new Stack<>();
4      for(char play : s.toCharArray()){
5        if(play=='(' || play=='{' || play=='['){
6            game.push(play);
7        }
8        else{
9            if(game.isEmpty()){
10                return false;
11            }
12            if(play==')' && game.pop()!='('){
13                return false;
14            }
15            if(play=='}' && game.pop()!='{'){
16                return false;
17            }
18            if(play==']' && game.pop()!='['){
19                return false;
20            }
21        }
22      }
23      return game.isEmpty();  
24    }
25}