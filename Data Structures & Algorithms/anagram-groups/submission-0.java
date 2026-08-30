class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
           List<String> ls= new ArrayList<>();
        List<List<String>> lls= new ArrayList<>();

        Map<String,List<String>> mapl = new HashMap<>();
        

        // iterate through all the elements  and get their index , 
        for(int i=0;i<strs.length;i++){
            // for each element add that element in map <sorted string , list<strings> >
            char[] ca = strs[i].toCharArray();
            Arrays.sort(ca);
            String srted = new String(ca);
            //System.out.println("sorted :"+srted+" for :"+strs[i]);
            if(mapl.get(srted) == null){
                List<String> lstring = new ArrayList<>();
                lstring.add(strs[i]);
                mapl.put(srted, lstring);
            }else{
                mapl.get(srted).add(strs[i]);
            }
        }
        for(String name:mapl.keySet()){
            lls.add(mapl.get(name));
        }

        return lls;
    }
}
