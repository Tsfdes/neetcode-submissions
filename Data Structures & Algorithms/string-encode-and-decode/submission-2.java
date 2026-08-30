class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb =new StringBuilder("");
        for(String s: strs){
            sb.append("#").append(s.length()).append("#").append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();

       char[] arr = str.toCharArray();
       for(int i =0; i<arr.length; i++){
        if(arr[i]=='#' && i+1< arr.length && Character.isDigit(arr[i+1])){
            int temp = i;
            String ts = "";
            while(arr[++i]!='#'){
                ts+=arr[i];
            }
            int val = Integer.valueOf(ts);
            list.add(str.substring(i+1,i+val+1));
            i+=val;

        }else{
            String ts = "";
            while(i<arr.length){
                ts+=arr[i];
            }
            list.add(ts);

        }
       }
       return list;
    }
}
