import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store number and its index
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int complement = target - num;
            
            // Check if the complement is present in the hashmap
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            
            // Add the number and its index to the hashmap
            map.put(num, i);
        }
        
        // If no solution is found (though the problem guarantees exactly one solution)
        throw new IllegalArgumentException("No two sum solution");
    }
}