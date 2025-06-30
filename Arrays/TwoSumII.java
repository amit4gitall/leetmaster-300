package Arrays;

public class TwoSumII {

    public int[] twoSum(int[] numbers, int target) {
        int left = 0; // Start pointer at beginning
        int right = numbers.length - 1; // End pointer at end

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                // Add 1 to convert from 0-based to 1-based indices
                return new int[] { left + 1, right + 1 };
            } else if (sum < target) {
                left++; // Increase left pointer if sum is too small
            } else {
                right--; // Decrease right pointer if sum is too big
            }
        }

        return new int[] {}; // No solution found
    }
}
