class Solution {
    public int[] productExceptSelf(int[] nums) {
        // Division approach with logic to handle zeros
        /*int product = 1;
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
        */
        
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
        int size = nums.length;
        int[] prefix = new int[size];
        int[] suffix = new int[size];
        int[] products = new int[size];

        // Build the prefix array
        prefix[0] = 1; // no element to the left of the first element
        for (int i = 1; i < size; i++) {
            prefix[i] = nums[i - 1] * prefix[i - 1];
        }
        // Build the suffix array
        suffix[size - 1] = 1; // no element to the right of the last element
        for (int i = size - 2; i >= 0; i--) {
            suffix[i] = nums[i + 1] * suffix[i + 1];
        }
        // Compute the products using the prefix and the suffix array
        for (int i = 0; i < size; i++) {
            products[i] = prefix[i] * suffix[i];
        }
        return products;
    }
}  
