package Arrays;

import java.util.HashMap;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        // HashMap to store value as key and its index as value
        HashMap<Integer, Integer> map = new HashMap<>();

        // Traverse the array once
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // Find the number we need

            // If complement is already in the map, solution found
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            // Otherwise, add current number to map
            map.put(nums[i], i);
        }

        // No solution found
        return new int[] {};
    }
}
