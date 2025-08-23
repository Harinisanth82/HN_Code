class Solution {
    public int maxArea(int[] height) {
        int max_area,area,lgt,l,r;
        max_area = 0; 
        l=0;
        r=height.length-1;
        while(l<=r){
            area=(r-l)*Math.min(height[l],height[r]);
            max_area=Math.max(area,max_area);
            if(height[l]<height[r]){
                l+=1;
            }
            else if(height[l]==height[r]){
                l++;
                r--;
            }
            else{
                r-=1;
            }
        }
        return max_area;
    }
}