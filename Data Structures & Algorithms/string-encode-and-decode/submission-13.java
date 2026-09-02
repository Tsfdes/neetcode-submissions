class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder("");

        for(String s : strs){
            encoded.append((char) s.length()).append(s);
            // System.out.println(encoded);
        }

        return encoded.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        
        for(int i = 0; i < str.length() ;){
            int count = str.charAt(i++);
            list.add(str.substring(i,count+i));
            i += count;
        }

        return list;
    }
}
