int guess(int num);
int guessNumber(int n){
    double l=0,r=n,mid,res;
    while(true){
        mid=(l+r)/2;
        res=guess(mid);
        if(res>0){
            l=mid+1;
        }
        else if(res<0){
            r=mid-1;
        }
        else{
            return mid;
        }
    }	
}