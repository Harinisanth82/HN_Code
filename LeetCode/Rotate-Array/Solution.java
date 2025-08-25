class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        int[] temp = new int[n];
        k=k%n;
        int i=0,j=0;
        for(i = 0, j = k;i < n-k; i++,j++) temp[j] = nums[i];
        for(j = 0 ; i < n; i++,j++) temp[j] = nums[i];
        for(i = 0; i < n; i++) nums[i] = temp[i];
    }
}