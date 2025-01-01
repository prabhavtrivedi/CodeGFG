class Solution {
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        // code here
        Map<String,Map<Character,Integer>> hm=new HashMap<>();
        for(String s:arr){
            Map<Character,Integer> mp=new HashMap<>();
            for(char c:s.toCharArray()) mp.put(c,mp.getOrDefault(c,0)+1);
            hm.put(s,mp);
        }
        ArrayList<ArrayList<String>> al=new ArrayList<>();
        for(String s:arr){
            if(al.isEmpty()){
                al.add(new ArrayList<>());
                al.get(0).add(s);
                continue;
            }
            boolean placed=false;
            for(int i=0;i<al.size();i++){
                if(frequencyEquality(hm.get(al.get(i).get(0)),hm.get(s))){
                    al.get(i).add(s);
                    placed=true;
                    break;
                }
            }
            if(!placed){
                al.add(new ArrayList<>());
                al.get(al.size()-1).add(s);
            }
        }
        Collections.sort(al,(x,y)->x.get(0).compareTo(y.get(0)));
        return al;
    }
    private boolean frequencyEquality(Map<Character,Integer> hm1,Map<Character,Integer> hm2){
        return hm1.equals(hm2);
    }
}
