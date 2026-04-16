class Solution {
    public boolean isPalindrome(String s) {
        // Strip whitespaces
        s = s.replaceAll("\\s", "");
        // Remove non-alphnumeric characters
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        // Lower the case
        s = s.toLowerCase();
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}
