int sumOfGoodNumbers(int* nums, int numsSize, int k) {
    int res=0,i,l,r;
    for(i=0;i<numsSize;i++){
        l=i-k;
        r=i+k;
        if((l<0 || nums[i]>nums[l]) && (r>=numsSize || nums[i]>nums[r])){
            res+=nums[i];
        }
    }
    return res;
}