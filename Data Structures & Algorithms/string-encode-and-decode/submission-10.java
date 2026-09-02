class Solution {
    public String encode(List<String> strs) {
        // StringBuilder encoded = new StringBuilder("");
        // for (String s : strs) {
        //     encoded.append("*#").append(s.length()).append("*#").append(s);
        // }
        // return encoded.toString();
        StringBuilder ans = new StringBuilder();
        for (String s : strs) {
            ans.append((char) s.length()).append(s);
        }
        return ans.toString();
    }

    public List<String> decode(String s) {

        List<String> ans = new ArrayList<>();
        int i = 0, n = s.length();
        while (i < n) {
            int size = s.charAt(i++);
            ans.add(s.substring(i, i + size));
            i += size;
        }
        return ans;
        // List<String> list = new ArrayList<>();

        // for (int i = 0; i < str.length(); i++) {
        //     if (str.charAt(i) == '*' && i + 1 < str.length() && str.charAt(i + 1) == '#') {

        //         StringBuilder count = new StringBuilder("");
        //         i += 2;
        //         while (str.charAt(i) != '*') {
        //             count.append( str.charAt(i) );
        //             i++;
        //         }

        //         i += 2;
        //         int cnt = Integer.parseInt(count.toString());
        //         StringBuilder st = new StringBuilder("");

        //         while (cnt > 0) {
        //             st.append(str.charAt(i));
        //             i++;
        //             cnt--;
        //         }

        //         list.add(st.toString());
        //         i--;

        //     } else {
              
        //         StringBuilder st = new StringBuilder("");
        //         while (i < str.length()) {
        //             st.append(str.charAt(i));
        //             i++;
        //         }
        //         list.add(st.toString());
        //     }
        // }

        // return list;
    }
}
