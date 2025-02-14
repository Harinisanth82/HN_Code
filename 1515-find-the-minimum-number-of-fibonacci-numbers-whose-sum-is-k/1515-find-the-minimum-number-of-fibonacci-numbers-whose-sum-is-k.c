int nacci(int fib[],int k){
    fib[0]=1;
    fib[1]=1;
    int i=2;
    while(fib[i-1]+fib[i-2]<=k){
        fib[i]=fib[i-1]+fib[i-2];
        i++;
    }
    return i;
}
int fibbo(int k){
    int fib[1000];
    int size=nacci(fib,k);
    int count=0;
    for(int i=size-1;i>=0;i--){
        if(fib[i]<=k){
            count++;
            k-=fib[i];
        }
        if(k==0){
            break;
        }
    }
    return count;
}
int findMinFibonacciNumbers(int k) {
      return fibbo(k);
}