class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums==null||nums.length<3){
            return new ArrayList<>();
        }
        int left,right,sum;
         HashSet<List<Integer>> result=new HashSet<>();
         Arrays.sort(nums);
         for(int i=0;i<nums.length-2;i++){
            left=i+1;
            right=nums.length-1;
            while(left<right){
                sum=nums[i]+nums[left]+nums[right];
                if(sum==0){
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                }
                else if(sum<0){
                    left++;
                }
                else{
                    right--;
                }
            }
         }
         return new ArrayList<>(result);
    }
}