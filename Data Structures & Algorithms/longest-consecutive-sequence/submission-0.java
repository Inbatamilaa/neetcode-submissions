class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        int size = 0;
        for (int i : set) {
            ArrayList<Integer> l = new ArrayList<>();
            if (!set.contains(i - 1)) {
                l.add(i);
                while(set.contains(i+1)) {
                    l.add(i+1);
                    i++;
                }
            }
            if (l.size() > size) {
                size = l.size();
            }
        }
        return size;
    }
}
