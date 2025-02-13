int pivotIndex(int* nums, int numsSize) {
    int total=0,r,l;
    for(int i=0;i<numsSize;i++){
        total+=nums[i];
    }
    for(int i=0;i<numsSize;i++){
        r=total-l-nums[i];
        if(r==l){
            return i;
        }
        l+=nums[i];
    }
    return -1;
    
}