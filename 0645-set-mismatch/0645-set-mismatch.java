class Solution {
    public int[] findErrorNums(int[] nums) {
        // Sorting the array
        Arrays.sort(nums);

        int[] result = new int[2]; // result[0] will store the duplicate, result[1] will store the missing number
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                result[0] = nums[i]; // Duplicate number
            }
        }

        // Finding the missing number
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                result[1] = i + 1; // Missing number
                break;
            }
        }

        return result;
    }
}
