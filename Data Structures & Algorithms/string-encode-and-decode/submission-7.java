class Solution {
    public String encode(List<String> strs) {
        String encoded = "";
        for (String s : strs) {
            encoded += ("*#" + s.length() + "*#" + s);
        }
        // System.out.println(encoded);
        return encoded;
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*' && i + 1 < str.length() && str.charAt(i + 1) == '#') {
                // System.out.println("if i = -->"+i);


                String count = "";
                i += 2;
                while (str.charAt(i) != '*') {
                    count += str.charAt(i);
                    i++;
                }
                // System.out.println(count);
                // System.out.println(str.charAt(i));
                i += 2;
                // System.out.println(str.charAt(i));
                int cnt = Integer.parseInt(count);
                String st = "";

                while (cnt > 0) {
                    st += str.charAt(i);
                    i++;
                    cnt--;
                }

                list.add(st);
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
