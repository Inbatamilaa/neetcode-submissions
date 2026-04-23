class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();
        for (String s : strs) {
            for (char c : s.toCharArray()) {
                if (c == '.') {
                    encoded.append("/.");
                } else if (c == '/') {
                    encoded.append("//");
                } else {
                    encoded.append(c);
                }
            }
            encoded.append(".");
        }
        return encoded.toString();
    }

    public List<String> decode(String str) {
        List<String> decoded = new ArrayList<>();
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '.') {
                decoded.add(s.toString());
                s.delete(0, s.length());
            } else if (c == '/') {
                c = str.charAt(i + 1);
                s.append(c);
                i++;
            } else {
                s.append(c);
            }
        }
        return decoded;
    }
}
