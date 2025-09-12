class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       int lgt_1,lgt_2;
       lgt_1=nums1.length;
       lgt_2=nums2.length;
       int[] res=new int[lgt_1];
       for(int i = 0; i < lgt_1 ; i++){
            res[i]=-1;
            boolean found=false;
            for(int j = 0; j < lgt_2; j++){
                if(nums1[i]==nums2[j]){
                    found=true;
                }
                if(found && nums2[j]>nums1[i]){
                    res[i]=nums2[j];
                    break;
                }
            }
       }
       return res;  
    }
}