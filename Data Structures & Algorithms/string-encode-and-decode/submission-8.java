class Solution {
    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder("");
        for (String s : strs) {
            encoded.append("*#").append(s.length()).append("*#").append(s);
        }
        // System.out.println(encoded);
        return encoded.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*' && i + 1 < str.length() && str.charAt(i + 1) == '#') {
                // System.out.println("if i = -->"+i);


                StringBuilder count = new StringBuilder("");
                i += 2;
                while (str.charAt(i) != '*') {
                    count.append( str.charAt(i) );
                    i++;
                }
                // System.out.println(count);
                // System.out.println(str.charAt(i));
                i += 2;
                // System.out.println(str.charAt(i));
                int cnt = Integer.parseInt(count.toString());
                StringBuilder st = new StringBuilder("");

                while (cnt > 0) {
                    st.append(str.charAt(i));
                    i++;
                    cnt--;
                }

                list.add(st.toString());
                i--;
                // System.out.println(str.length()+" -- "+i);


            } else {
                // System.out.println("else i = -->"+i);
                String st = "";
                while (i < str.length()) {
                    st += str.charAt(i);
                    i++;
                }
                list.add(st);
            }
        }

        return list;
    }
}
