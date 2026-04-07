class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int[] result = {0, 0};
        for (int i = 0; i < nums.length; i++) {
            int compliment = target - nums[i];
            if (freq.containsKey(compliment)) {
                result[0] = freq.get(compliment);
                result[1] = i;
                break;
            } else {
                freq.put(nums[i], i);
            }
        }
        return result;
    }
}
