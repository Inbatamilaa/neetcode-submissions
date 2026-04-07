class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] sStr = s.toCharArray();
        char[] tStr = t.toCharArray();
        Arrays.sort(sStr);
        Arrays.sort(tStr);
        for (int i = 0; i < sStr.length; i++) {
            if (sStr[i] != tStr[i]) return false;
        }
        return true;
    }
}
