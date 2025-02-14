int tribonacci(int n) {
    if(n==0){
        return 0;
    }
    int fib[1000],i=3;
    fib[0]=0;
    fib[1]=1;
    fib[2]=1;
    while(i<=n){
        fib[i]=fib[i-1]+fib[i-2]+fib[i-3];
        i++;
    }
    return fib[i-1];
}