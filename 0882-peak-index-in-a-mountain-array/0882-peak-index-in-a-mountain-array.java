class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int l,r;
        l=0;
        r=arr.length-1;
        while(l<r){
            int mid=(l+r)-1;
            if(arr[mid]<arr[r]){
                l=mid+1;
            }
            else{
                r=mid;
            }
        }
        return r;
    }
}