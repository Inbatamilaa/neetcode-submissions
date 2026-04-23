class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int zeroCount = 0;
        for (int i : nums) {
            if (i != 0) {
                product *= i;
            } else {
                zeroCount++;
            }
        }
        if (zeroCount > 1) return new int[nums.length];

        int[] productArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (zeroCount > 0) {
                productArray[i] = (nums[i] == 0 ? product : 0);
            } else {
                productArray[i] = product / nums[i];
            }
        }
        return productArray;
        
        // Naive approach N*N
        /*for (int i = 0; i < nums.length; i++) {
            int product = 1;
            for (int j = 0; j < nums.length; j++) {
                if (j == i) continue;
                product *= nums[j];
            }
            productArray[i] = product;
        }
        return productArray;
        */
    }
}  
