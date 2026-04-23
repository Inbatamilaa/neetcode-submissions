class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] productArray = new int[nums.length];
        /* int product = 1;
        for (int i : nums) {
            product *= i;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                productArray[i] = 0;
            } else {
                productArray[i] = product / nums[i];
            }
        }
        return productArray;
        */
        // Naive approach N*N
        for (int i = 0; i < nums.length; i++) {
            int product = 1;
            for (int j = 0; j < nums.length; j++) {
                if (j == i) continue;
                product *= nums[j];
            }
            productArray[i] = product;
        }
        return productArray;
    }
}  
