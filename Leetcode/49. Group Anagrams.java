class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans =  new ArrayList<>();
        HashMap<String, List<String>> hm = new HashMap<>();

        for(String s :strs){
            char[] arr = s.toCharArray();
            Arrays.sort(arr);

            String temp = new String(arr);
            if(hm.containsKey(temp)){
                hm.get(temp).add(s);
            }else{
                List<String> list = new ArrayList<>();
                list.add(s);
                hm.put(temp, list);
            }
        }

        // for(String s : hm.keySet()){
        //     ans.add(hm.get(s));
        // }

        for(List<String> l:hm.values()){
            ans.add(l);
        }
        return ans;
    }
}