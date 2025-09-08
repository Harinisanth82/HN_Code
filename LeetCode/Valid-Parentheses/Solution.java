class Solution {
    public boolean isValid(String s) {
      Stack<Character> game = new Stack<>();
      for(char play : s.toCharArray()){
        if(play=='(' || play=='{' || play=='['){
            game.push(play);
        }
        else{
            if(game.isEmpty()){
                return false;
            }
            if(play==')' && game.pop()!='('){
                return false;
            }
            if(play=='}' && game.pop()!='{'){
                return false;
            }
            if(play==']' && game.pop()!='['){
                return false;
            }
        }
      }
      return game.isEmpty();  
    }
}