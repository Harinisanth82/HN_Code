class Solution {
    public int compute(int num){
        int res = 0;
        while(num != 0){
            res = res + ((num%10)*(num%10));
            num = num/10;
        }
        return res;
    }
    public boolean isHappy(int n) {
        int slow,fast;
        slow=fast=n;
        do{
            slow = compute(slow);
            fast = compute(compute(fast));
        }while(slow != fast);
        
        return slow==1;
    }
}