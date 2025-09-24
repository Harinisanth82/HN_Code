class Solution {
    public int largestRectangleArea(int[] h) {
        int lgt = h.length,prev = 0;
        if(h == null || h.length == 0) return 0;

        int[] left = new int[lgt];
        left[0] = -1;
        
        int[] right = new int[lgt];
        right[lgt-1] = lgt;

        for(int i = 1 ; i < lgt ; i++){
            prev = i - 1;
            while(prev >= 0 && h[prev] >= h[i]){
                prev = left[prev];
            }
            left[i] = prev;
        }
    
        for(int i = lgt-2 ; i >= 0 ; i--){
            prev = i + 1;
            while(prev < lgt && h[prev] >= h[i]){
                prev = right[prev];
            }
            right[i] = prev;
        }

        int max_area = 0;
        for(int i = 0 ; i < lgt ; i++){
            max_area = Math.max(max_area,h[i] * (right[i] - left[i] - 1));
        }
        return max_area;
    }
}