class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String,List<String>> map = new HashMap<>();

        for(var str : strs){
            char[] c = str.toCharArray();
            Arrays.sort(c);
            String key = new String(c);
            map.putIfAbsent(key,new ArrayList<String>());
            map.get(key).add(str);
        }
        
        List<List<String>> answer = new ArrayList<>();
        for(var key: map.keySet()){
            answer.add(map.get(key));
        }

        return answer;
    }
}